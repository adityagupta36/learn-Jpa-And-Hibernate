package com.aditya.springboot.learnjpaandhibernate.courses.BasicJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aditya.springboot.learnjpaandhibernate.courses.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseBasicJPARepository {

//	@Autowired
	@PersistenceContext
	EntityManager entitymanager;
	
	public void insert(Course course) {
		entitymanager.merge(course);
	}
	
	public Course findById(long id) {
		return entitymanager.find(Course.class, id);
	}
	
	public void deleteById(long id) {
		
		//1 - find the particular course
		Course course = entitymanager.find(Course.class, id);
		
		//2 - then remove the course
		entitymanager.remove(course);
	}
}
