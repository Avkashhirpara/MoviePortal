package com.movie.portal.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.portal.entity.Booking;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/movieportal/v1/")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class BookingController {

	
	BookingService bookingService; 
	
	@Autowired
	public void setBookingService(BookingService bookingService) {
		this.bookingService = bookingService;
	}


	  
	@PostMapping("/reserverSeats")
	ResponseEntity<BookingConfirmationDTO> reserveBooking(@RequestBody BookingDTO booking) {
		BookingConfirmationDTO  confirmation = bookingService.reserverBooking(booking);
		return new ResponseEntity<>(confirmation, HttpStatus.CREATED);
	}
	
	@GetMapping("/confirmBooking/{bookingId}")
	ResponseEntity<Booking> confirmBooking(@PathVariable long bookingId) {
		Booking  confirmation = bookingService.confirmBooking(bookingId);
		return new ResponseEntity<>(confirmation, HttpStatus.CREATED);
	}
	
	@GetMapping("/cancelBooking/{bookingId}")
	ResponseEntity<Booking> cancelBooking(@PathVariable long bookingId) {
		Booking  confirmation = bookingService.cancelBooking(bookingId);
		return new ResponseEntity<>(confirmation, HttpStatus.CREATED);
	}
	
	
	
	

}
