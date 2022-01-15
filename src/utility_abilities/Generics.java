package utility_abilities;

import java.util.ArrayList;

// sets a specific type for every instance, avoids the need for downcasting in each operation (risky)
public class Generics<T> {
    private T value;

    public void setValue(T newValue){
        value = newValue;
    }

    public T getValue(){
        return value;
    }
}

class GenericsTest{
    private int value;
    private final Generics<Integer> generic = new Generics<>();

    public GenericsTest(){
        value = generic.getValue();
    }
}

class GenericInheritance<E> extends ArrayList<E>{
    @Override
    public boolean add(E toAdd){
        if (toAdd == null){
            return false;
        }   else return super.add(toAdd);
    }
}