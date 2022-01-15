package lambdas;

public class Lambdas {

    public static void main(String[] args){
        // implementation 1 : create an instance of a nameless class that implements the interface.
        RunnableExample interfaceImplementation = new RunnableExample() {
            @Override
            public void doSomething() {
                System.out.println("Do Something Else!");
            }
        };
        // a better, more readable way:
        interfaceImplementation = () -> System.out.println("Do Something Else!"); // because the interface is a runnable
                                                                                // it can be written as a lambda

    }
}
