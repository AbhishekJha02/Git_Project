package com.incture.firstapplication.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.firstapplication.dao.StudentRepository;
import com.incture.firstapplication.entites.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	private static final Logger LOGGER=LoggerFactory.getLogger(StudentService.class);
	
	public List<Student> getAllStudent()
	{
		List<Student> list=(List<Student>) this.studentRepository.findAll();
		return list;
	}
	public Student getStudent(int id)
	{
		Student s1=(this.studentRepository.findById(id)).get();
		return s1;
	}
	public Student addStudent(Student s)
	{
		LOGGER.info("Student is added in the DB");
		LOGGER.warn("Student is added in the DB");
		LOGGER.error("Student is added in the DB");
		LOGGER.debug("Student is added in the DB");
		LOGGER.trace("Student is added in the DB");
		System.out.println("Student is added in the DB");
		Student s1= this.studentRepository.save(s);
		return s1;
	}
	public void deleteStudent(int id)
	{
		this.studentRepository.deleteById(id);
	}
	public Student updateStudent(Student s, int id)
	{
		s.setId(id);
		Student s1= this.studentRepository.save(s);
		return s1;
	}

}
