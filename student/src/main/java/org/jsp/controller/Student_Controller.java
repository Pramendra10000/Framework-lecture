package org.jsp.controller;

import org.jsp.dao.Student_Dao;
import org.jsp.dto.Student;

public class Student_Controller {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setId(1);
		student.setName("Ankita Mane");
		student.setEmail("ankitamane123@gmail.com");
		
		Student_Dao dao=new Student_Dao();
		//dao.saveStudent(student);
		dao.updateStudent(student);

	}

}
