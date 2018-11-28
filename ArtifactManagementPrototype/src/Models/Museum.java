package Models;

import java.util.*;

/**
 *  The "Museum" class: the center point of the design
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
     *  The name of the Museum
     */
    private String name = "aMuseum";

    /**
     *  The sale requests that will be assigned by the Museum
     */
    private int saleRequestID ;

    /**
     *  The list of the Artifacts at the Museum.
     */
    private ArrayList<Artifact> artifactCollection;

    /**
     *  The list of the Auctions hosted by the Museum.
     */
    private ArrayList<Auction> museumAuctions;

    /**
     *  The list of the Sale requests.
     */
    private ArrayList<SaleRequest> saleRequests;

    /**
     *  The list of the approved transactions.
     */
    private ArrayList<Transaction> transactions;


    /**
     * This method will print the Artifact Catalogue of the Museum
     * @return
     */
    public void printArtifactCollection() {
        System.out.println("\n--- The Museum Catalogue (start) ---\n");
        int c = 0;
        for (Artifact aTemp : this.artifactCollection) {
            System.out.printf("(%d) %s%n", ++c, aTemp.printArtifactDetails());
        }
        System.out.println("\n--- The Museum Catalogue (end) ---\n");
    }

    /**
     * This method will print the scheduled auctions of the Museum
     */
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
     * This method will process the bid submitted by a Collector
     * @param auid the auction ID
     * @param bidder the bidder, an Artifact Collector
     * @param value the value of the bid
     * @return String
     */
    public String processBid(int auid, ArtCollector bidder, Integer value) {
        for (Auction thisAuction: this.getMuseumAuctions()) {
            if (thisAuction.getAuctionID() == auid)
            {
                thisAuction.addBid(bidder, value);
                return "The bid from: ("+bidder.getName()+") was submitted toAuction: ("+thisAuction.getAuctionID()+")";
            }
        }

        return "No such Auction Exists";
    }

    /**
     * This method will allow the Curator to look at all the Sale requests and then choose the ones to approve.
     * @return approvedSR
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
     * This method will process and add a sale request to the list of sale requests at the Museum.
     * @param artifact an Artifact
     * @param seller the seller, an Art Collector
     * @param price the selling price demanded
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