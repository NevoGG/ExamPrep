package design_patterns.state;

/**
 * Similar to strategy. the difference is we usually use state to switch between a final amount
 * of different states, in oppose to strategy which is controlled by a factory and can be expanded endlessly
 * also, state is about configurations of an object, which effects behavior but not only.
 * strategy is centered around a behavior in a certain situation.
 */
public class Context implements State{
    // save all different state options:
    State state1;
    State state2;
    State curState;

    public Context(){
        state1 = new State1();
        state2 = new State2();
        curState = state1; // default state.
    }

    public void setState(State newState){ // important, allows the modulation of the current state
        curState = newState;
    }

    @Override
    public void action1() {
        curState.action1();
    }

    @Override
    public void action2() {
        curState.action2();
    }

    @Override
    public int action3(int c) {
        curState.action3(c);
        return 0;
    }
}
