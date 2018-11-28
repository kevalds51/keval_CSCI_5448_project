package Models;

import java.util.*;

/**
 * The class for the administrator staff of the museum
 */
public class Administrator extends MuseumStaff {

    /**
     * Default constructor
     */
    public Administrator(String name, Integer userID, Integer age, String address, String password, Integer annualSalary, Date joinDate, String masterKey) {
        super(name, userID, age, address, password, annualSalary, joinDate);
        this.masterKey = masterKey;
        this.transactionsProcessed=0;
    }

    /**
     *  The master-key provided to admin in order to access all user accounts
     */
    private String masterKey;

    /**
     *  The count of transactions processed by the admin.
     */
    private int transactionsProcessed;

    /**
     * The overridden template of the Template method.
     * @return stats
     **/
    @Override
    String generatePerformanceReport()
    {
        String stats;
        stats = "Administrator: ("+this.getName()+") has processed ("+this.getTransactionsProcessed() + ") transactions";
        return stats;
    }

    /**
     *  Process the approved requests. The admin delivers the artifacts to/from the museum from/to the collector
     *  @param m a Museum
     *  @return retS
     */
    public String processRequests(Museum m) {
        int count=0;

        for (Transaction ti : m.getTransactions()) {
            if (ti.getAdminProcessed() == false) {

                if (ti.getAuctionSale() == true) {
                    m.getArtifactCollection().remove(ti.getArtifact());
                    ti.getOtherParty().getMyArtifacts().add(ti.getArtifact());
                }

                else {
                    m.getArtifactCollection().add(ti.getArtifact());
                    ti.getOtherParty().getMyArtifacts().remove(ti.getArtifact());
                }

                ti.setAdminProcessed(true);
                ti.getOtherParty().getMyTransactions().add(ti);
                count++;
            }
        }

        this.transactionsProcessed += count;

        String retS = "\nThe admin processed: (" + count + ") artifacts";
        return retS;
    }

    /**
     * Add an artifact to the Museum
     * @param ms a Museum
     * @param art an Artifact
     */
    public void addArtifact(Museum ms, Artifact art) {
        ms.addArtifact(art);
    }

    /**
     * Remove an artifact from the museum
     * @param ms a Museum
     * @param art an Artifact
     * @return tempArt
     */
    public Artifact removeArtifact(Museum ms, Artifact art) {
        Artifact tempArt = null;
        for (Artifact aa : ms.getArtifactCollection()) {
            if (art.getArtifactID().equals(aa.getArtifactID())) {
                return art;
            }
        }
        return tempArt;
    }

    public String getMasterKey() {
        return masterKey;
    }

    public int getTransactionsProcessed() { return transactionsProcessed; }

    public void setTransactionsProcessed(int transactionsProcessed) { this.transactionsProcessed = transactionsProcessed; }

    public void setMasterKey(String masterKey) {
        this.masterKey = masterKey;
    }

}