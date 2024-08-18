package org.jsp.manytomanybi.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.jsp.mamytomanyuni.dto.Student;

public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String subject;
	@Column(unique = true)
	private String branch_code;
	private String trainer;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Student> student;
	

}
