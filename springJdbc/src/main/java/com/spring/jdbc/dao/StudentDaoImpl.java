package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbctemplate;

	// insert method
	public int insert(Student student) {
		String querry = "insert into student(id,name,city) values(?,?,?)";

		int result = jdbctemplate.update(querry, student.getId(), student.getName(), student.getCity());
		return result;
	}
	
	public int change(Student student) {
		String querry = "update student set name=? , city = ? where id=?";
		int result = jdbctemplate.update(querry,student.getName(), student.getCity(), student.getId());
		return result;
	}

	public int delete(int id) {
		String querry = "delete from student where id=?";
		int result = jdbctemplate.update(querry,id);
		return result;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	



	
}
