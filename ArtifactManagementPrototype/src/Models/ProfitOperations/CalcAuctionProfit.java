package Models.ProfitOperations;

public class CalcAuctionProfit implements  Strategy {
    @Override
    public double calcProfit(double cp, double sp) {
        double AUCTION_CHARGE = 0.15;
        return (sp-cp)*(1-AUCTION_CHARGE);
    }
}
