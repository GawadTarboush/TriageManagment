package com.triagemanagment.model.impl;


import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.triagemanagment.model.interfaces.IUserStory;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class UserStory implements IUserStory{

	
	
	@Id
	private String id;
	private String descreption;
//	private List<String> changeLists;
	private String extSystems;
	
	@Override
	public String getId() {
		return id;
	}
	@Override
	public void setId(String id) {
		this.id = id;
		
	}
	@Override
	public String getDescreption() {
		return descreption;
	}
	@Override
	public void setDescreption(String desc) {
		this.descreption = desc;
	}
	@Override
	public String getExtSystems() {
		return extSystems;
	}
	@Override
	public void setExtSystems(String extSystems) {
		this.extSystems = extSystems;
	}
	
	
}
