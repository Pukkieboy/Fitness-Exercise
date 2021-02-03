package Fitness;

public class Employee extends Person {

    //attributes
    private int hours;
    private int salary;


    //constructor
    public Employee(String name, String cpr, int hours, int salary) {
        super(name, cpr);
        this.hours = hours;
        this.salary = salary;
    }


    //methods
    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }
}
