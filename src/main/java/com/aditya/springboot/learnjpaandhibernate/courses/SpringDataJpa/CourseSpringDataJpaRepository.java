package com.aditya.springboot.learnjpaandhibernate.courses.SpringDataJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditya.springboot.learnjpaandhibernate.courses.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
	
	//custom methods-follow naming conditions
	List<Course> findByAuthor(String author);
	
	//custom methods-follow naming conditions
	List<Course> findByName(String name);

}
 