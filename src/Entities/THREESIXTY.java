package Entities;

public class THREESIXTY extends AbstractItem {

    private String name;

    public THREESIXTY(){

    }

    /********
     * Hygge*
     ********/

    public THREESIXTY(double cost, boolean isUsed, String productName, String description, testType type) {
        super(cost, isUsed, productName, description, type);
        this.name = name;
    }
}