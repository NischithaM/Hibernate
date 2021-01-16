package com.cruds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COURSES")
public class Courses {
	
	private int courseId;
	private String courseName;
	
	public Courses() {
		super();
	}

	
	public Courses(String courseName) {
		super();
		this.courseName = courseName;
	}

	@Id
	@GeneratedValue
	@Column(name="COURSE_ID")
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Column(name="COURSE_NAME", nullable=false)
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	


}
