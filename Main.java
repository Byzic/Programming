import Persons.Grumbler;
import Persons.Neznaika;
import Persons.Znaika;
import Places.Balloon;
import Nature.*;
public class Main {
    public static void main(String[] args) {
        TimeOfDay time= TimeOfDay.MORNING;
        Sun sun=new Sun();
        Wind wind=new Wind();
        Grumbler grumbler= new Grumbler();
        Neznaika neznaika= new Neznaika();
        Znaika znaika=new Znaika();
        Balloon balloon=new Balloon();

        grumbler.setPlace(balloon);
        neznaika.setPlace(balloon);
        grumbler.lookDown();
        grumbler.say();
        grumbler.argue(neznaika);
        znaika.stopConflict();
        time=TimeOfDay.EVENING;
        if (time == TimeOfDay.EVENING){
            sun.evening();
            wind.evening();
            balloon.evening();
        }
        else{
            sun.morning();
            wind.morning();
            balloon.morning();
        }
        sun.printCondition();
        wind.printCondition();
        grumbler.continueConflict(neznaika);



    }
}
