package inheritance;

public class Child extends Parent{

    public Child(int height, int age){
        super(height, age); // calls constructor of parent.
        // not calling super equals calling the constructor of the parent without params.
        // if there isn't ony ,returns error.
    }

    public void wave(){ //override example, only works for public
        super.wave(); // calls method in parent before overriding.
    }
}
