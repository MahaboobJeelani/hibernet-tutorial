package org.jsp.mamytomanyuni.controller;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;
import org.jsp.mamytomanyuni.dto.Batch;
import org.jsp.mamytomanyuni.dto.Student;

public class SaveBranchAndStudent {

	public static void main(String[] args) {
		Batch b1 = new Batch();
		b1.setBranch_code("JAF-HAHBCJ_A1");
		b1.setSubject("Java");
		b1.setTrainer("Abhishek");
		
		Batch b2 = new Batch();
		b2.setBranch_code("JAF-HAHBJ_M1");
		b2.setSubject("JavaScript");
		b2.setTrainer("Prajwal");
		
		Batch b3 = new Batch();
		b3.setBranch_code("JAF-HAHAJ_Z1");
		b3.setSubject("Hibernate");
		b3.setTrainer("Stahish");
		
		Student s1 = new Student();
		s1.setName("Jeelani");
		s1.setPhone(98437L);
		s1.setPer(67.1);
		
		Student s2 = new Student();
		s2.setName("Tapan");
		s2.setPhone(9843747L);
		s2.setPer(60.1);
		
		Student s3 = new Student();
		s3.setName("Afrz");
		s3.setPhone(9843857L);
		s3.setPer(60);
		
		b2.setStudent(new ArrayList<Student>(Arrays.asList(s1, s2, s3)));
		b3.setStudent(new ArrayList<Student>(Arrays.asList(s1, s2, s3)));
		b1.setStudent(new ArrayList<Student>(Arrays.asList(s1, s3)));
		EntityManager manager = Persistence.createEntityManagerFactory("jpa").createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		manager.persist(b1);
		manager.persist(b2);
		manager.persist(b3);
		transaction.begin();
		transaction.commit();
	}
}
