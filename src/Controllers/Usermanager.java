package Controllers;

import java.util.ArrayList;
import java.util.List;

import Entities.AbstractItem;
import Entities.Safe;
import Entities.User;

public class Usermanager {

	
	
	public Usermanager(){
		
	}
	
	public ArrayList<User> getAllUsers(){
		return null;
	}
	
	public void addProductToUser(AbstractItem item, User user, int qty){
		user.addToSafe(item,qty);
	}
	
	 public void addToResults(User user,AbstractItem item) {

	        user.addToResults(item);
	    }
	// Alle metoder fra User
//		public void setName(String newName, String newSurName, User user) {
//			user.setName(newName, newSurName);
//	    }
//
//	    /***************************************
//	     * This method gets the name of a user *
//	     ***************************************/
//
//	    public String getName(User user) {
//	    	return user.getName();
//	    }
//
//	    /******************************************
//	     * This method gets the surname of a user *
//	     ******************************************/
//
//	    public String getSurName(User user) {
//	    	return user.getSurName();
//	    }
//
//	    /****************************************
//	     * This method sets the email of a user *
//	     ****************************************/
//
//	    public void setEmail(String newEmail, User user) {
//	    	user.setEmail(newEmail);
//	    }
//
//	    /****************************************
//	     * This method gets the email of a user *
//	     ****************************************/
//
//	    public String getEmail(User user){
//	    	return user.getEmail();
//	    }
//
//	    /**********************************************
//	     * This method sets the phone number of a user *
//	     **********************************************/
//
//	    public void setRetning(String newRetning, User user){
//	    	user.setRetning(newRetning);
//	    }
//
//	    /**********************************************
//	     * This method gets the phone number of a user *
//	     **********************************************/
//
//	    public String getRetning(User user){
//	    	return user.getRetning();
//	    }
//
//	    /*********************************
//	     * This method gets and the safe *
//	     *********************************/
//
//	    public List<AbstractItem> retrieveSafeObjects(User user) {
//			return user.retrieveSafeObjects();
//	    }
//
//	    /*****************************
//	     * This method gets the safe *
//	     *****************************/
//
//	    public Safe getSafe(User user) {
//	    	return user.getSafe();
//	    }
//
//	    /*****************************
//	     * This method sets the safe *
//	     *****************************/
//
//	    public void setSafe(Safe safe, User user) {
//	        user.setSafe(safe);
//	    }
//
//	    public void setfullName(User user){
//	        user.setfullName();
//	    }
//
//	    /******************************************
//	     * This method gets the results of a user *
//	     ******************************************/
//
//	    public List<AbstractItem> hentResults(User user) {
//	    	return user.hentResults();
//	    }
//	    
//	    public String getFullName(User user){
//	        return user.getFullName();
//	    }
//
//	    /*********************************************
//	     * This method adds bought tests to the safe *
//	     *********************************************/
//
//	    public void addToSafe(AbstractItem item, int qty, User user){
//	    	user.addToSafe(item, qty);
//	    }
//
//
//
//	    public void setFirstRun(Boolean firstRun, User user){
//	    	user.setFirstRun(firstRun);
//	    }
//	    
//	    public boolean getFirstRun(User user){
//	        return user.getFirstRun();
//	    }
//
//	    public boolean getAdministrativ(User user) {
//	        return user.getAdministrativ();
//	    }
//
//	    public boolean getNotifikationer(User user) {
//	        return user.getNotifikationer();
//	    }
//
//	    public boolean getInverter(User user) {
//	        return user.getInverter();
//	    }
//
//	    public void setAdministrativ(boolean administrativ, User user) {
//	        user.setAdministrativ(administrativ);
//	    }
//
//	    public void setNotifikationer(boolean notifikationer, User user) {
//	        user.setNotifikationer(notifikationer);
//	    }
//
//	    public void setInverter(boolean inverter, User user) {
//	    	user.setInverter(inverter);
//	    }

	
}
