package org.jsp.hibernatedemo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FindUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User name to Display details");
		String name = sc.next();
		String qry = "Select u from User u where u.name=?1";
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Query<User> q = s.createQuery(qry);
		q.setParameter(1, name);
		List<User> users = q.getResultList();
		if(users.size()>0) {
			for(User u : users) {
				System.out.println("User Id" + u.getId());
				System.out.println("User Name"+u.getName());
				System.out.println("User Phone"+u.getPhone());
				System.out.println("User Email"+u.getEmail());
			}
		}
		else {
			System.err.println("User Not Found");
		}
	}

}
