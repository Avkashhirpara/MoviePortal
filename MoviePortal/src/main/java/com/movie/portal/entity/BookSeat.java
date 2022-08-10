package com.movie.portal.entity;


public class BookSeat {

  private long id;
  private long bookingId;
  private long seatId;


  public BookSeat() {
	  
  }
  
  public BookSeat(long id, long bookingId, long seatId) {

	this.id = id;
	this.bookingId = bookingId;
	this.seatId = seatId;
}

public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getBookingId() {
    return bookingId;
  }

  public void setBookingId(long bookingId) {
    this.bookingId = bookingId;
  }


  public long getSeatId() {
    return seatId;
  }

  public void setSeatId(long seatId) {
    this.seatId = seatId;
  }

}