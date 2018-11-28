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

    /**
     * Detailed constructor
     */
    public ArtCollector(String name, Integer userID, Integer age, String address, String password){
        super(name, userID, age, address, password);

        myTransactions = new ArrayList<Transaction>();
    }

    /**
     * The list of the collector's artifact
     */
    private ArrayList<Artifact> myArtifacts = new ArrayList<Artifact>();

    /**
     * The status of Museum account.
     */
    private Boolean registeredAccount = false;

    /**
     *  The list of collector's transactions.
     */
    private ArrayList<Transaction> myTransactions;

    /**
     * This method allows the collector to login to the museum systems
     * @param userID
     * @param pass
     * @return String
     */
    public String loginUser(Integer userID, String pass) {
        if (this.registeredAccount == false){
            return "Unregistered Account, Please register and try again.";
        }

        else if (this.getUserID().equals(userID) && this.getPassword().equals(pass))
        {
            return "Collector "+this.getName()+" Login Successful";
        }

        return "Incorrect UserID/Password";
    }

    /**
     * Register a new collector using this method.
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
     * View the museum's collections.
     * @param museum
     */
    public void viewMuseumCollection(Museum museum) {
        museum.printArtifactCollection();
    }

    /**
     * Submit a bid to an open auction
     * @param museum
     * @param bidvalue
     * @return String
     */
    public String submitBid(Museum museum, int auid, Integer bidvalue) {
        museum.processBid(auid, this, bidvalue);
        return "";
    }

    /**
     * Submit a sale request to sell an artifact
     * @param museum 
     * @param myArtID
     * @param sellPrice 
     * @return String
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
     * View the transactions so far.
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