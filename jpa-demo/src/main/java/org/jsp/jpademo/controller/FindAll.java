package org.jsp.jpademo.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dto.Person;

public class FindAll {
	public static void main(String[] args) {
		EntityManager manager = Persistence.createEntityManagerFactory("jpa").createEntityManager();
		String jpql = "select p from Person p";
		Query q = manager.createQuery(jpql);
		List<Person> ps = q.getResultList();
		for(Person p : ps) {
			System.out.println("Person Id : "+p.getId());
			System.out.println("Name :"+p.getName());
			System.out.println("Phone No: "+ p.getPhone());
			System.out.println("Email Id :"+p.getEmail());
			System.out.println("Gender :" + p.getGender());
			System.out.println("Age :"+p.getAge());
			System.out.println("===================================");
		}
		
	}
}
