
import java.util.*;

/**
 * 
 */
public class Curator extends MuseumStaff {

    /**
     * Default constructor
     */
    public Curator() {
    }

    /**
     * 
     */
    private Integer dealCounts = 0;

    /**
     * 
     */
    private Integer highestTransactionValue = 0;

    /**
     * @param artifact 
     * @param artSt 
     * @return
     */
    public void updateArtifactStatus(Artifact artifact, String artSt) {
        // TODO implement here
//        return null;
    }

    /**
     * @param museum 
     * @return
     */
    public String evaulateSalesRequests(Museum museum) {
        // TODO implement here
        return "";
    }

    public Integer getDealCounts() {
        return dealCounts;
    }

    public void setDealCounts(Integer dealCounts) {
        this.dealCounts = dealCounts;
    }

    public Integer getHighestTransactionValue() {
        return highestTransactionValue;
    }

    public void setHighestTransactionValue(Integer highestTransactionValue) {
        this.highestTransactionValue = highestTransactionValue;
    }
}