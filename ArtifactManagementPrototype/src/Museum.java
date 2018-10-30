
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

    public Museum(String name, Set<Artifact> artifactCollection, Set<Auction> museumAuctions, Set<SaleRequest> saleRequests, Set<Transaction> transactions) {
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
    private Set<Artifact> artifactCollection;

    /**
     * 
     */
    private Set<Auction> museumAuctions;

    /**
     * 
     */
    private Set<SaleRequest> saleRequests;

    /**
     * 
     */
    private Set<Transaction> transactions;


    /**
     * @return
     */
    public Set<String> printArtifactCollection() {
        // TODO implement here
        return null;
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

    public Set<Artifact> getArtifactCollection() {
        return artifactCollection;
    }

    public void setArtifactCollection(Set<Artifact> artifactCollection) {
        this.artifactCollection = artifactCollection;
    }

    public Set<Auction> getMuseumAuctions() {
        return museumAuctions;
    }

    public void setMuseumAuctions(Set<Auction> museumAuctions) {
        this.museumAuctions = museumAuctions;
    }

    public Set<SaleRequest> getSaleRequests() {
        return saleRequests;
    }

    public void setSaleRequests(Set<SaleRequest> saleRequests) {
        this.saleRequests = saleRequests;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }
}