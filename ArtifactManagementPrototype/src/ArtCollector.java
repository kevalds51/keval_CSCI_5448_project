
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
    }

    /**
     * 
     */
    private ArrayList<Artifact> myArtifacts = new ArrayList<Artifact>();

    /**
     * 
     */
    private Boolean registeredAccount = false;

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
     * @param artifact 
     * @param artSt 
     * @return
     */
    public void updateMyArtifactStatus(Artifact artifact, String artSt) {
        // TODO implement here
//        return null;
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
     * @param museum 
     * @return
     */
    public String viewMyTransactions(Museum museum) {
        // TODO implement here
        return "";
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

    public void setRegisteredAccount(Boolean registeredAccount) {
        this.registeredAccount = registeredAccount;
    }
}