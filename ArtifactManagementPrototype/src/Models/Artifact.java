package Models;

/**
 * 
 */
public class Artifact {

    /**
     * Default constructor
     */
    public Artifact() {
    }

    public Artifact(Integer artifactID, String title, String artistName, artifactStatus status, Integer value) {
        this.artifactID = artifactID;
        this.title = title;
        this.artistName = artistName;
        this.status = status;
        this.value = value;
    }

    /**
     * 
     */
    private Integer artifactID;

    /**
     *
     */
    private Integer auctionID = null;

    /**
     * 
     */
    private String title = "unknown";

    /**
     * 
     */
    private String artistName = "unknown";

    /**
     * 
     */
    private artifactStatus status;

    /**
     * 
     */
    private Integer value = 0;

    /**
     * @return
     */
    public String printArtifactDetails() {
        String details = this.getTitle()+" ("+this.getArtifactID()+")"+" by "+this.artistName + ", worth " + this.getValue() + " is currently " +this.getStatus().getCurrentStatus();
        return details;
    }


    public void setAuctionID(Integer auctionID) {
        this.auctionID = auctionID;
    }

    public Integer getArtifactID() {
        return artifactID;
    }

    public void setArtifactID(Integer artifactID) {
        this.artifactID = artifactID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public artifactStatus getStatus() {
        return status;
    }

    public void setStatus(artifactStatus status) {
        this.status = status;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}