package com.p.k.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="enrollment_id",nullable=false)
	private String enrollmentId;
	private String name;
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.LAZY)
	@JoinColumn(name="guide_id")
	private Guide guide;
	public Student() {
	}
	public Student(String enrollmentId, String name, Guide guide) {
		this.enrollmentId = enrollmentId;
		this.name = name;
		this.guide = guide;
	}
	public Student(String enrollmentId, String name) {
		this.enrollmentId = enrollmentId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", enrollmentId=" + enrollmentId + ", name=" + name + ", guide=" + guide + "]";
	}

}
