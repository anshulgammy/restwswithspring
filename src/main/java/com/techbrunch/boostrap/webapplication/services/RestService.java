package com.techbrunch.boostrap.webapplication.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.techbrunch.boostrap.webapplication.models.Student;

@Service
public class RestService {

	public static final List<Student> STUDENT_LIST = new ArrayList<Student>();

	public List<Student> findAll() {
		return STUDENT_LIST;
	}

	public Student findOne(final Long id) {
		return findStudentById(id);
	}

	public void update(final Student student) {
		Student searchedStudent = findStudentById(student.getId());
		if (null != searchedStudent) {
			searchedStudent = student;
		}
	}

	public Student getById(final Long id) {
		return findStudentById(id);
	}

	public void deleteById(final Long id) {
		Student searchedStudent = findStudentById(id);
		if (null != searchedStudent) {
			STUDENT_LIST.remove(searchedStudent);
		}
	}

	public List<Student> create(final Student student) {
		STUDENT_LIST.add(student);
		return STUDENT_LIST;
	}

	private Student findStudentById(final Long id) {
		for (Student student : STUDENT_LIST) {
			if (id.longValue() == student.getId().longValue()) {
				return student;
			}
		}
		return null;
	}
}
