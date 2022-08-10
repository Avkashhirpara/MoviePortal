package com.movie.portal.entity;


public class DiscountRules {

  private long id;
  private String name;
  private String description;
  private long showId;
  private long createdBy;
  private java.sql.Timestamp caratedDate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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


  public long getShowId() {
    return showId;
  }

  public void setShowId(long showId) {
    this.showId = showId;
  }


  public long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(long createdBy) {
    this.createdBy = createdBy;
  }


  public java.sql.Timestamp getCaratedDate() {
    return caratedDate;
  }

  public void setCaratedDate(java.sql.Timestamp caratedDate) {
    this.caratedDate = caratedDate;
  }

}
