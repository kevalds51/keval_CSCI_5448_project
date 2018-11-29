package Models;

import Models.ProfitOperations.CalcAuctionProfit;
import Models.ProfitOperations.CalcSaleProfit;
import Models.ProfitOperations.Context;

/**
 * The class signifying a "Transaction"
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
     * The unique ID assigned to each transaction
     */
    private Integer transactionID;

    /**
     * The profit that was generated from the transactions
     */
    private double profit;

    /**
     * The other party that bought/sold the artifact
     */
    private ArtCollector otherParty;

    /**
     * True if the transaction was an auction outcome
     */
    private Boolean isAuctionSale;

    /**
     *  True if the transaction was an approved sale request
     */
    private Boolean isPurchase;

    /**
     * The transaction amount
     */
    private Integer amount;

    /**
     * The artifact that was exchanged
     */
    private Artifact artifact;

    /**
     * Boolean for telling if the transaction was Processed or not
     */
    private Boolean adminProcessed;


    /**
     * This method returns all transaction details as a string
     * @return detailString
     */
    public String viewTranactionDetails()
    {
        String detailString="";

        if (this.getAuctionSale())
        {
            detailString = "("+this.getAdminProcessed()+") Models.Transaction ID: ("+this.getTransactionID()+") "+"Artifact ID: ("+this.getArtifact().getArtifactID()+") "+"Amount: ("+this.getAmount()+") "+" Auction winner:" + this.getOtherParty();
        }

        if (this.getPurchase())
        {
            detailString = "("+this.getAdminProcessed()+") Models.Transaction ID: ("+this.getTransactionID()+") "+"Artifact ID: ("+this.getArtifact().getArtifactID()+") "+"Amount: ("+this.getAmount()+") "+" Seller:" + this.getOtherParty();
        }

        return detailString;
    }

    /**
     * Implemented the Strategy design pattern to calculate the correct profit during runtime
     * The classes involved in the design pattern are in the Profit Operations package
     */
    public void calcProfit()
    {
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
     * Returns the transactions with just the profit.
     * @return detail
     */
    public String getTransactionDetails() {
        String detail = "Transaction ID: "+this.getTransactionID() + " Artifact ID: " + this.getArtifact().getArtifactID() + " Profit/Loss: " + this.getProfit();
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