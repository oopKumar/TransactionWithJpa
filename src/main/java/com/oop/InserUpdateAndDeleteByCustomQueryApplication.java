package com.oop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.oop.repo.StudentRepository;

@SpringBootApplication
public class InserUpdateAndDeleteByCustomQueryApplication {

	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(InserUpdateAndDeleteByCustomQueryApplication.class, args);
		StudentRepository repo = context.getBean(StudentRepository.class);
		//Delete method
		//delete(repo);
		//Update Method
		//updateStudent(repo);
		
		//Insert Method
		insertStudent(repo);
	}
	
	private static void updateStudent(StudentRepository repo) {
		System.out.println("Update Metohd Called");
		repo.updateStudent("Female", 7);
	}

	public static void delete(StudentRepository repo) {
		System.out.println("Delete By Id");
		repo.deleteStudent(9);
		
	}
	public static void insertStudent(StudentRepository repo) {
		System.out.println("Insert Method Called");
		repo.insertStudent(1101,"stya","Male",10l);
	}
}
