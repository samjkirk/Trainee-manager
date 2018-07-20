package com.qa.persistence.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Trainee {
	
	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private long traineeid;
	private String name;
	@JoinColumn(name = "traineeid")
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Subjects> subjects;
	
	public Trainee(String name, List<Subjects> subjects) {
		super();
		this.name = name; 
		this.subjects = subjects;
	}
	
	private Trainee() {}

	public long getId() {
		return traineeid;
	}

	public void setId(long id) {
		this.traineeid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Trainee [id=" + traineeid + ", name=" + name + ", subjects=" + subjects + "]";
	}
	
	
}
