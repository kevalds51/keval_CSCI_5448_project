
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

    public MuseumStaff(Integer annualSalary, Date joinDate) {
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