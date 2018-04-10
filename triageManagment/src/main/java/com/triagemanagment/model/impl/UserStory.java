package com.triagemanagment.model.impl;


import java.sql.Blob;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.triagemanagment.model.interfaces.IUserStory;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class UserStory implements IUserStory{

	
	
	@Id
	private String id;
	private String descreption;
	private String changeLists;
	
	@JsonProperty("ext_systems")
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
	@Override
	public String getChangeLists() {
		
		return changeLists;
	}
	
	@Override
	public void setChangeLists(String changeLists) {
		this.changeLists = changeLists;
		
	}
	
	
}
