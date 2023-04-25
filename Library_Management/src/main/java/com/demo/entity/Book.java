package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	private int bid;
	private String name;
	private String author;

	public Book() {
		super();
		
	}
	public Book(int bid, String name, String author) {
		super();
		this.bid = bid;
		this.name = name;
		this.author = author;

	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
