package com.movie.portal.booking;


public class SeatDTO {
	
	private String seatNo;
	private String Section;
	private double price;
	public SeatDTO(String seatNo, String section, double price) {
		
		this.seatNo = seatNo;
		Section = section;
		this.price = price;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
