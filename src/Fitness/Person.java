package Fitness;

public class Person {

    //attributes
    protected String name;
    protected String cpr;


    //constructor
    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }


    //methods
    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }
}
