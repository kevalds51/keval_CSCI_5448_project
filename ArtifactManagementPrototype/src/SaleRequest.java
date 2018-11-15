
import java.util.*;

/**
 * 
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
     * 
     */
    private Integer requestID;

    /**
     * 
     */
    private ArtCollector collector;

    /**
     * 
     */
    private Integer price;

    /**
     * 
     */
    private Artifact artifact;


    /**
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