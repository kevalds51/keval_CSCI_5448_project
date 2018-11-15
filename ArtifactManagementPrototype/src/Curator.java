
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

    public Curator(String name, Integer userID, Integer age, String address, String password, Integer annualSalary, Date joinDate) {
        super(name, userID, age, address, password, annualSalary, joinDate);
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
     * @param artID
     * @param artSt 
     * @return
     */
    public Auction declareAuction(Museum aMuseum, int artID, artifactStatus artSt, Date aDate, Auctioneer auctioneer, int auctionID) {
        for (Artifact anArt : aMuseum.getArtifactCollection())
        {
            if (anArt.getArtifactID() == artID)
            {
                anArt.setStatus(artSt);

                Auction anAuct = new Auction(auctionID, aDate, auctioneer, anArt);
                aMuseum.getMuseumAuctions().add(anAuct);
                return anAuct;
            }
        }

        return null;
    }

    /**
     * @param museum 
     * @return
     */
    public String evaulateSalesRequests(Museum museum) {
        String report = museum.processSaleRequests();
        return report;
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