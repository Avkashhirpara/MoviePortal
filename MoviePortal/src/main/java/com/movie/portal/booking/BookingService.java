package com.movie.portal.booking;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.portal.constant.PaymentStatus;
import com.movie.portal.entity.BookSeat;
import com.movie.portal.entity.Booking;
import com.movie.portal.entity.Show;
import com.movie.portal.show.ShowRepository;

@Service
public class BookingService {

	BookingRepository bookingRepository;
	ShowRepository showRepository;
	
	@Autowired
	private KieContainer kieContainer;

	@Autowired
	public void setBookingRepository(BookingRepository bookingRepository) {
		this.bookingRepository = bookingRepository;
	}

	@Autowired
	public void setShowRepository(ShowRepository showRepository) {
		this.showRepository = showRepository;
	}

	public BookingConfirmationDTO reserverBooking(BookingDTO booking) {

		/// make a call to theater system to reserver the seats and then insert
		// same info to portal db.

		Booking bEntity = new Booking();
		bEntity.setUid(booking.getUid());
		bEntity.setShowid(booking.getShowId());
		bEntity.setTotalSeat(booking.getSeats().size());
		bEntity.setPaymentStatus(PaymentStatus.PENDING);
		bEntity.setStatus(PaymentStatus.BLOCK);
		bEntity = bookingRepository.insertBooking(bEntity);

		for (int sid : booking.getSeats()) {
			bookingRepository.saveSeat(new BookSeat(0, bEntity.getId(), sid));
		}

		BookingConfirmationDTO confirmation = bookingRepository.getBookingConfirmation(bEntity.getShowid(),
				booking.getSeats());

		Show show = showRepository.getShowById(bEntity.getShowid());
		
		
		
		bEntity.setTotalAmount(confirmation.getTotalPayment());
		
		
		applyDiscount(bEntity,show); 
		
		confirmation.setTotalDiscount(bEntity.getTotalDiscount());
		
		bookingRepository.updateBooking(bEntity);
		confirmation.setBookingid((int) bEntity.getId());
		confirmation.setShowId((int) bEntity.getShowid());
		return confirmation;
	}
	
	

	public Booking confirmBooking(long bookingId) {

		/// make a call to theater system to reserver the seats and then insert
		// same info to portal db.

		Booking bEntity = bookingRepository.getBooking(bookingId);
		bEntity.setPaymentStatus(PaymentStatus.SUCCESSFULL);
		bEntity.setStatus(PaymentStatus.BOOKED);
		bEntity = bookingRepository.updateBooking(bEntity);

		return bEntity;
	}

	public Booking cancelBooking(long bookingId) {

		/// make a call to theater system to reserver the seats and then insert
		// same info to portal db.

		Booking bEntity = bookingRepository.getBooking(bookingId);
		bEntity.setPaymentStatus(PaymentStatus.REFUND_INITIATED);
		bEntity.setStatus(PaymentStatus.CANCELED);
		bEntity = bookingRepository.updateBooking(bEntity);

		return bEntity;
	}
	public void applyDiscount(Booking bEntity,Show show) {
		
		 KieSession kieSession = kieContainer.newKieSession();
	        kieSession.insert(show);
	        kieSession.insert(bEntity);
	        kieSession.fireAllRules();
	        kieSession.dispose();
	        System.out.println(bEntity);
	}

}
