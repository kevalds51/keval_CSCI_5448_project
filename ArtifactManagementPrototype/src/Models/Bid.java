package Models;

/**
 *  The class for a Bid.
 */
public class Bid {

    /**
     * Default constructor
     */
    public Bid(ArtCollector bidder, Integer bidAmount) {
        this.bidder = bidder;
        this.bidAmount = bidAmount;
    }

    /**
     *  The Collector who bid
     */
    private ArtCollector bidder;

    /**
     *  The bid value/amount
     */
    private Integer bidAmount;

    public ArtCollector getBidder() {
        return bidder;
    }

    public void setBidder(ArtCollector bidder) {
        this.bidder = bidder;
    }

    public Integer getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(Integer bidAmount) {
        this.bidAmount = bidAmount;
    }
}