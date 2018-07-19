package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subjects {
	
	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private long subject_id;
	private String subjectName;
	private String skillLevel;
	
	public Subjects(String subjectName, String skillLevel) {
		super();
		this.subjectName = subjectName;
		this.skillLevel = skillLevel;
	}
	
	private Subjects(){}

	public long getId() {
		return subject_id;
	}

	public void setId(long id) {
		this.subject_id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}

	@Override
	public String toString() {
		return "Subjects [id=" + subject_id + ", subjectName=" + subjectName + ", skillLevel=" + skillLevel + "]";
	}
	
	
}
