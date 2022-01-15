package CallBacks;

import java.util.function.Consumer;

public class MethodReferences {
    public static void doSomething(){
        System.out.println("doing something!");
    }

    public static void doSomethingElse(int i){
        System.out.println(i);
    }

    public void useMethodReference(){
        doComlicatedSomething(MethodReferences :: doSomething, MethodReferences :: doSomethingElse, 5);
    }

    public void doComlicatedSomething(Runnable runnable, Consumer<Integer> consumer, int i){
        consumer.accept(i);
        runnable.run();
    }

}
