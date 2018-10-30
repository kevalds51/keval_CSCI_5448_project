
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
    public String printCareerStats() {
        // TODO implement here
        return "";
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