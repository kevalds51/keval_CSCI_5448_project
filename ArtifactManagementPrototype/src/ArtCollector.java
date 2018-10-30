
import java.util.*;

/**
 * 
 */
public class ArtCollector extends Person implements Login {

    /**
     * Default constructor
     */
    public ArtCollector() {
    }

    public ArtCollector(Boolean registeredAccount) {
        this.registeredAccount = registeredAccount;
    }

    public ArtCollector(Set<Artifact> myArtifacts, Boolean registeredAccount)
    {
        this.myArtifacts = myArtifacts;
        this.registeredAccount = registeredAccount;
    }

    /**
     * 
     */

    private Set<Artifact> myArtifacts;

    /**
     * 
     */
    private Boolean registeredAccount;


    /**
     * @return
     */
    public String registerCollector() {
        // TODO implement here
        return "";
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
    public Set<String> viewMuseumCollection(Museum museum) {
        // TODO implement here
        return null;
    }

    /**
     * @param museum 
     * @param artifact 
     * @return
     */
    public String viewMuseumArtifact(Museum museum, Artifact artifact) {
        // TODO implement here
        return "";
    }

    /**
     * @param museum 
     * @param artifact 
     * @param bidvalue 
     * @return
     */
    public String submitBid(Museum museum, Artifact artifact, Integer bidvalue) {
        // TODO implement here
        return "";
    }

    /**
     * @param museum 
     * @param artifact 
     * @param sellPrice 
     * @return
     */
    public String submitSaleRequest(Museum museum, Artifact artifact, Integer sellPrice) {
        // TODO implement here
        return "";
    }

    /**
     * @param museum 
     * @return
     */
    public String viewMyTransactions(Museum museum) {
        // TODO implement here
        return "";
    }

    /**
     * @param userID 
     * @param pass 
     * @return
     */
    public String loginUser(Integer userID, String pass) {
        // TODO implement here
        return "";
    }

    public Set<Artifact> getMyArtifacts() {
        return myArtifacts;
    }

    public void setMyArtifacts(Set<Artifact> myArtifacts) {
        this.myArtifacts = myArtifacts;
    }

    public Boolean getRegisteredAccount() {
        return registeredAccount;
    }

    public void setRegisteredAccount(Boolean registeredAccount) {
        this.registeredAccount = registeredAccount;
    }
}