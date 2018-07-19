package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee {
	
	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private long id;
	private String name;
	private List<String> subjects;
	
	public Trainee(long id, String name, List<String> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", subjects=" + subjects + "]";
	}
	
	
}
