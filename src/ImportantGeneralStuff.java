import java.util.function.Consumer;
import java.util.function.Supplier;

public class ImportantGeneralStuff {

    /**
     * instanceOf()
     * isEqual() avoid pointer problems
     * visibility status - private, public, protected (only by extension), package (same package files)
     *
     * STRING STUFF:
     * String.format("Hello %s, how is your %d", "moshe", "leg")
     * String.join(", ", fruitArr) - "apple, kiwi, orange"
     *
     * Assert: assert !isStillRunning : "not running!"
     *
     * TO REMEMBER:
     * - functional interface methods
     * - regex syntax TA9
     * algo
     * principles!! single choice, open - closed......
     * invariance / covariance
     */
    public void whatever() {
        int a = 1, b = 2;
        Supplier<Integer> consumer = () -> {
            if (a > b) return a;
            else return b;
        };
    }
}
