package com.movie.portal.booking;

import java.sql.Time;
import java.util.List;

import com.movie.portal.entity.Seat;

public class BookingConfirmationDTO {
	
	private int bookingid;
	private int showId; 
	private String movieName;
	private String theaterName; 
	private String screenName; 
	private String ScreenLocation; 
	private String language; 
	private String technology; 
	private Time startTime;
	private double totalPayment; 
	private double totalDiscount; 
	private List<SeatDTO> seats;
	
	
	
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String getScreenLocation() {
		return ScreenLocation;
	}
	public void setScreenLocation(String screenLocation) {
		ScreenLocation = screenLocation;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public double getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}
	public double getTotalDiscount() {
		return totalDiscount;
	}
	public void setTotalDiscount(double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}
	public List<SeatDTO> getSeats() {
		return seats;
	}
	public void setSeats(List<SeatDTO> seats) {
		this.seats = seats;
	}
	

}
