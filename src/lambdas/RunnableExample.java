package lambdas;

@FunctionalInterface // marks that this is a functional interface.
public interface RunnableExample{
    void doSomething(); // a runnable has one public abstract class with no input and no output.
    default void doSomethingElse(){
        System.out.println("doing something!"); // a runnable can have a default function. as long as only one method requires implementing
    }
    private void anotherThing(){
        // implement helper method. also doesn't bother runnable
    }
}
