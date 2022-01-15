package utility_abilities;

public class Assert {
    public void assert1(int a, int b){
        assert b < a; // we assume this expression to be true, if it fails, throws AssertionError.
        assert b < a : "Sizes invalid"; // if expression is false, will throw AssertionError with given text.
    }
}
