package Entities;

import java.util.List;

public class User {

	private String name;
    private String surName;
    private String fullName;
    private String email;
    private String retning;
    private Safe safe;
    private String birth;
    private int phone;
    private boolean firstRun, administrativ, notifikationer, inverter;
    
    
    public User(){

    }

    public User(String name,String surName,String email, String retning){
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.retning = retning;
        this.safe = new Safe();
        this.firstRun = true;
        this.administrativ = false;
        this.notifikationer = true;
        this.inverter = false;
        this.phone = 00000000;

    }
    
    public void setPhone(int phone){
    	this.phone = phone;
    }
    public int getphone(){
    	return phone;
    }
    /***************************************
     * This method sets the name of a user *
     ***************************************/

    public void setName(String newName, String newSurName) {

        this.name= newName;
        this.surName = newSurName;
    }

    /***************************************
     * This method gets the name of a user *
     ***************************************/

    public String getName() {

        return name;
    }
    public String getSafeSize(){
    	return safe.GetSafeText();
    }

    /******************************************
     * This method gets the surname of a user *
     ******************************************/

    public String getSurName() {

        return surName;
    }

    /****************************************
     * This method sets the email of a user *
     ****************************************/

    public void setEmail(String newEmail) {

        this.email = newEmail;
    }

    /****************************************
     * This method gets the email of a user *
     ****************************************/

    public String getEmail(){

        return this.email;
    }

    /**********************************************
     * This method sets the phone number of a user *
     **********************************************/

    public void setRetning(String newRetning){

        this.retning = newRetning;
    }

    /**********************************************
     * This method gets the phone number of a user *
     **********************************************/

    public String getRetning(){

        return this.retning;
    }

    /*********************************
     * This method gets and the safe *
     *********************************/

    public List<AbstractItem> retrieveSafeObjects() {

        return safe.læsUnusedItems();
    }

    /*****************************
     * This method gets the safe *
     *****************************/

    public Safe getSafe() {

        return safe;
    }

    /*****************************
     * This method sets the safe *
     *****************************/

    public void setSafe(Safe safe) {
        this.safe = safe;
    }


    public void setfullName(){
        this.fullName = name + " " + surName;
    }

    /******************************************
     * This method gets the results of a user *
     ******************************************/

    public List<AbstractItem> hentResults() {

        return safe.hentUsedItems();
    }
    public String getFullName(){
        return name + " " + surName;
    }

    /*********************************************
     * This method adds bought tests to the safe *
     *********************************************/

    public void addToSafe(AbstractItem item, int qty){

        safe.addToSafe(item,qty);
    }

    /***********************************
     * This method adds to the results *
     ***********************************/

    public void addToResults(AbstractItem item) {

        safe.addToResults(item);
    }


    public void setFirstRun(Boolean firstRun){this.firstRun = firstRun;}
    public boolean getFirstRun(){
        return firstRun;
    }

    public boolean getAdministrativ() {
        return administrativ;
    }

    public boolean getNotifikationer() {
        return notifikationer;
    }

    public boolean getInverter() {
        return inverter;
    }

    public void setAdministrativ(boolean administrativ) {
        this.administrativ = administrativ;
    }

    public void setNotifikationer(boolean notifikationer) {
        this.notifikationer = notifikationer;
    }

    public void setInverter(boolean inverter) {
        this.inverter = inverter;
    }

}
