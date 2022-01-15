package NestedClass;

public class NestedClass {
    public int data1;
    private int data2;
    private static int data3 = 0;

    public NestedClass(int a, int b){
        data1 = a;
        data2 = b;
    }

    public void test1(){
        NestedClassTwo nestedClassTwo = new NestedClassTwo();
        int aDuplicate = nestedClassTwo.a;
        int bDuplicate = nestedClassTwo.b;
    }

    private void test2(){
        // do something else
    }

    public class NestedClassTwo{
        public int a;
        private int b;
        private int c; // works even if original field is static

        public NestedClassTwo(){
            a = data1;
            b = data2;
            c = data3;
        }
    }

}
