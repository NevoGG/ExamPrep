package interface_;

public class Person implements Interface, SubInterface{ // can implement as many interfaces as we want
                                                            // (inheritance can only extend one)
    private Person personCarried = null;
    public void wave(){
        System.out.println("waving");
    }

    public String talk(){
        return "talking";
    }

    public void carry(Person person){
        personCarried = person;
    }
    // demonstrate upcasting

    public void smile(){
        System.out.println("smiling"); // implements subInterface method
    }

}
