package com.incture.firstapplication.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.incture.firstapplication.dao.StudentRepository;
import com.incture.firstapplication.entites.Student;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

	@Mock
	private StudentRepository studentRepo;
	
	@InjectMocks
	private StudentService studentService;
	
	private List<Student> list;
	
	@BeforeEach
	public void before()
	{
		Student s1=new Student(1, "A", "Bangalore");
		Student s2=new Student(2,"B","Mysore");
		list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
	}
	
	@Test
	void testGetAllStudent() {
		
		when(studentRepo.findAll()).thenReturn(list);
		
		List<Student> result=studentService.getAllStudent();
		
		assertEquals(3, result.size());
		assertEquals("A", result.get(0).getName());
		assertEquals("B", result.get(1).getName());
	}

}
