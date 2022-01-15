package design_patterns.iterator;

public interface Aggregate<E>{ // the aggregate data type to which we want to create an iterator.
    Iterator<E>createIterator();
    boolean add(E element);
}
