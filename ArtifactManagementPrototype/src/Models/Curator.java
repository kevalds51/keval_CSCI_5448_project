package Models;

import java.util.*;

/**
 *  The class for modelling the "Curator"
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
     *  The count of deals sealed by the curator
     */
    private Integer dealCounts = 0;

    /**
     *  The value of the highest deal ever sealed.
     */
    private Integer highestTransactionValue = 0;

    /**
     * The overridden template of the Template method.
     * @return stats
     **/
    @Override
    String generatePerformanceReport()
    {
        String stats;
        stats = "Models.Curator: ("+this.getName()+") has approved ("+this.getDealCounts() + ") deals";
        return stats;
    }

    /**
     * This method will add an auction to the list of upcoming auctions.
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
     * This method will allow the curator to evaluate the sale requests and choose the ones to approve.
     * @param museum 
     * @return report
     */
    public String evaulateSalesRequests(Museum museum) {
        int appCount = museum.processSaleRequests();
        this.setDealCounts(this.getDealCounts()+appCount);
        String report = "The Models.Curator approved: ("+appCount+") purchases";
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