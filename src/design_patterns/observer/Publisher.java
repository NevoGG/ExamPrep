package design_patterns.observer;
// an instance of the publisher that holds all the observer objects.
public interface Publisher {
    void attach(Observer o);
    void unAttach(Observer o);
    void notifyObservers();
}
