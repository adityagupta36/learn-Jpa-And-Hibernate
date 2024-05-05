package com.aditya.springboot.learnjpaandhibernate.courses.SpringDataJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aditya.springboot.learnjpaandhibernate.courses.Course;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception {

		repository.save(new Course(1,"Learn Azure Spring Data Jpa" , "Atmiya"));
		repository.save(new Course(2,"Learn Google Cloud Spring Data Jpa" , "ADITYA"));
		repository.save(new Course(3,"Learn AWS Spring Data Jpa" , "Anand"));
		
		//deleteById
		repository.deleteById(2l);
		
		//save
		repository.save(new Course(2l,"Learn Google Cloud Spring Data Jpa" , "ADITYA"));
		
		//findById
		System.out.println(repository.findById(3l));
		
		
		//Returns all instances of the type.
		System.out.println(repository.findAll());
		
		//Returns the number of entities available.
		System.out.println(repository.count());
		
		
		System.out.println(repository.findByAuthor("ADITYA"));
		
		System.out.println(repository.findByName("Learn AWS Spring Data Jpa"));

		
		
	}

}
