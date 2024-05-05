package com.aditya.springboot.learnjpaandhibernate.courses.SpringJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aditya.springboot.learnjpaandhibernate.courses.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception {

		repository.insert(new Course(1,"Learn Azure" , "Atmiya"));
		repository.insert(new Course(2,"Learn Google Cloud" , "ADITYA"));
		repository.insert(new Course(3,"Learn AWS" , "Anand"));
		
		
		repository.deleteById(2);
		
		repository.insert(new Course(2,"Learn Google Cloud" , "ADITYA"));
		
		System.out.println(repository.selectCourseFindById(3));
		
		
	}

}
