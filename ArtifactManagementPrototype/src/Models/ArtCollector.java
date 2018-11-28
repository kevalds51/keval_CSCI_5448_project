package Models;

import java.util.*;

/**
 * 
 */
public class ArtCollector extends Person implements  Login{

    /**
     * Default constructor
     */
    public ArtCollector() {
    }

    public ArtCollector(String name, Integer userID, Integer age, String address, String password){
        super(name, userID, age, address, password);

        myTransactions = new ArrayList<Transaction>();
    }

    /**
     * 
     */
    private ArrayList<Artifact> myArtifacts = new ArrayList<Artifact>();

    /**
     * 
     */
    private Boolean registeredAccount = false;

    /**
     *
     */
    private ArrayList<Transaction> myTransactions;

    public String loginUser(Integer userID, String pass) {
        if (this.registeredAccount == false){
            return "Unregistered Account, Please register and try again.";
        }

        else if (this.getUserID().equals(userID) && this.getPassword().equals(pass))
        {
            return "Collector "+this.getName()+" Models.Login Successful";
        }

        return "Incorrect UserID/Password";
    }

    /**
     * @return
     */
    public String registerCollector() {
        if (this.registeredAccount == true){
            return "Account already Active.";
        }
        this.registeredAccount = true;
        return "Account Registered";
    }

    /**
     * @param museum 
     * @return
     */
    public void viewMuseumCollection(Museum museum) {
        museum.printArtifactCollection();
    }

    /**
     * @param museum
     * @param bidvalue
     * @return
     */
    public String submitBid(Museum museum, int auid, Integer bidvalue) {
        museum.processBid(auid, this, bidvalue);
        return "";
    }

    /**
     * @param museum 
     * @param myArtID
     * @param sellPrice 
     * @return
     */
    public String submitSaleRequest(Museum museum, int myArtID, Integer sellPrice) {
        Artifact thisArt = null;
        for (Artifact art: this.getMyArtifacts()) {
            if(art.getArtifactID() == myArtID)
            {
                thisArt = art;
                break;
            }
        }

        if (thisArt == null){
            return "No such artifact found";
        }

        String response = museum.addSaleRequest(thisArt,this, sellPrice);
        return response;
    }

    /**
     * @return
     */
    public void viewMyTransactions() {
        int count = 0;
        System.out.println("Transactions of " + this.getName() +":\n");
        for (Transaction t1 : this.getMyTransactions()) {
            count++;
            System.out.println("("+count+") " + t1.getTransactionDetails());
        }
    }

    public ArrayList<Artifact> getMyArtifacts() {
        return myArtifacts;
    }

    public void setMyArtifacts(ArrayList<Artifact> myArtifacts) {
        this.myArtifacts = myArtifacts;
    }

    public Boolean getRegisteredAccount() {
        return registeredAccount;
    }

    public ArrayList<Transaction> getMyTransactions() {
        return myTransactions;
    }

    public void setMyTransactions(ArrayList<Transaction> myTransactions) {
        this.myTransactions = myTransactions;
    }

    public void setRegisteredAccount(Boolean registeredAccount) {
        this.registeredAccount = registeredAccount;
    }
}