package utility_abilities;

import org.w3c.dom.ranges.RangeException;

/**
 * Why use exceptions?
 * seperate error handling code from rest of code
 * Error can be moved up to a higher method, where it can be handled.
 * grouping and separating kinds of errors - use of exception polymorphism
 */
public class Exceptions {
    public int getNum(boolean isOk) throws NewCheckedException { // method can potentially throw such exceptions. good for API,
                                                                // also if exception is checked (made by me) you have to add throws
        if(!isOk) throw new NewCheckedException();
        return 0;
    }

    public void getNumActivator(){ // because getNum throws a checked exception, this has to have either a try/ catch or a "throws"
        try {
            getNum(false);
        }
        catch (NullPointerException e){ // an exception is an object!
            System.out.println("caught!");
        }
        catch (NewCheckedException e){
            System.out.println("also caught!");
        }
    }
}

class NewCheckedException extends Exception{}
