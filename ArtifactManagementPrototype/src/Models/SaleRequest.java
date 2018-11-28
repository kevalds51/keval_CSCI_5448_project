package Models;

/**
 *  The class for modelling the "Sale requests"
 */
public class SaleRequest {

    /**
     * Default constructor
     */
    public SaleRequest() {
    }

    public SaleRequest(Integer requestID, ArtCollector collector, Integer price, Artifact artifact) {
        this.requestID = requestID;
        this.collector = collector;
        this.price = price;
        this.artifact = artifact;
    }

    /**
     * The unique ID given to each sale request
     */
    private Integer requestID;

    /**
     *  The collector who is the seller here
     */
    private ArtCollector collector;

    /**
     *  The asked sell price
     */
    private Integer price;

    /**
     *  The artifact that is to be sold
     */
    private Artifact artifact;


    /**
     * Returns the request details as a single string
     * @return
     */
    public String printRequestDetails() {
        String detailString;
        detailString = "Request ID ("+this.getRequestID()+") " + "Seller ID ("+this.getCollector().getUserID()+") "+ "Artiface ID ("+this.getArtifact().getArtifactID()+") "+ "Quoted price ("+this.getPrice()+") ";
        return detailString;
    }

    public Integer getRequestID() {
        return requestID;
    }

    public void setRequestID(Integer requestID) {
        this.requestID = requestID;
    }

    public ArtCollector getCollector() {
        return collector;
    }

    public void setCollector(ArtCollector collector) {
        this.collector = collector;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Artifact getArtifact() {
        return artifact;
    }

    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
    }
}