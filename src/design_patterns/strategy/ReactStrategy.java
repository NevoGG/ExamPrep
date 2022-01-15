package design_patterns.strategy;

/**
 * a specific use of a factory and an interface, made for when you need to select a certain behavior out of a few possibilities
 * to conduct the same action (for instance- sortin, can be done with quickSort, MergeSort...)
 * Principles - single choice and encapsulation
 * gives the advantage of changing the behavior of an instance mid run.
 */
public interface ReactStrategy {
    void react();
}
