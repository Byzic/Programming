package Persons;

public class Grumbler extends Person {
    public void lookDown(){
        System.out.println(getName()+" посмотрел вниз");
    }
    public void say(){
        System.out.println(getName()+" сказал:");
    }
    @Override
    public String getName() {
        return "Ворчун";
    }
}
