package design_patterns.decorator;

import java.util.HashSet;

public abstract class DressDecorator implements Clothing {
    private Clothing person;

    public DressDecorator(Clothing person){
        this.person = person;
    }

    @Override
    public HashSet<String> clothesOn() {
        return person.clothesOn();
    }

    @Override
    public float priceOfClothing() {
        return person.priceOfClothing();
    }
}
