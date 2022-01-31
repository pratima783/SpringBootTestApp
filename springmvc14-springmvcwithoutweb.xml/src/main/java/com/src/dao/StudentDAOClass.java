package com.src.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.src.model.Student;

public class StudentDAOClass implements StudentDAOInterface{

	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public int insertStudent(Student s) {
		// TODO Auto-generated method stub
		String sqlquery="insert into student121 values('"+s.getSudentId()+"','"+s.getStudentPassword()+"','"+s.getStuentName()+"','"+s.getStudentAge()+"','"+s.getStudentAddress()+"','"+s.getStuentMobile()+"')";
		
		return jdbctemplate.update(sqlquery);
	}

}
