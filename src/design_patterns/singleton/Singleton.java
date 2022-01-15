package design_patterns.singleton;

import java.util.ArrayList;

public class Singleton {
    private static ArrayList<String> data;
    private static final Singleton singleInstance = new Singleton(); // has to be final in order to create only one instance.

    private Singleton(){ // has to be private! can only be accessed from method.
        // init data
    }

    public Singleton getInstance(){ // has to be implemented, only access to constructor. can be modified to create any
                                        // limited amount of instances.
        return singleInstance;
    }
}
