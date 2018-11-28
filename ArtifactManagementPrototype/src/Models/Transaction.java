package Models;

import Models.ProfitOperations.CalcAuctionProfit;
import Models.ProfitOperations.CalcSaleProfit;
import Models.ProfitOperations.Context;

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
        String detailString="";

        if (this.getAuctionSale())
        {
            detailString = "("+this.getAdminProcessed()+") Models.Transaction ID: ("+this.getTransactionID()+") "+"Models.Artifact ID: ("+this.getArtifact().getArtifactID()+") "+"Amount: ("+this.getAmount()+") "+" Models.Auction winner:" + this.getOtherParty();
        }

        if (this.getPurchase())
        {
            detailString = "("+this.getAdminProcessed()+") Models.Transaction ID: ("+this.getTransactionID()+") "+"Models.Artifact ID: ("+this.getArtifact().getArtifactID()+") "+"Amount: ("+this.getAmount()+") "+" Seller:" + this.getOtherParty();
        }

        return detailString;
    }

    public void calcProfit()
    {
        // Implemented the Models.ProfitOperations.Strategy design pattern to calculate the correct profit during runtime
        if (this.getPurchase())
        {
            Context context = new Context(new CalcSaleProfit());
            this.profit = context.executeStrategy(this.amount, this.artifact.getValue());
        }

        else if (this.getAuctionSale())
        {
            Context context = new Context(new CalcAuctionProfit());
            this.profit = context.executeStrategy(this.artifact.getValue(), this.amount);
        }
    }

    /**
     * @return detail
     */
    public String getTransactionDetails() {
        String detail = "Models.Transaction ID: "+this.getTransactionID() + " Models.Artifact ID: " + this.getArtifact().getArtifactID() + " Profit/Loss: " + this.getProfit();
        return detail;
    }

    public double getProfit() { return profit; }

    public void setProfit(double profit) { this.profit = profit; }

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