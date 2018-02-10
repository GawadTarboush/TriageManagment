package com.triagemanagment.model.interfaces;

import java.util.List;

public interface IUserStory {

	public String getId();
	public void setId(String id);
	
	public String getDescreption();
	public void setDescreption(String desc);
	
//	public List<String> getChangeLists();
//	public void setChangeLists(List<String> changeLists);
	
	public String getExtSystems();
	public void setExtSystems(String extSystems);

}
