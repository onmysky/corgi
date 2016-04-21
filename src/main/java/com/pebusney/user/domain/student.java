package com.pebusney.user.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author mark
 * @since 2016-04-20 23:46.
 */
@Entity
@Table(name = "student")
public class Student {

  @Id
  @GeneratedValue
  private long id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private Long stuId;

  @Column(nullable = false)
  private int  age;

  @Column(nullable = false)
  private int  sex;

  @Column(nullable = false)
  private String phoneNumber;

  @Column(nullable = false)
  private String nation;

  @Column(nullable = false)
  private Date gmtCreate;

  @Column(nullable = false)
  private Date gmtUpdate;

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

  public Long getStuId() {
    return stuId;
  }

  public void setStuId(Long stuId) {
    this.stuId = stuId;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }

  public Date getGmtCreate() {
    return gmtCreate;
  }

  public void setGmtCreate(Date gmtCreate) {
    this.gmtCreate = gmtCreate;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getNation() {
    return nation;
  }

  public void setNation(String nation) {
    this.nation = nation;
  }

  public Date getGmtUpdate() {
    return gmtUpdate;
  }

  public void setGmtUpdate(Date gmtUpdate) {
    this.gmtUpdate = gmtUpdate;
  }
}