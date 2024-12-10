package com.incture.firstapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.incture.firstapplication.entites.Student;
import com.incture.firstapplication.service.StudentService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(path = "/students", method = RequestMethod.GET)
	public List<Student> getAllStudent()
	{
		List<Student> list=this.studentService.getAllStudent();
		return list;
	}
	
	@RequestMapping(path = "/student", method = RequestMethod.POST)
	public Student addStudent(@RequestBody Student s)
	{
		Student s1=this.studentService.addStudent(s);
		return s1;
	}
	
	//@RequestMapping(path = "/student/{st_id}", method = RequestMethod.GET)
	@GetMapping("/student/{st_id}")
	public Student getStudent(@PathVariable("st_id") int id)
	{
		Student s1=this.studentService.getStudent(id);
		return s1;
	}
	
	@DeleteMapping("/student/{st_id}")
	public void deleteStudent(@PathVariable("st_id") int id)
	{
		this.studentService.deleteStudent(id);
	}
	
	@PutMapping("/student/{st_id}")
	public Student updateStudent(@RequestBody Student s, 
			@PathVariable("st_id") int id)
	{
		Student s1=this.studentService.updateStudent(s, id);
		return s1;
	
	}

}
