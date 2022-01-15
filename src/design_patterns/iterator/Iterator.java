package design_patterns.iterator;

public interface Iterator<T> { // an iterator of a generic type
    T next();
    boolean hasNext(); // basic iterator methods.
}
