package design_patterns.decorator;

import java.util.HashSet;

public interface Clothing {
    public HashSet<String> clothesOn();
    public float priceOfClothing();
}
