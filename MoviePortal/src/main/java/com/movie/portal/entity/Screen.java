package com.movie.portal.entity;


public class Screen {

  private long id;
  private long pid;
  private String screenName;
  private String screenLocation;
  private long totalSeat;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getPid() {
    return pid;
  }

  public void setPid(long pid) {
    this.pid = pid;
  }


  public String getScreenName() {
    return screenName;
  }

  public void setScreenName(String screenName) {
    this.screenName = screenName;
  }


  public String getScreenLocation() {
    return screenLocation;
  }

  public void setScreenLocation(String screenLocation) {
    this.screenLocation = screenLocation;
  }


  public long getTotalSeat() {
    return totalSeat;
  }

  public void setTotalSeat(long totalSeat) {
    this.totalSeat = totalSeat;
  }

}
