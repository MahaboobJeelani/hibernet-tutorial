package org.jsp.timestamp.dto;
import javax.persistence.Cacheable;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
@Cacheable
public class User{
	@Embedded
	private UserId id;
	private int age;
	private String name;
	public UserId getId() {
		return id;
	}
	public void setId(UserId id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
