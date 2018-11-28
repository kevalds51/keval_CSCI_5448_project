package Models;

import java.util.*;

/**
 *  The class for "Artifact Status"
 */
public class artifactStatus {

    /**
     * Default constructor
     */
    public artifactStatus() {
    }

    /**
     * Detailed constructor
     */
    public artifactStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    /**
     *  The current status
     */
    private String currentStatus = "closed";


    /**
     * This method returns the current status of the artifact
     * @return
     */
    public String getCurrentStatus() {
        return currentStatus;
    }
}