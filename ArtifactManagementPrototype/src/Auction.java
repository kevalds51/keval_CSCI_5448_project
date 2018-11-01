
import java.util.*;

/**
 * 
 */
public class Auction {

    /**
     * Default constructor
     */
    public Auction() {
    }

    public Auction(int auctionID, Date auctionDate, int auctioneerID, Artifact artifact) {
        this.auctionID = auctionID;
        this.auctionDate = auctionDate;
        this.auctioneerID = auctioneerID;
        this.artifact = artifact;
    }

    public Auction(Integer auctionID, Date auctionDate, int auctioneerID, Artifact artifact, ArrayList<Bid> bids, Bid result) {
        this.auctionID = auctionID;
        this.auctionDate = auctionDate;
        this.auctioneerID = auctioneerID;
        this.artifact = artifact;
        this.bids = bids;
        this.result = result;
    }

    /**
     * 
     */
    private Integer auctionID;

    /**
     * 
     */
    private Date auctionDate;

    /**
     * 
     */
    private int auctioneerID;

    /**
     * 
     */
    private Artifact artifact;

    /**
     * 
     */
    private ArrayList<Bid> bids;

    /**
     * 
     */
    private Bid result = null;


    /**
     * @param bidder 
     * @param value 
     * @return
     */
    public void addBid(ArtCollector bidder, Integer value) {
        // TODO implement here
//        return null;
    }

    /**
     * @return
     */
    public Bid goLive() {
        // TODO implement here
        return null;
    }

    public void printAuctionDetails(){
        String details = "Auction (ID = "+this.auctionID+")"+" of "+this.artifact.getTitle()+" ("+this.artifact.getArtifactID() + "), worth " + this.artifact.getValue() + " is scheduled on "+ this.auctionDate.toString();
//        return details;
        System.out.printf(details);
    }

    public Integer getAuctionID() {
        return auctionID;
    }

    public void setAuctionID(Integer auctionID) {
        this.auctionID = auctionID;
    }

    public Date getAuctionDate() {
        return auctionDate;
    }

    public void setAuctionDate(Date auctionDate) {
        this.auctionDate = auctionDate;
    }

    public int getAuctioneer() {
        return auctioneerID;
    }

    public void setAuctioneer(int auctioneer) {
        this.auctioneerID = auctioneer;
    }

    public Artifact getArtifact() {
        return artifact;
    }

    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
    }

    public ArrayList<Bid> getBids() {
        return bids;
    }

    public void setBids(ArrayList<Bid> bids) {
        this.bids = bids;
    }

    public Bid getResult() {
        return result;
    }

    public void setResult(Bid result) {
        this.result = result;
    }
}