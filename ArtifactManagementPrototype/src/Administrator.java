
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
    }

    /**
     * 
     */
    private String masterKey;

    /**
     * @param ms 
     * @param art
     */
    public void addArtifact(Museum ms, Artifact art) {
        // TODO implement here
    }

    /**
     * @param ms 
     * @param art 
     * @return
     */
    public Artifact removeArtifact(Museum ms, Artifact art) {
        // TODO implement here
        return null;
    }

    /**
     * @param p 
     * @return
     */
    public void updateUserData(Person p) {
        // TODO implement here
//        return null;
    }

    public String getMasterKey() {
        return masterKey;
    }

    public void setMasterKey(String masterKey) {
        this.masterKey = masterKey;
    }

}