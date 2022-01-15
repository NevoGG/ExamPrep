package design_patterns.Memento;

public class Originator {
    String information = "information";

    public void setInformation(String newInfo){
        information = newInfo;
    }

    public Memento setMemento(String info){return new Memento(info);
    }

    public String getInformationFromMemento(Memento m){
        return m.getInformation();
    }

    // also get and set information.
}
