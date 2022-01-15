package inheritance;
/** to understand better:
 * super
 * private elements of parents - can't access directly, only through getters and setters
 * can be solved with defining as protected (but considered part of API).
 */
// principles - avoid code redundancy and assist  polymorphism
public class Parent {
    private int age; // can't be accessed from son accept via methods
    protected int height; // can be accessed from son but is part of API
    public int shoeSize; // can be accessed from son

    public Parent(int height, int age){
        this.height = height;
    }

    public void wave(){
        System.out.println("waving");
    }
}
