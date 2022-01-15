package design_patterns.Memento;

public class Memento {
    private String information;

    public Memento(String information){
        this.information = information;
    }

    public String getInformation(){
        return this.information;
    }
}
