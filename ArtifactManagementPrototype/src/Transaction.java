
import java.util.*;

/**
 * 
 */
public class Transaction {

    /**
     * Default constructor
     */
    public Transaction(Integer transactionID, ArtCollector otherParty, Boolean isAuctionSale, Boolean isPurchase, Integer amount, Artifact artifact, Boolean adminProcessed) {
        this.transactionID = transactionID;
        this.otherParty = otherParty;
        this.isAuctionSale = isAuctionSale;
        this.isPurchase = isPurchase;
        this.amount = amount;
        this.artifact = artifact;
        this.adminProcessed = adminProcessed;
    }

    /**
     * 
     */
    private Integer transactionID;

    /**
     * 
     */
    private ArtCollector otherParty;

    /**
     * 
     */
    private Boolean isAuctionSale;

    /**
     * 
     */
    private Boolean isPurchase;

    /**
     * 
     */
    private Integer amount;

    /**
     * 
     */
    private Artifact artifact;

    /**
     * 
     */
    private Boolean adminProcessed;


    /**
     * @return
     */
    public void viewTranactionDetails() {
        // TODO implement here
//        return null;
    }

    public Integer getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Integer transactionID) {
        this.transactionID = transactionID;
    }

    public ArtCollector getOtherParty() {
        return otherParty;
    }

    public void setOtherParty(ArtCollector otherParty) {
        this.otherParty = otherParty;
    }

    public Boolean getAuctionSale() {
        return isAuctionSale;
    }

    public void setAuctionSale(Boolean auctionSale) {
        isAuctionSale = auctionSale;
    }

    public Boolean getPurchase() {
        return isPurchase;
    }

    public void setPurchase(Boolean purchase) {
        isPurchase = purchase;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Artifact getArtifact() {
        return artifact;
    }

    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
    }

    public Boolean getAdminProcessed() {
        return adminProcessed;
    }

    public void setAdminProcessed(Boolean adminProcessed) {
        this.adminProcessed = adminProcessed;
    }
}