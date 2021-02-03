package Fitness;

public class Administration extends Employee {

    //attributes
    private int vacation;


    //constructor
    public Administration(String name, String cpr) {
        super(name, cpr, 37, 33000);
    }


    //methods
    public int getVacation() {
        return vacation;
    }
}
