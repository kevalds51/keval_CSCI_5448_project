package Models;

import java.util.*;

/**
 *  The abstract class for Museum staff
 */
public abstract class MuseumStaff extends Person {

    /**
     * Default constructor
     */
    public MuseumStaff() {
    }

    /**
     * Detailed constructor
     */
    public MuseumStaff(String name, Integer userID, Integer age, String address, String password, Integer annualSalary, Date joinDate) {

        super(name, userID, age, address, password);

        this.annualSalary = annualSalary;
        this.joinDate = joinDate;
    }

    /**
     * The annual salary of the employee
     */
    private Integer annualSalary;

    /**
     * The date the employee joined the company
     */
    private Date joinDate;

    /**
     * The abstract method that is a part of the Template design patter for generating employee reports.
     * This will be overwritten by all the concrete subclasses for their personal implementation.
     */
    abstract String generatePerformanceReport();

    /**
     * This final method is a part of the Template design patter for generating employee reports.
     * The implementation in this final method is common to all the subclasses.
     * @param report the performance report as a string
     * @return
     */
    public final void basicReport(String report){
        System.out.println("\n\t--- Employee Report for: " + this.getName()+" ---");
        System.out.println(this.getEmploymentTime());
        System.out.println(report);
    };

    /**
     * This is the Template method/wrapper.
     * @return
     */
    public final void printEmployeeReport() {
        // generate performance report
        String report = generatePerformanceReport();
        // Append to basic report
        basicReport(report);
    }

    /**
     * This method will calculate the employment duration
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