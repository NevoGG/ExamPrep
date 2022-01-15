package design_patterns.Memento;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<Memento> storage= new ArrayList<Memento>();

    public Memento getMemento(int idx){
        return storage.get(idx);
    }

    public int storeMemento(Memento m){
        storage.add(m);
        return storage.size() - 1;
    }
}
