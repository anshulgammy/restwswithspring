package com.techbrunch.boostrap.webapplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.techbrunch.boostrap.webapplication.models.Student;
import com.techbrunch.boostrap.webapplication.services.RestService;
import com.techbrunch.boostrap.webapplication.util.CommonUtil;
import com.techbrunch.boostrap.webapplication.util.ResourceNotFoundException;

@Controller
@RequestMapping("/testtherest")
public class RestController {

	@Autowired
	private RestService service;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Student> findAll() {
		return service.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Student findOne(@PathVariable("id") Long id) throws ResourceNotFoundException {
		return CommonUtil.checkNotNull(service.findOne(id));
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public List<Student> create(@RequestBody Student student) {
		return service.create(student);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") Long id, @RequestBody Student student) throws ResourceNotFoundException {
		CommonUtil.checkNotNull(student);
		CommonUtil.checkNotNull(service.getById(student.getId()));
		service.update(student);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable("id") Long id) {
		service.deleteById(id);
	}
}
