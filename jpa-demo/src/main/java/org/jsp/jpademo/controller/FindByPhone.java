package org.jsp.jpademo.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dto.Person;

public class FindByPhone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the phone number to display the person details");
		Long phone = sc.nextLong();
		String jpql = "select p from Person p where p.phone=?1";
		EntityManager manager = Persistence.createEntityManagerFactory("jpa").createEntityManager();
		Query q = manager.createQuery(jpql);
		q.setParameter(1, phone);
		try {
			Person p = (Person)q.getSingleResult();
			System.out.println("Person ID :" + p.getId());
			System.out.println("Name :" + p.getName());
			System.out.println("email :" + p.getEmail());
			System.out.println("Gender :" + p.getGender());
			System.out.println("Phone:" + p.getPhone());
			System.out.println("Person Age :" + p.getAge());
			
		}
		catch(NoResultException e){
			System.out.println("Invalid");
		}
	}
}
