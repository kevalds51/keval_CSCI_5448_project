package Models.ProfitOperations;

public class CalcAuctionProfit implements  Strategy {

    /**
     *  Calculate the profit incase of an Auction. The auction charges are 15% of the profit
     *  @param cp
     *  @param sp
     *  @return double
     */
    @Override
    public double calcProfit(double cp, double sp) {
        double AUCTION_CHARGE = 0.15;
        return (sp-cp)*(1-AUCTION_CHARGE);
    }
}
