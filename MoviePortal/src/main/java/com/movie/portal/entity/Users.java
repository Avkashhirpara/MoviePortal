package com.movie.portal.entity;


public class Users {

  private long uid;
  private String username;
  private String password;
  private String name;
  private java.sql.Date dob;
  private String city;
  private String state;


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public java.sql.Date getDob() {
    return dob;
  }

  public void setDob(java.sql.Date dob) {
    this.dob = dob;
  }


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

}
