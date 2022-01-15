package design_patterns.iterator;

public class AggregateImplemented<T> implements Aggregate<T>{
    private Object[] elementData; // we can't instantiate an array of T[] so we just fill it with T objects to avoid downcasting.
    private int idx;
    private int size;
    // fields needed for any data type that holds different T Generics. in this case, a simple array.

    public AggregateImplemented(int size){ // assumes valid input
        this.size = size;
        elementData = new Object[size];
        idx = 0;
    }

    public boolean add(T element) {
        if (idx < size){
            elementData[idx++] = element; // takes element at index location, after that increment idx
            return true;
        } else return false;
    }

    public Iterator<T> createIterator() {
        return new MyIterator<T>(); // it only works without an input if its an inner class (has access to instance variables).
    }


    private class MyIterator<T> implements Iterator<T> {
        private int iteratorPointer = 0; // index of current value in iterator
        @Override

        public T next() {
            if(iteratorPointer >= idx) throw new NullPointerException(); // placeholder exception (lazy)
            else return (T) elementData[iteratorPointer++];
        }

        @Override
        public boolean hasNext() {
            return iteratorPointer < idx;
        }
    }
}
