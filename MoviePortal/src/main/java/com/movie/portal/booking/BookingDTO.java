package com.movie.portal.booking;

import java.util.List;

public class BookingDTO {

	private long showId;
	private long uid;
	private List<Integer> seats;

	public BookingDTO() {
	}

	public BookingDTO(long showId, long uid, List<Integer> seats) {
		this.showId = showId;
		this.uid = uid;
		this.seats = seats;
	}

	public long getShowId() {
		return showId;
	}

	public void setShowId(long showId) {
		this.showId = showId;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public List<Integer> getSeats() {
		return seats;
	}

	public void setSeats(List<Integer> seats) {
		this.seats = seats;
	}

}
