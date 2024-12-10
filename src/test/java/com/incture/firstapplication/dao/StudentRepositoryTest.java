package com.incture.firstapplication.dao;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.incture.firstapplication.entites.Student;

@DataJpaTest
@ExtendWith(SpringExtension.class)
class StudentRepositoryTest {

	@Autowired
	private StudentRepository studentRepo;
	@Test
	void testIsStudentExistById() {
		Student student=new Student(888, "X", "Mysore");
		studentRepo.save(student);
		
		boolean actualResult=studentRepo.isStudentExistById(888);
		assertThat(actualResult).isTrue();
	}
	
//	@AfterEach
//	public void after()
//	{
//		studentRepo.deleteAll();
//	}

}
