package utility_abilities;

import java.lang.reflect.Modifier;
import java.lang.reflect.Method;

public class Reflection {
    Class reflectionClass = Reflection.class;
    String className = reflectionClass.getName();
    int modifier = reflectionClass.getModifiers();
    boolean isPrivate = Modifier.isPrivate(modifier);
    boolean isFinal = Modifier.isFinal(modifier);
    Method[] methods = reflectionClass.getMethods();

    public void test(){
        for(Method method : methods){
            System.out.println(method.getName());
            System.out.println(method.getModifiers());
            System.out.println(Modifier.isFinal(method.getModifiers()));
    }

    }
}
