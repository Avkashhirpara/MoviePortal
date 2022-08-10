package com.movie.portal.entity;


public class Partner {

  private long id;
  private String name;
  private long docid;
  private String city;
  private String location;


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


  public long getDocid() {
    return docid;
  }

  public void setDocid(long docid) {
    this.docid = docid;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

}
