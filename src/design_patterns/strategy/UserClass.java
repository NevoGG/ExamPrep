package design_patterns.strategy;

public class UserClass{
    private ReactStrategy reactStrategy= ReactStrategyFactory.createReactStrategy("fight");

    public void react(){
        reactStrategy.react();
    }
}
