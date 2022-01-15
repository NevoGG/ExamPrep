package design_patterns.factory_;

// allows other classes to be programmed to interface.
// its jub is to create objects of a specific  interface,
// according to given information
// single choice principle and programming to interface
// serves as a part of the bundle package of the interface - who ever works with it
// creates the object with the factory and doesn't have to know the specific implementation
public class Factory {
    public FruitInterface createInstance(String fruitName){
        FruitInterface toBeReturned = null;
        switch (fruitName){
            case "Banana": toBeReturned = new Banana();
            case "Apple": toBeReturned = new Apple();
            case "Pear": toBeReturned = new Pear();
            default: System.err.println("Incorrect Input");
        }
        return toBeReturned;
    }
}
