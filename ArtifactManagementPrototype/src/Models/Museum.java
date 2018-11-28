package Models;

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

    public Museum(String name, ArrayList<Artifact> artifactCollection) {
        this.name = name;
        this.artifactCollection = artifactCollection;
        this.museumAuctions = new ArrayList<Auction>();
        this.saleRequests = new ArrayList<SaleRequest>();
        this.transactions = new ArrayList<Transaction>();
        this.saleRequestID = 19000;
    }

    /**
     *
     */
    private String name = "aMuseum";

    /**
     *
     */
    private int saleRequestID ;

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
        System.out.println("\n--- The Models.Museum Catalogue (start) ---\n");
        int c = 0;
        for (Artifact aTemp : this.artifactCollection) {
            System.out.printf("(%d) %s%n", ++c, aTemp.printArtifactDetails());
        }
        System.out.println("\n--- The Models.Museum Catalogue (end) ---\n");
    }

    public void printOpenAuctions(){
        System.out.println("\n--- Upcoming Auctions (start) ---\n");
        int c = 1;
        for (Auction atn : this.museumAuctions) {
            System.out.print("("+c+") ");
            atn.printAuctionDetails();
            c++;
        }
        System.out.println("\n\n--- Upcoming Auctions (end) ---\n");
    }

    /**
     * @param auid
     * @param bidder 
     * @param value 
     * @return
     */
    public String processBid(int auid, ArtCollector bidder, Integer value) {
        for (Auction thisAuction: this.getMuseumAuctions()) {
            if (thisAuction.getAuctionID() == auid)
            {
                thisAuction.addBid(bidder, value);
                return "The bid from: ("+bidder.getName()+") was submitted to Models.Auction: ("+thisAuction.getAuctionID()+")";
            }
        }

        return "No such Models.Auction Exists";
    }

    /**
     * @return
     */
    public int processSaleRequests() {

        int nSR = this.saleRequests.size();
        if (nSR == 0) {
            return 0;
        }

        int approvedSR=0;

        for (int iter=0; iter<this.saleRequests.size(); iter++) {

            SaleRequest aRequest = this.saleRequests.get(iter);
            ArrayList<SaleRequest> tempRequests = new ArrayList<SaleRequest>();

            int thisID = aRequest.getArtifact().getArtifactID();
            for (SaleRequest request : this.saleRequests) {
                if (request.getArtifact().getArtifactID() == thisID){
                    tempRequests.add(request);
                }
            }

            int bestPrice = 100000000;
            SaleRequest bestRequest = null;
            for (SaleRequest request : tempRequests){
                if (request.getPrice() < bestPrice)
                {
                    bestRequest = request;
                }

                this.saleRequests.remove(request);
            }

            Artifact thisArtifact = bestRequest.getArtifact();
            ArtCollector thisCollector = bestRequest.getCollector();
            this.transactions.add(new Transaction(bestRequest.getRequestID(), thisCollector, false, true, bestPrice, thisArtifact, false));

            ++approvedSR;
        }

        return  approvedSR;
    }

    /**
     * @param artifact
     * @param seller
     * @param price
     * @return
     */
    public String addSaleRequest(Artifact artifact, ArtCollector seller, Integer price) {

        this.saleRequestID++;
        this.saleRequests.add(new SaleRequest(this.saleRequestID, seller, price, artifact));
        return "Sale Request: ("+this.saleRequestID+") accepted";
    }

    public void addArtifact(Artifact artifact)
    {
        this.artifactCollection.add(artifact);
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