package design_patterns.comparator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ComparatorTest {
    ObjToCompare obj1 = new ObjToCompare("Joe", 20);
    ObjToCompare obj2 = new ObjToCompare("Harry", 25);
    ObjToCompare obj3 = new ObjToCompare("Don", 15);
    ObjToCompare[] objLst = new ObjToCompare[]{obj1, obj2, obj3};

    public void sortArr(){
        Arrays.sort(objLst); // with comparable
        Arrays.sort(objLst, new ObjToCompare.CompareDifferently()); // way 2
    }
}
