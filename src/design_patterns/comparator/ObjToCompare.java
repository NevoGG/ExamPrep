package design_patterns.comparator;

import java.util.Comparator;

public class ObjToCompare implements Comparable<ObjToCompare> {
    private String name;
    private int age;

    ObjToCompare(String name, int age) { // general constructor
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(ObjToCompare o) {
        int otherAge = o.getAge();
        int result = 0;
        if (age > otherAge) result = 1;
        if (age < otherAge) result = -1;
        return result;
    }

    public static class CompareDifferently implements Comparator<ObjToCompare>{ // another option

        @Override
        public int compare(ObjToCompare o1, ObjToCompare o2) {
            int thisAge = o1.getAge();
            int otherAge = o2.getAge();
            int result = 0;
            if (thisAge > otherAge) result = 1;
            if (thisAge < otherAge) result = -1;
            return result;
        }
    }
}

