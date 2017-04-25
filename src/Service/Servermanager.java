package Service;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import Controllers.Groupmanager;
import Controllers.Usermanager;
import Entities.AbstractItem;
import Entities.Group;
import Entities.Safe;
import Entities.User;
import brugerautorisation.data.Bruger;
import brugerautorisation.transport.soap.Brugeradmin;


@WebService(endpointInterface = "Service.ServerI")
public class Servermanager implements ServerI {

	Bruger b = null;
	User current = null;
	public Groupmanager aManager;
	public Usermanager manager;
	
	public Servermanager(){
		manager = new Usermanager();
		this.aManager = new Groupmanager(manager);
		
	}
	public String CheckConnection(){
		return "Der er oprettet forbindelse til softskills serveren";
	}
	
	public boolean login(String bruger, String adgangskode) throws Exception {
        URL url = new URL("http://javabog.dk:9901/brugeradmin?wsdl");
        QName qname = new QName("http://soap.transport.brugerautorisation/", "BrugeradminImplService");
        Service service = Service.create(url, qname);
        Brugeradmin ba = service.getPort(Brugeradmin.class);
        
        try {
    Bruger b = ba.hentBruger(bruger, adgangskode);
} catch (Throwable e) {
    return false;
}
    return true;
}
	
	//All methods from Groupmanager//
	public void createGroup(String name, ArrayList<User> users, int size) {
		aManager.createGroup(name, users, size);
	}
	
	public Group getGroup(String name){
		return aManager.getGroup(name);
	}
	
	public boolean deleteGroup(String name){
		return aManager.deleteGroup(name);
	}
	
	//All methods from Usermanager//
	public ArrayList<User> getAllUsers(){
		return manager.getAllUsers();
	}
	
	public void addProductToUser(AbstractItem item, User user, int qty){
		 manager.addProductToUser(item, user, qty);
	}
	
	public void addToResults(User user,AbstractItem item) {
		manager.addToResults(user, item);
	}
	
	// Alle metoder fra User
	
	public void setName(String newName, String newSurName) {
		current.setName(newName, newSurName);
    }
	/*
    /***************************************
     * This method gets the name of a user *
     ***************************************/

    public String getName() {
    	return current.getName();
    }

    /******************************************
     * This method gets the surname of a user *
     ******************************************/

    public String getSurName() {
    	return current.getSurName();
    }

    /****************************************
     * This method sets the email of a user *
     ****************************************/

    public void setEmail(String newEmail) {
    	current.setEmail(newEmail);
    }

    /****************************************
     * This method gets the email of a user *
     ****************************************/

    public String getEmail(){
    	return current.getEmail();
    }

    /**********************************************
     * This method sets the phone number of a user *
     **********************************************/

    public void setRetning(String newRetning){
    	current.setRetning(newRetning);
    }

    /**********************************************
     * This method gets the phone number of a user *
     **********************************************/

    public String getRetning(){
    	return current.getRetning();
    }

    /*********************************
     * This method gets and the safe *
     *********************************/

    public List<AbstractItem> retrieveSafeObjects() {
		return current.retrieveSafeObjects();
    }

    /*****************************
     * This method gets the safe *
     *****************************/

    public Safe getSafe() {
    	return current.getSafe();
    }
    public String getObjects(){
    	return current.getSafeSize();
    }

    /*****************************
     * This method sets the safe *
     *****************************/

    public void setSafe(Safe safe) {
    	current.setSafe(safe);
    }

    public void setfullName(){
    	current.setfullName();
    }

    /******************************************
     * This method gets the results of a user *
     ******************************************/

    public List<AbstractItem> hentResults() {
    	return current.hentResults();
    }
    
    public String getFullName(){
        return current.getFullName();
    }

    /*********************************************
     * This method adds bought tests to the safe *
     *********************************************/

    public void addToSafe(AbstractItem item, int qty){
    	current.addToSafe(item, qty);
    }



    public void setFirstRun(Boolean firstRun){
    	current.setFirstRun(firstRun);
    }
    
    public boolean getFirstRun(){
        return current.getFirstRun();
    }

    public boolean getAdministrativ() {
        return current.getAdministrativ();
    }

    public boolean getNotifikationer() {
        return current.getNotifikationer();
    }

    public boolean getInverter() {
        return current.getInverter();
    }

    public void setAdministrativ(boolean administrativ) {
    	current.setAdministrativ(administrativ);
    }

    public void setNotifikationer(boolean notifikationer) {
    	current.setNotifikationer(notifikationer);
    }

    public void setInverter(boolean inverter) {
    	current.setInverter(inverter);
    }
	@Override
	public String getSafeSize() throws Exception {
		return current.getSafeSize();
	}
  
}
