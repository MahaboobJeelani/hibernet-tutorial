package org.jsp.employeeapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jsp.employeeapp.dto.Employee;

public class EmployeeDao {
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		public Employee saveEmployee(Employee emp) {
			Transaction t = s.beginTransaction();
			s.save(emp);
			t.commit();
			return emp;
		}
		public Employee udateEmployee(Employee emp) {
			Transaction t = s.beginTransaction();
			s.update(emp);
			t.commit();
			return emp;
		}
		public Employee findById(int id) {
			return s.get(Employee.class, id);
		}
		public boolean deleteById(int id)
	}
