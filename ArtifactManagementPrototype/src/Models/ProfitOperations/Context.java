package Models.ProfitOperations;

/**
 *  This class is a part of the Strategy design pattern
 */
public class Context {

    /**
     *  The strategy selected will go here
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