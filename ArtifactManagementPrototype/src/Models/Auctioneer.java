package Models;

import java.util.*;

/**
 * 
 */
public class Auctioneer extends MuseumStaff {

    /**
     * Default constructor
     */
    public Auctioneer() {

    }

    public Auctioneer(String name, Integer userID, Integer age, String address, String password, Integer annualSalary, Date joinDate) {
        super(name, userID, age, address, password, annualSalary, joinDate);
        this.auctionsHeld = 0;
        this.ratings = 0;
    }

    /**
     * 
     */
    private Integer auctionsHeld;

    /**
     * 
     */
    private Integer ratings;

    @Override
    String generatePerformanceReport()
    {
        String stats;
        stats = "Models.Auctioneer: ("+this.getName()+") has held ("+this.getAuctionsHeld() + ") auctions with Rating of: (" +this.getRatings()+")";
        return stats;
    }

    /**
     * @return
     * @param auction
    **/
    public String hostAuction(Auction auction, Museum mu){
        Bid result = auction.goLive();
        if (result.equals(null)){
            return "No acceptable Bids";
        }

        mu.getTransactions().add(new Transaction(auction.getAuctionID(), result.getBidder(), true, false, result.getBidAmount(), auction.getArtifact(), false));
        setAuctionsHeld(getAuctionsHeld()+1);
        setRatings((getRatings()+result.getBidAmount()/1000));
        return "The winner is: ("+result.getBidder().getName()+") with a bid of: ("+result.getBidAmount()+")";
    }

    public Integer getAuctionsHeld() {
        return auctionsHeld;
    }

    public void setAuctionsHeld(Integer auctionsHeld) {
        this.auctionsHeld = auctionsHeld;
    }

    public Integer getRatings() {
        return ratings;
    }

    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }
}