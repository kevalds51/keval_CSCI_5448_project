package Models.ProfitOperations;

public class CalcSaleProfit implements Strategy {

    /**
     *  Calculate the profit in case of an Sale. The sale processing charges are 5% of the profit
     *  @param sp
     *  @param cp
     *  @return double
     */
    @Override
    public double calcProfit(double cp, double sp) {
        double MUSEUM_CHARGES = 0.05;
        return (sp-cp)*(1-MUSEUM_CHARGES);
    }
}
