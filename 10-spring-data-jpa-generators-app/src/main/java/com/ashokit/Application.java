package com.ashokit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entities.Student;
import com.ashokit.repositories.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntxt = SpringApplication.run(Application.class, args);
		StudentRepository bean = cntxt.getBean(StudentRepository.class) ;
		
		Student s=new Student();
		s.setStudentName("Sriman");
		s.setStudentEmail("sriman001@gmail.com");
		s.setStudentAge(42);
		
		Student studentEntity=bean.save(s);
		System.out.println(studentEntity);
	}
}
