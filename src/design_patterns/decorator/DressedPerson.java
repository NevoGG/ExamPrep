package design_patterns.decorator;

import java.util.HashSet;

public class DressedPerson implements Clothing{ // basic version of a dressed person
    @Override
    public HashSet<String> clothesOn() {
        HashSet<String> clothing = new HashSet<String>();
        clothing.add("Underwear");
        return clothing;
    }

    @Override
    public float priceOfClothing() {
        return 3.0f; // price of underwear.
    }
}
