package utility_abilities.wildcards;

import java.util.LinkedList;

public class wildcardCaller {
    LinkedList<Mammal> mammalLst = new LinkedList<Mammal>();
    LinkedList<Object> objLst = new LinkedList<Object>();
    LinkedList<Animal> animalLst = new LinkedList<Animal>();

    public int lstLength(LinkedList<?> lst){ // if you need the list features, don't care about objects.
        return lst.size();
    }

    public void wildCardDemo1 (LinkedList<? extends  Animal> lst){ // if you want to use parent class methods
                                                                    // but not sure which lst you'll get
        for(Animal animal : lst){
            animal.method1();
        }
    }

    public void wildCardDemo2 (LinkedList<? super Mammal> lst){ // if you want to add object and not screw with type problems
        lst.add(new Mammal());
    }
}
