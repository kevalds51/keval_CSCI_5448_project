
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

    public Auction(int auctionID, Date auctionDate, Auctioneer auctioneer, Artifact artifact) {
        this.auctionID = auctionID;
        this.auctionDate = auctionDate;
        this.auctioneer = auctioneer;
        this.artifact = artifact;
        this.bids = new ArrayList<Bid>();
    }

    public Auction(Integer auctionID, Date auctionDate, Auctioneer auctioneer, Artifact artifact, ArrayList<Bid> bids, Bid result) {
        this.auctionID = auctionID;
        this.auctionDate = auctionDate;
        this.auctioneer = auctioneer;
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
     * @param bidder 
     * @param value 
     * @return
     */
    public void addBid(ArtCollector bidder, Integer value) {
        this.bids.add(new Bid(bidder, value));
    }

    /**
     * @return
     */
    public Bid goLive() {
        Bid winner = null;
        int winnerValue = 0;
        for (Bid aBid: this.bids) {
            if (aBid.getBidAmount()>winnerValue){
                winnerValue = aBid.getBidAmount();
                winner = aBid;
            }
        }
        return winner;
    }

    public void printAuctionDetails(){
        String details = "Auction (ID = "+this.auctionID+")"+" of "+this.artifact.getTitle()+" ("+this.artifact.getArtifactID() + "), worth " + this.artifact.getValue() + " is scheduled on "+ this.auctionDate.toString();
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