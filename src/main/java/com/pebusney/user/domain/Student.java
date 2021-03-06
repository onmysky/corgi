package com.pebusney.user.domain;

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
  private Long sno;

  @Column(nullable = false)
  private String className = "";

  @Column(nullable = false)
  private String major = "";

  @Column(nullable = false)
  private String name = "";

  @Column(nullable = false)
  private String password = "";

  @Column(nullable = false)
  private int  age = 0;

  @Column(nullable = false)
  private int  sex  = 0;

  @Column(nullable = false)
  private String phoneNumber = "";

  @Column(nullable = false)
  private String nation = "";

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Long getSno() {
    return sno;
  }

  public void setSno(Long sno) {
    this.sno = sno;
  }

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

}
