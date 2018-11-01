
import java.util.*;

/**
 * 
 */
public abstract class MuseumStaff extends Person {

    /**
     * Default constructor
     */
    public MuseumStaff() {
    }

    public MuseumStaff(String name, Integer userID, Integer age, String address, String password, Integer annualSalary, Date joinDate) {

        super(name, userID, age, address, password);

        this.annualSalary = annualSalary;
        this.joinDate = joinDate;
    }

    /**
     * 
     */
    private Integer annualSalary;

    /**
     * 
     */
    private Date joinDate;

    /**
     * @return
     */
    public String printEmploymentTime() {
        // TODO implement here
        return "";
    }

    public Integer getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(Integer annualSalary) {
        this.annualSalary = annualSalary;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}