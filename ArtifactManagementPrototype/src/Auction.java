
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

    public Auction(Integer auctionID, Date auctionDate, Auctioneer auctioneer, Artifact artifact, ArrayList<Bid> bids, Bid result) {
        this.auctionID = auctionID;
        this.auctionDate = auctionDate;
        this.auctioneer = auctioneer;
        this.artifact = artifact;
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
    private Auctioneer auctioneer;

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
     * @return
     */
    public ArrayList<String> printAuctionDetails() {
        // TODO implement here
        return null;
    }

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

    public Auctioneer getAuctioneer() {
        return auctioneer;
    }

    public void setAuctioneer(Auctioneer auctioneer) {
        this.auctioneer = auctioneer;
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