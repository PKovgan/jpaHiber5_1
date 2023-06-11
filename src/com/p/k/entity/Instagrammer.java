package com.p.k.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@DiscriminatorValue(value = "insta")	//SingleTable
@PrimaryKeyJoinColumn(name = "id")		//Joined
public class Instagrammer extends Blogger{
	@Override
	public String postInBlog() {return "photo";}
}
