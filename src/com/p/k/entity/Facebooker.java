package com.p.k.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue(value = "facebooker")	//SingleTable
@PrimaryKeyJoinColumn(name = "id")			//Joined
public class Facebooker extends Blogger {
	@Override
	public String postInBlog() {return "text";}
}
