package com.movie.portal.entity;


public class Staff {

  private long uid;
  private long partnerId;
  private long rollId;
  private String username;
  private String password;
  private String name;
  private java.sql.Date dob;
  private String docId;
  private String docName;


  public long getUid() {
    return uid;
  }

  public void setUid(long uid) {
    this.uid = uid;
  }


  public long getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(long partnerId) {
    this.partnerId = partnerId;
  }


  public long getRollId() {
    return rollId;
  }

  public void setRollId(long rollId) {
    this.rollId = rollId;
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


  public String getDocId() {
    return docId;
  }

  public void setDocId(String docId) {
    this.docId = docId;
  }


  public String getDocName() {
    return docName;
  }

  public void setDocName(String docName) {
    this.docName = docName;
  }

}
