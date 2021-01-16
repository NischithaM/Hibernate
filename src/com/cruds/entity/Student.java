package com.cruds.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
	
	private int studid;
	private String studname;
	private Address studaddress;
	private Set<Phone> studentphoneno=new HashSet<Phone>();
	private Set<Courses> courses=new HashSet<>();
	
	
	public Student() {
		super();
	}

	public Student(String studname, Address studaddress) {
		super();
		this.studname = studname;
		this.studaddress = studaddress;
	}


	public Student(String studname, Set<Phone> studentphoneno) {
		super();
		this.studname = studname;
		this.studentphoneno = studentphoneno;
	}

	
	
/*
	public Student(String studname, Set<Courses> courses) {
		super();
		this.studname = studname;
		this.courses = courses;
	}*/

	
	
	public Student(String studname, Address studaddress, Set<Phone> studentphoneno, Set<Courses> courses) {
		super();
		this.studname = studname;
		this.studaddress = studaddress;
		this.studentphoneno = studentphoneno;
		this.courses = courses;
	}

	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}
	
	@Column(name="STUDENT_NAME" ,nullable=false,length=100)
	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	
	@ManyToOne(cascade=CascadeType.ALL)
	public Address getStudaddress() {
		return studaddress;
	}
	
	
	
	public void setStudaddress(Address studaddress) {
		this.studaddress = studaddress;
	}

	//one to many
	
			@OneToMany(cascade = CascadeType.ALL)
			@JoinTable(name = "STUDENT_PHONE", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, 
									   inverseJoinColumns = { @JoinColumn(name = "PHONE_ID") })
			
	public Set<Phone> getStudentphoneno() {
		return studentphoneno;
	}

	public void setStudentphoneno(Set<Phone> studentphoneno) {
		this.studentphoneno = studentphoneno;
	}

	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="STUDENT_COURSES",joinColumns={@JoinColumn(name="STUDENT_ID")},
									  inverseJoinColumns={@JoinColumn(name="COURSE_ID")})

	public Set<Courses> getCourses() {
		return courses;
	}

	public void setCourses(Set<Courses> courses) {
		this.courses = courses;
	}

	
	
}
