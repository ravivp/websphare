package spring.boot.rest.api.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

import org.springframework.data.annotation.Id;

@Entity
public class Student {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "StudentId",nullable = false)
	private Long StudentId;
	
	@Column(name = "StudentName")
	private String StudentName;
	
	@Column(name = "grade")
	private String grade;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "student")
	private StudentAddress address;
	
	public Student() {

	}

	public Long getStudentId() {
		return StudentId;
	}

	public Student setStudentId(Long studentId) {
		StudentId = studentId;
		
		return this;
	}

	public String getStudentName() {
		return StudentName;
	}

	public Student setStudentName(String studentName) {
		StudentName = studentName;
		
		return this;
	}

	public String getGrade() {
		return grade;
	}

	public Student setGrade(String grade) {
		this.grade = grade;
		
		return this;
	}
	
	

}
