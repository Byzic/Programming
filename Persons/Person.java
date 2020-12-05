package Persons;
import Places.Balloon;
import Places.Balloon;

public abstract class Person {
    protected Balloon place = null;
    protected boolean conflict=false;
    public abstract String getName();

    public void argue(Person person){
        System.out.println(getName()+" начал спорить с "  + person.getName());
        conflict=true;
    }

    public void stopConflict(){
        if (getPlace()==null){
            System.out.println(getName()+" не присутствовал, никто не мог остановить конфликт");
            conflict=true;
        }
        else {
            System.out.println(getName()+" присутствовал, знатно порешал конфликт");
            conflict=false;
        }
    }
    public void continueConflict(Person person){
        if (conflict==true){
            System.out.println(getName()+" и " + person.getName()+" не умолкали");
        }
        else {
            System.out.println(getName()+" и " + person.getName()+" уже уладили ситуацию");
        }
    }
    public Balloon getPlace() {
        return place;
    }

    public void setPlace(Balloon place) {
        this.place = place;
    }

}


