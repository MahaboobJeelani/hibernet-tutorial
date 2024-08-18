package org.jsp.jpademo.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.jpademo.dto.Person;

import java.util.Scanner;

public class FindByName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name for find details of person");
		String name = sc.next();
		String jpql = "select p from Person p where p.name=?1";
		EntityManager manager = Persistence.createEntityManagerFactory("jpa").createEntityManager();
		Query q = manager.createQuery(jpql);
		q.setParameter(1, name);
		List<Person> ps = q.getResultList();
		for (Person p : ps) {
			System.out.println("person id:" + p.getId());
			System.out.println("name:" + p.getName());
			System.out.println("phone:" + p.getPhone());
			System.out.println("age:" + p.getAge());
			System.out.println("Email.id:" + p.getEmail());
			System.out.println("gender:" + p.getGender());
			System.out.println("=======================");
		}
	}
}
