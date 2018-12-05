package lyndaDotcom2;

public class Cricket extends Insect {

    double length;

    public Cricket(int age, double length){
        super(age, 8);

        this.length = length;
    }

    public void says(){
        System.out.println("CHIRP");

    }

    public void jump(){
        System.out.println("The cricket jumped!");
    }

}
