package Fitness;

public class Member extends Person {

    //attributes
    private boolean isBasic;


    //constructor
    public Member(String name, String cpr) {
        super(name, cpr);
    }


    //methods
    public String getMemberType() {
        if (isBasic) {
            return "Basic";
        } else {
            return "Full";
        }
    }

    public int monthlyFee() {
        if (isBasic) {
            return 199;
        } else {
         return 299;
        }
    }
}
