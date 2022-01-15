package design_patterns.strategy;

public class ReactStrategyFactory {
    public static ReactStrategy createReactStrategy(String reactStrategy){
        ReactStrategy toReturn = null;
        switch (reactStrategy){
            case "fight" : toReturn = new ReactStrategyFight();
            case "flee" : toReturn = new ReactStrategyFlee();
            default : System.err.println("invalid input");
        }
        return toReturn;
    }
}
