package Fitness;

public class Instructor extends Employee {

    //constructor
    public Instructor(String name, String cpr, int hours) {
        super(name, cpr, hours, 0);
    }


    //methods
    public int getSalary(int hours) {
        int salary = hours * 199;
        return salary;
    }
}
