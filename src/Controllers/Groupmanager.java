package Controllers;

import java.util.ArrayList;

import Entities.Group;
import Entities.User;

public class Groupmanager {
	
	Usermanager manager;
	ArrayList<Group> groups = new ArrayList<Group>();

	public Groupmanager(Usermanager manager) {
		this.manager = manager;
	}
	
	public void createGroup(String name, ArrayList<User> users, int size){
		Group group = new Group(name,users,size);
		this.groups.add(group);
	}
	
	
	public Group getGroup(String name){
		for(int i = 0; i>groups.size();i++){
			if(groups.get(i).getName() == name){
				return groups.get(i);
			}
		}
		return null;
	}
	
	public Boolean deleteGroup(String name){
		for(int i = 0; i>groups.size();i++){
			if(groups.get(i).getName() == name){
				groups.remove(i);
				return true;
			}
		}
		return false;
	}
	
}