package Models.ProfitOperations;

public class Context {

    /**
     *
     */
    private Strategy strategy;

    /**
     * Default constructor
     */
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public double executeStrategy(double cp, double sp){
        return strategy.calcProfit(cp, sp);
    }
}