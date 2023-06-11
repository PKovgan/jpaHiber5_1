package com.p.k.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "MODE", discriminatorType = DiscriminatorType.STRING) //SingleTable
public abstract class Blogger {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	private String name;
	public void setName(String name) {this.name = name;}
	public abstract String postInBlog();
	@Override
	public String toString() {return name + " posting " + postInBlog() + " in blog.";}
}
