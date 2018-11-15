
import java.util.*;

/**
 * 
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
     * 
     */
    private ArtCollector bidder;

    /**
     * 
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