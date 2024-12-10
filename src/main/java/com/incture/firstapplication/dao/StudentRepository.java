package com.incture.firstapplication.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.incture.firstapplication.entites.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

	@Query("select case when count(s) > 0 then true else false end from Student s where s.id=id")
	boolean isStudentExistById(Integer id);
}
