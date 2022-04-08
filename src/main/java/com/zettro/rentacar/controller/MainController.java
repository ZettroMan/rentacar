package com.zettro.rentacar.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zettro.rentacar.model.Student;
import com.zettro.rentacar.service.StudentService;

@RestController
public class MainController {
	
	private StudentService studentService;
	
	public MainController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping("/hello")
	public String greating() {
		return "Hello from GET";
	}
	
	@PostMapping("/hello")
	public String greating2() {
		return "Hello from POST";
	}
	
	@PostMapping("/student")
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> fetchStudent(@PathVariable Integer id) {
		Student student = studentService.findById(id);
		if(student == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok().body(student);
			
		}
	}

}
