package com.zettro.rentacar.service;

import com.zettro.rentacar.model.Student;

public interface StudentService {
	Student save(Student student);
	Student findById(Integer id);
}
