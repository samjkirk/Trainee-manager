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
	private long trainee_id;
	private String name;
	@JoinColumn(name = "trainee_id")
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Subjects> subjects;
	
	public Trainee(long id, String name, List<Subjects> subjects) {
		super();
		this.name = name;
		this.subjects = subjects;
	}
	
	private Trainee() {}

	public long getId() {
		return trainee_id;
	}

	public void setId(long id) {
		this.trainee_id = id;
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
		return "Trainee [id=" + trainee_id + ", name=" + name + ", subjects=" + subjects + "]";
	}
	
	
}
