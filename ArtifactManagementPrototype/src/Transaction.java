
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

        this.calcProfit();
    }

    /**
     * 
     */
    private Integer transactionID;

    /**
     *
     */
    private double profit;

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
     * @return detailString
     */
    public String viewTranactionDetails()
    {
        // TODO: Potential to use the strategy pattern here to check if its a sale or a purchase
        String detailString="";

        if (this.getAuctionSale())
        {
            detailString = "("+this.getAdminProcessed()+") Transaction ID: ("+this.getTransactionID()+") "+"Artifact ID: ("+this.getArtifact().getArtifactID()+") "+"Amount: ("+this.getAmount()+") "+" Auction winner:" + this.getOtherParty();
        }

        if (this.getPurchase())
        {
            detailString = "("+this.getAdminProcessed()+") Transaction ID: ("+this.getTransactionID()+") "+"Artifact ID: ("+this.getArtifact().getArtifactID()+") "+"Amount: ("+this.getAmount()+") "+" Seller:" + this.getOtherParty();
        }

        return detailString;
    }

    public void calcProfit()
    {
        // TODO: Potential to use the strategy pattern here to check if its a sale or a purchase
        if (this.getPurchase())
        {
            this.profit = this.artifact.getValue()-this.amount;
        }

        else if (this.getAuctionSale())
        {
            this.profit = this.amount - this.artifact.getValue();
        }
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