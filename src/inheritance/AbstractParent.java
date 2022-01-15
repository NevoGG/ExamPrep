package inheritance;

/**
 * can't create an instance of this class
 * some methods can be abstract
 * this is good for a situation where there's no need in an instance of this class,
 * also when we want to create a sort of interface in the inheritance - force children to implement.
 */
public abstract class AbstractParent {
    public abstract void speak(); // similar to an interface method in inheritance. all children must implement

    public void wave(){
        System.out.println("waving");
    }
}
