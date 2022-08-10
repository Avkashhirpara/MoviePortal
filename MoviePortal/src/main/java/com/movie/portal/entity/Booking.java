package com.movie.portal.entity;


public class Booking {

  private long id;
  private long uid;
  private long showid;
  private long totalSeat;
  private double totalAmount;
  private long discountId;
  private double totalDiscount;
  private long paymentStatus;
  private long status;

  
  public Booking() {
	  
  }
		  

  public Booking(long id, long uid, long showid, long totalSeat, double totalAmount, long discountId,
		double totalDiscount, long paymentStatus, long status) {
	
	this.id = id;
	this.uid = uid;
	this.showid = showid;
	this.totalSeat = totalSeat;
	this.totalAmount = totalAmount;
	this.discountId = discountId;
	this.totalDiscount = totalDiscount;
	this.paymentStatus = paymentStatus;
	this.status = status;
}

public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public long getShowid() {
	return showid;
}

public void setShowid(long showid) {
	this.showid = showid;
}

public long getTotalSeat() {
    return totalSeat;
  }

  public void setTotalSeat(long totalSeat) {
    this.totalSeat = totalSeat;
  }


  public double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(double totalAmount) {
    this.totalAmount = totalAmount;
  }


  public long getDiscountId() {
    return discountId;
  }

  public void setDiscountId(long discountId) {
    this.discountId = discountId;
  }


  public double getTotalDiscount() {
    return totalDiscount;
  }

  public void setTotalDiscount(double totalDiscount) {
    this.totalDiscount = totalDiscount;
  }


  public long getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(long paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

}
