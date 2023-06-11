package com.p.k.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.BatchSize;

@Entity
@BatchSize(size = 4)
public class Guide {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="staff_id", nullable=false)
	private String staffid;
	private String name;
	private Integer salary;
	@OneToMany(mappedBy="guide", cascade= {CascadeType.PERSIST}, fetch = FetchType.LAZY)
	private Set<Student> students = new HashSet<Student>();
	public Guide(String staffid, String name, Integer salary) {
		this.staffid = staffid;
		this.name = name;
		this.salary = salary;
	}
	public Guide() {
	}
	@Override
	public String toString() {
		return "Guide [id=" + id + ", staffid=" + staffid + ", name=" + name + ", salary=" + salary + "]";
	}

}
