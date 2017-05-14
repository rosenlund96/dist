package Entities;


import java.util.ArrayList;
import java.util.List;

public class Safe {

    private List<BELBIN> unusedBelbinItems = new ArrayList<>();
    private List<BELBIN> usedBelbinItems = new ArrayList<>();
    private List<THREESIXTY> usedThreeSixtyItems = new ArrayList<>();

    private List<DISC> unusedDiscItems = new ArrayList<>();
    private List<DISC> usedDiscItems = new ArrayList<>();
    private List<THREESIXTY> unusedThreeSixtyItems = new ArrayList<>();




    private List<AbstractItem> unusedItems = new ArrayList<>();
    private List<AbstractItem> usedItems = new ArrayList<>();
    private static Safe sSafe;
    public int safeSize;


    /** N�dvendigt med konsterukt�r uden parametre for at objektet kan instantieres fra JSON */
    public Safe() {
    	this.safeSize = 0;
    }
   
    

    /**********************************
     * The logic of this class begins *
     **********************************/

    public void setUnusedBelbinItems(List<BELBIN> unusedBelbinItems) {
        this.unusedBelbinItems = unusedBelbinItems;
    }

    public void setUnusedDiscItems(List<DISC> unusedDiscItems) {
        this.unusedDiscItems = unusedDiscItems;
    }

    public List<BELBIN> getUnusedBelbinItems() {
        return unusedBelbinItems;
    }

    public List<BELBIN> getUsedBelbinItems() {
        return usedBelbinItems;
    }

    public List<DISC> getUnusedDiscItems() {
        return unusedDiscItems;
    }

    public List<DISC> getUsedDiscItems() {
        return usedDiscItems;
    }

    public void setUsedBelbinItems(List<BELBIN> usedBelbinItems) {
        this.usedBelbinItems = usedBelbinItems;
    }

    public void setUsedDiscItems(List<DISC> usedDiscItems) {
        this.usedDiscItems = usedDiscItems;
    }

    public void setUsedItems(List<AbstractItem> usedItems) {
        this.usedItems = usedItems;
    }

    public void setUnusedThreeSixtyItems(List<THREESIXTY> unusedThreeSixtyItems) {
        this.unusedThreeSixtyItems = unusedThreeSixtyItems;
    }

    public List<THREESIXTY> getUnusedThreeSixtyItems() {
        return unusedThreeSixtyItems;
    }

    public List<THREESIXTY> getUsedThreeSixtyItems() {
        return usedThreeSixtyItems;
    }

    public void setUsedThreeSixtyItems(List<THREESIXTY> usedThreeSixtyItems) {
        this.usedThreeSixtyItems = usedThreeSixtyItems;
    }

    /********************************************************
     * This method takes an object and saves it in the safe *
     ********************************************************/

    void addToSafe(AbstractItem item, int qty) {

        switch (item.getTestType()){
            case DISC:
                for (int i = 1; i <= qty; i++) {
                    unusedDiscItems.add((DISC) item);
                    System.out.println("Der blev tilf�jet til unusedDisc");
                }
                break;
            case BELBIN:
                for (int i = 1; i <= qty; i++) {
                    unusedBelbinItems.add((BELBIN) item);
                    System.out.println("Der blev tilf�jet til unusedBelbin");
                }
                break;

            case THREESIXTY:
                unusedThreeSixtyItems.add((THREESIXTY)item);
        }

    }


    /**********************************************
     * This method filters out the answered tests *
     **********************************************/

    void addToResults(AbstractItem item) {


        switch (item.getTestType()){
            case DISC:
                usedDiscItems.add((DISC)item);
                break;

            case BELBIN:
                usedBelbinItems.add((BELBIN)item);
                break;

            case THREESIXTY:
                usedThreeSixtyItems.add((THREESIXTY)item);
                break;
        }
        removeItemFromSafe(item);
        

    }

    public void updateUnusedItem(AbstractItem item){
        int number  = 0;
        for(int i = 0; i < unusedItems.size(); i++){
            if(item == unusedItems.get(i))
                number = i;
            unusedItems.set(number,item);
        }

    }
    /********************************************
     * This method gets an unused item from the safe *
     ********************************************/

    public List<AbstractItem> læsUnusedItems() {
        ArrayList<AbstractItem> res = new ArrayList<>();
        res.addAll(unusedBelbinItems);
        res.addAll(unusedDiscItems);
        res.addAll(unusedThreeSixtyItems);
        return res;
    }


    public static Safe getInstance(){
        return sSafe;
    }



    public void sætUnusedItems(List<AbstractItem> Unused){
       for (int i = 0; i < Unused.size();i++){
            switch (Unused.get(i).getTestType()){
                case DISC:
                    DISC disc = (DISC)Unused.get(i);
                    this.unusedItems.add(disc);
                    break;

                case BELBIN:
                    BELBIN belbin = (BELBIN)Unused.get(i);
                    this.unusedItems.add(belbin);
                    break;

                case THREESIXTY:
                    THREESIXTY threesixty = (THREESIXTY)Unused.get(i);
                    this.unusedItems.add(threesixty);

                    break;
            }
       }

    }


    public void sætUsedItems(List<AbstractItem> used){
        for (int i = 0; i < used.size();i++){
            switch (used.get(i).getTestType()){
                case DISC:
                    DISC disc = (DISC)used.get(i);
                    this.usedDiscItems.add(disc);
                    break;

                case BELBIN:
                    BELBIN belbin = (BELBIN)used.get(i);
                    this.usedBelbinItems.add(belbin);
                    break;

                case THREESIXTY:
                    THREESIXTY threesixty = (THREESIXTY)used.get(i);
                    this.unusedItems.add(threesixty);

                    break;
            }
        }
    }


    /********************************************
     * This method gets the results from a test *
     ********************************************/

    public ArrayList<AbstractItem> hentUsedItems() {
        ArrayList<AbstractItem> res = new ArrayList<>();
        res.addAll(usedDiscItems);
        res.addAll(usedBelbinItems);
        res.addAll(usedThreeSixtyItems);
        return res;
    }



    public int getSafeSize(){
        return læsUnusedItems().size();
    }


    
    public String GetSafeText() {
    	int size = getSafeSize();
        return "Din Safe indeholder:{" +
                "Antal profiler: " + size +
                '}';
    }

    /********************************************
     * This method removes a item from the safe *
     ********************************************/

    private void removeItemFromSafe(AbstractItem item){
        int size;
        switch (item.getTestType()){
            case DISC:
                size = unusedDiscItems.size();
                unusedDiscItems.remove(item);
                break;
            case BELBIN:
                size = unusedBelbinItems.size();
                unusedBelbinItems.remove(item);
                break;
            case THREESIXTY:
                size = unusedThreeSixtyItems.size();
                unusedThreeSixtyItems.remove(item);
                break;

        }
    }
}
