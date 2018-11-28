package Models;

import java.util.*;

/**
 * 
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
     *
     */
    private String masterKey;

    /**
     *
     */
    private int transactionsProcessed;

    @Override
    String generatePerformanceReport()
    {
        String stats;
        stats = "Models.Administrator: ("+this.getName()+") has processed ("+this.getTransactionsProcessed() + ") transactions";
        return stats;
    }

    /**
     *
     *  I want to go through the unprocessed and make the add/remove.
     *  Also make add/removes to the other party that is involved!
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

        return "\nThe admin processed: (" + count + ") artifacts";
    }

    /**
     * @param ms 
     * @param art
     */
    public void addArtifact(Museum ms, Artifact art) {
        ms.addArtifact(art);
    }

    /**
     * @param ms 
     * @param art 
     * @return
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