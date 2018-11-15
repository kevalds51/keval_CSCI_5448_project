
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
    public String getEmploymentTime() {
        int years = (int) (((new Date().getTime()) - this.joinDate.getTime())/(365.25*24*60*60*1000));
        return String.format(this.getName()+" has beed employed for: %d year(s)", years);
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