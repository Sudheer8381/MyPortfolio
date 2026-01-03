package com.myPortfolio.portfolio.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String studentName;
	@Column(nullable = false)
	private String email;
	
    @Column(nullable = false, length = 600)
	private String studentMsg;
	
	
	public StudentInfo(String studentName, String email, String studentMsg) {
		this.studentName = studentName;
		this.email = email;
		this.studentMsg = studentMsg;
	}
	

	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}
	

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStudentMsg() {
		return studentMsg;
	}

	public void setStudentMsg(String studentMsg) {
		this.studentMsg = studentMsg;
	}
	
}
