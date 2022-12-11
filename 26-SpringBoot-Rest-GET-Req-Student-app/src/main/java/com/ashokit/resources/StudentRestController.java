package com.ashokit.resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.ashokit.response.Student;

@RestController
public class StudentRestController {

	@GetMapping(value = "/student/{sid}", produces= {"application/json", "application/xml"})
	public Student getStudentDetails(@PathVariable("sid") Integer studentId) {
		Student s = new Student();
		if (studentId == 101) {
			s.setStudentId(101);
			s.setStudentName("Raju");
			s.setStudentSkill("Java");
		} else if (studentId == 102) {
			s.setStudentId(102);
			s.setStudentName("Rani");
			s.setStudentSkill("Testing");
		}
		return s;
	}

}
