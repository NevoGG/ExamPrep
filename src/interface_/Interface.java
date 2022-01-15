package interface_;
// doesn't contain fields
// because it doesn't contain actual code but only method names,
// implementing the same method to too different classes might cause a need
// for redundant code. can be solved by containment- extract method to third class
// PRINCIPLES: polymorphism
public interface Interface {
    // methods have to be public
    void wave();
    String talk();
    void carry(Person person);

    // factory method: (creates an instance by certain ruleset)

}

