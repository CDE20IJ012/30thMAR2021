package com.cts.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
@Id
private int id;
private String title;
private float price;


public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(int id, String title, float price) {
	super();
	this.id = id;
	this.title = title;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}


}
