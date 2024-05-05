package com.aditya.springboot.learnjpaandhibernate.courses.BasicJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aditya.springboot.learnjpaandhibernate.courses.Course;

@Component
public class CourseBasicJPACommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseBasicJPARepository repository;
	
	
	@Override
	public void run(String... args) throws Exception {

		repository.insert(new Course(1,"Learn Azure JPA" , "JPA Atmiya"));
		repository.insert(new Course(2,"Learn Google Cloud JPA" , "JPA ADITYA"));
		repository.insert(new Course(3,"Learn AWS JPA" , "JPA Anand"));
		
		
		repository.deleteById(2);
		
		repository.insert(new Course(2,"Learn Google Cloud JPA" , "ADITYA"));
		
		System.out.println(repository.findById(3));
		
		
	}

}
