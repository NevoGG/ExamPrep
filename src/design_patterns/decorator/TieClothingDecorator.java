package design_patterns.decorator;

import java.util.HashSet;

public class TieClothingDecorator extends DressDecorator{

    public TieClothingDecorator(Clothing person) {
        super(person);
    }

    @Override
    public HashSet<String> clothesOn() {
        HashSet<String> newClothing = super.clothesOn();
        newClothing.add("Tie");
        return newClothing;
    }

    @Override
    public float priceOfClothing() {
        return super.priceOfClothing() + 4.0f;
    }
}
