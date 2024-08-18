package org.jsp.hibernatedemo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Findphone {
	public static void main(String[] args) {
		String qry = "select u.phone from User u";
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Query<Long> q = s.createQuery(qry);
		List<Long> phones = q.getResultList();
		for(Long phone : phones) {
			System.out.println(phone);
		}
	}
}
