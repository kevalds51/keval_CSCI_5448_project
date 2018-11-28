package Models.ProfitOperations;

public class CalcSaleProfit implements Strategy {
    @Override
    public double calcProfit(double cp, double sp) {
        double MUSEUM_CHARGES = 0.05;
        return (sp-cp)*(1-MUSEUM_CHARGES);
    }
}
