
import java.util.*;

/**
 * 
 */
public class artifactStatus {

    /**
     * Default constructor
     */
    public artifactStatus() {
    }

    public artifactStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    /**
     * 
     */
    private String currentStatus = "closed";


    /**
     * @return
     */
    public String getCurrentStatus() {
        return currentStatus;
    }
}