package com.demo.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address33")
public class Address {
   @Id
  private int aid;
  private String street;
  private String city;
  private String State;
public Address() {
	super();
}
public Address(int aid, String street, String city, String state) {
	super();
	this.aid = aid;
	this.street = street;
	this.city = city;
	State = state;
}
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
@Override
public String toString() {
	return "Address [aid=" + aid + ", street=" + street + ", city=" + city + ", State=" + State + "]";
}
  
}
