package NestedClass;

public class NestedTest {
    public void nested(){
        NestedClass b = new NestedClass(1, 2);
        NestedClass.NestedClassTwo a = b.new NestedClassTwo();
    }
}
