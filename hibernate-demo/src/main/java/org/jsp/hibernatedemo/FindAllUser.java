package org.jsp.hibernatedemo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FindAllUser {
	public static void main(String[] args) {
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Query<User> q = s.createQuery("select u from User u");
		List<User> users = q.getResultList();
		for(User u : users) {
			System.out.println("User Id :" + u.getName() );
			System.out.println("User Email :" + u.getEmail());
			System.out.println("User Number :"+ u.getPhone());
			System.out.println("User Name :" + u.getName());
		}
	}
}
