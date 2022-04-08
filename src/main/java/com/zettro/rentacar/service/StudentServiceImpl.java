package com.zettro.rentacar.service;

import org.springframework.stereotype.Service;

import com.zettro.rentacar.model.Student;
import com.zettro.rentacar.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	public Student findById(Integer id) {
		return studentRepository.findById(id).orElse(null);
	}
	
}
