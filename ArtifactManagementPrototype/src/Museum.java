
import java.util.*;

/**
 * 
 */
public class Museum {

    /**
     * Default constructor
     */
    public Museum() {
    }

    public Museum(String name, ArrayList<Artifact> artifactCollection, ArrayList<Auction> museumAuctions, ArrayList<SaleRequest> saleRequests, ArrayList<Transaction> transactions) {
        this.name = name;
        this.artifactCollection = artifactCollection;
        this.museumAuctions = museumAuctions;
        this.saleRequests = saleRequests;
        this.transactions = transactions;
    }

    /**
     * 
     */
    private String name = "aMuseum";

    /**
     * 
     */
    private ArrayList<Artifact> artifactCollection;

    /**
     * 
     */
    private ArrayList<Auction> museumAuctions;

    /**
     * 
     */
    private ArrayList<SaleRequest> saleRequests;

    /**
     * 
     */
    private ArrayList<Transaction> transactions;


    /**
     * @return
     */
    public void printArtifactCollection() {
        // TODO implement here
        for (Artifact aTemp : this.artifactCollection) {
            System.out.println(aTemp.printArtifactDetails());
        }
    }

    /**
     * @param artifact 
     * @return
     */
    public Auction getArtifactAuction(Artifact artifact) {
        // TODO implement here
        return null;
    }

    /**
     * @param auction 
     * @param bidder 
     * @param value 
     * @return
     */
    public String processBid(Auction auction, ArtCollector bidder, Integer value) {
        // TODO implement here
        return "";
    }

    /**
     * @param artifact 
     * @param seller 
     * @param price 
     * @return
     */
    public String processSaleRequest(Artifact artifact, ArtCollector seller, Integer price) {
        // TODO implement here
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Artifact> getArtifactCollection() {
        return artifactCollection;
    }

    public void setArtifactCollection(ArrayList<Artifact> artifactCollection) {
        this.artifactCollection = artifactCollection;
    }

    public ArrayList<Auction> getMuseumAuctions() {
        return museumAuctions;
    }

    public void setMuseumAuctions(ArrayList<Auction> museumAuctions) {
        this.museumAuctions = museumAuctions;
    }

    public ArrayList<SaleRequest> getSaleRequests() {
        return saleRequests;
    }

    public void setSaleRequests(ArrayList<SaleRequest> saleRequests) {
        this.saleRequests = saleRequests;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
}