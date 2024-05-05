package com.aditya.springboot.learnjpaandhibernate.courses;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id                       //Specifies the primary key of an entity [under JPA]
	private long id;
	 
	@Column(name="name")      //[under JPA]
	private String name;
	
	@Column(name="author")    //[under JPA]
	private String author;
	
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public Course(long id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public Course() {
		
	}

	
	
	
}
