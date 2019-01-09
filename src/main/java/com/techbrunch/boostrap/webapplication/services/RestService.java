package com.techbrunch.boostrap.webapplication.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.techbrunch.boostrap.webapplication.models.Student;
import com.techbrunch.boostrap.webapplication.util.ResourceNotFoundException;

@Service
public class RestService {

	public static final List<Student> STUDENT_LIST = new ArrayList<Student>();

	public List<Student> findAll() {
		return STUDENT_LIST;
	}

	public Student findOne(final Long id) throws ResourceNotFoundException {
		final int studentIndex = findStudentIndexById(id);
		if (-1 != studentIndex) {
			return STUDENT_LIST.get(studentIndex);
		} else {
			throw new ResourceNotFoundException();
		}
	}

	public void update(final Student student) {
		final int studentIndex = findStudentIndexById(student.getId());
		if (-1 != studentIndex) {
			STUDENT_LIST.set(studentIndex, student);
		}
	}

	public Student getById(final Long id) {
		final int studentIndex = findStudentIndexById(id);
		return STUDENT_LIST.get(studentIndex);
	}

	public void deleteById(final Long id) {
		final int studentIndex = findStudentIndexById(id);
		if (-1 != studentIndex) {
			STUDENT_LIST.remove(studentIndex);
		}
	}

	public List<Student> create(final Student student) {
		System.out.println("Inside Create");
		System.out.println(student.getName());
		STUDENT_LIST.add(student);
		return STUDENT_LIST;
	}

	private int findStudentIndexById(final Long id) {
		for (Student student : STUDENT_LIST) {
			if (id.longValue() == student.getId().longValue()) {
				return STUDENT_LIST.indexOf(student);
			}
		}
		return -1;
	}
}
