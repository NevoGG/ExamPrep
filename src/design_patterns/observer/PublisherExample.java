package design_patterns.observer;

import java.util.ArrayList;

public class PublisherExample implements Publisher{
    ArrayList<Observer> observers = new ArrayList<>();
    int value1;
    int value2;
    int value3;
    // implemets setters for values or change them in whatever way.

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void unAttach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(value1, value2, value3);
        }
    }
}
