package org.jsp.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Student;

public class Student_Dao {
	
	public void saveStudent(Student student) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("SCHOOL");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
	
	public void updateStudent(Student student) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("SCHOOL");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		
	}

	public void findStudent() {
		
	}
}
