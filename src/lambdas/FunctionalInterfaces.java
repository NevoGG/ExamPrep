package lambdas;

import java.util.function.*;

public class FunctionalInterfaces {
    Predicate<Integer> predicat = (i) -> (i % 2 == 0); // input is T (defined when creating instance with Generics), output is boolean
    Runnable runnable = () -> System.out.println("Runnable!"); // no input, void output.
    Consumer<Integer> consumer = (i) -> System.out.println(i); // input is T, no output.
    Supplier<String> supplier = () -> "string"; // no input, output of T
    Function<Integer, Integer> function = (i) -> (i + 5); // input T, output E.
    BiFunction<Integer, Integer, Integer> biFunction = (i, j) -> i*j; // input of T,E. output of U.get

    private void useFunctionalInterfaces(){
        predicat.test(5);
        runnable.run();
        consumer.accept(5);
        supplier.get();
        int funcOutcome = function.apply(5);
        int biFunctionOutcome = biFunction.apply( 2, 3);
    }
}
