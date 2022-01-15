package interface_;

public interface SubInterface extends Interface{ // extends original interface, class that implements
                                                    // this extends both this and parent methods
    default void smile() { // default method implementation. class that implements can either override this or not write
                                // this method, which will automatically add the default implementation to its API
        System.out.println("smiling");
    }
    // good for convenience methods - implement a general way to use a default method (for instance, with a certain often
    // used input value.
}
