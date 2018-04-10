package com.triagemanagment.model.interfaces;

import java.sql.Blob;
import java.util.List;


public interface IUserStory {

	public String getId();
	public void setId(String id);
	
	public String getDescreption();
	public void setDescreption(String desc);
	
	public String getChangeLists();
	public void setChangeLists(String changeLists);
	
	public String getExtSystems();
	public void setExtSystems(String extSystems);

}
