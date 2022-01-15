package design_patterns.observer;
// used for mirroring a few objects, to hold the same values and update simultaneously
public interface Observer {
    void update(int update1, int update2, int update3); // all values that need to be mirrored between observers.
}
