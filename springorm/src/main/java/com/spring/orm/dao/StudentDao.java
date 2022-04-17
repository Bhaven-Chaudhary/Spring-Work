package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;



public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	
	//insert method
	@Transactional
	public int insert(Student student){
		
		Integer result = (Integer)hibernateTemplate.save(student);		
		return result;
	}
	
	//get single student
	public Student getStudent(int id){
	Student student = hibernateTemplate.get(Student.class, id);
	return student;
	}
	
	//get all student 
	public List<Student>  getAllStudent(){
		List<Student> students = hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//update
	public void update(Student student){
		hibernateTemplate.update(student);
	}
	
	//delete
	public void delete(int id){
		Student student = hibernateTemplate.get(Student.class, id);
		hibernateTemplate.delete(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
