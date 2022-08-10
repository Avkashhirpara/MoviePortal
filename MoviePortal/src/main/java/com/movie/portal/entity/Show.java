package com.movie.portal.entity;


public class Show {

  private long id;
  private long screenId;
  private String name;
  private String description;
  private String language;
  private String technology;
  private java.sql.Date fromDate;
  private java.sql.Date toDate;
  private java.sql.Time startTime;
  private java.sql.Time endTime;
  private long status;
  private long bookedSeat;
  private long createdby;
  private java.sql.Timestamp createddate;


  
  public long getBookedSeat() {
	return bookedSeat;
}

public void setBookedSeat(long bookedSeat) {
	this.bookedSeat = bookedSeat;
}

public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getScreenId() {
    return screenId;
  }

  public void setScreenId(long screenId) {
    this.screenId = screenId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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


  public java.sql.Date getFromDate() {
    return fromDate;
  }

  public void setFromDate(java.sql.Date fromDate) {
    this.fromDate = fromDate;
  }


  public java.sql.Date getToDate() {
    return toDate;
  }

  public void setToDate(java.sql.Date toDate) {
    this.toDate = toDate;
  }


  public java.sql.Time getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Time startTime) {
    this.startTime = startTime;
  }


  public java.sql.Time getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Time endTime) {
    this.endTime = endTime;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getCreatedby() {
    return createdby;
  }

  public void setCreatedby(long createdby) {
    this.createdby = createdby;
  }


  public java.sql.Timestamp getCreateddate() {
    return createddate;
  }

  public void setCreateddate(java.sql.Timestamp createddate) {
    this.createddate = createddate;
  }

}
