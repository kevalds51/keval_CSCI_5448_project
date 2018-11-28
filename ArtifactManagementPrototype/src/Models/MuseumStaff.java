package Models;

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

    abstract String generatePerformanceReport();

    /**
     * @param report
     * @return
    */
    public final void basicReport(String report){
        System.out.println("\n\t--- Employee Report for: " + this.getName()+" ---");
        System.out.println(this.getEmploymentTime());
        System.out.println(report);
    };

    /**
     * @return
     * this is the template method
     */
    public final void printEmployeeReport() {
        // generate performance report
        String report = generatePerformanceReport();
        // Append to basic report
        basicReport(report);
    }

    /**
     * @return eTime
     */
    public String getEmploymentTime() {
        int years = (int) (((new Date().getTime()) - this.joinDate.getTime())/(365.25*24*60*60*1000));
        String eTime = String.format(this.getName()+" has beed employed for: %d year(s)", years);
        return eTime;
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