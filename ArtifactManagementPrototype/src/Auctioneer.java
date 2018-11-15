
import java.util.*;

/**
 * 
 */
public class Auctioneer extends MuseumStaff {

    /**
     * Default constructor
     */
    public Auctioneer() {
        this.auctionsHeld = 0;
        this.ratings = 0;
    }

    public Auctioneer(Integer auctionsHeld, Integer ratings) {
        this.auctionsHeld = auctionsHeld;
        this.ratings = ratings;
    }

    /**
     * 
     */
    private Integer auctionsHeld;

    /**
     * 
     */
    private Integer ratings;


    /**
     * @return
     */
    public String getCareerStats() {
        String stats;
        stats = "Auctioneer: ("+this.getName()+") has held ("+this.getAuctionsHeld() + ") auctions with (" +this.getRatings();
        return stats;
    }

    /**
     * @return
     * @param auction
    **/
    public String hostAuction(Auction auction){
        Bid result = auction.goLive();
        if (result.equals(null)){
            return "No acceptable Bids";
        }
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