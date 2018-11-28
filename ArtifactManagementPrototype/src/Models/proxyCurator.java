package Models;

import java.util.Date;

public class proxyCurator extends MuseumStaff implements CuratorInt {

    private Curator realCurator;
    private String fileName;

    /**
     *  The count of deals sealed by the curator
     */
    private Integer dealCounts = 0;

    /**
     *  The value of the highest deal ever sealed.
     */
    private Integer highestTransactionValue = 0;

    /**
     * Default constructor
     */
    public proxyCurator() {

    }

    public proxyCurator(String name, Integer userID, Integer age, String address, String password, Integer annualSalary, Date joinDate) {
        super(name, userID, age, address, password, annualSalary, joinDate);
    }

    @Override
    public String evaulateSalesRequests(Museum museum)
    {
        if(realCurator == null){
            realCurator = new Curator(this.getName(), this.getUserID(), this.getAge(), this.getAddress(), this.getPassword(), this.getAnnualSalary(), this.getJoinDate());
            return realCurator.evaulateSalesRequests(museum);
        }

        else {
            return "cannot evaluate again";
        }
    }


    /**
     * The overridden template of the Template method.
     * @return stats
     **/
    @Override
    String generatePerformanceReport()
    {
        String stats;
        stats = "Models.Curator: ("+this.getName()+") has approved ("+this.getDealCounts() + ") deals";
        return stats;
    }

    public Integer getDealCounts() {
        return dealCounts;
    }

    public void setDealCounts(Integer dealCounts) {
        this.dealCounts = dealCounts;
    }

    public Integer getHighestTransactionValue() {
        return highestTransactionValue;
    }

    public void setHighestTransactionValue(Integer highestTransactionValue) {
        this.highestTransactionValue = highestTransactionValue;
    }
}