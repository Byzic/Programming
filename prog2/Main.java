import ru.ifmo.se.pokemon.Battle;
import Pokemons.*;
public class Main {
        public static void main(String[] args) {
            Battle b = new Battle();
            Latias poc1= new Latias("Anastasia", 1);
            Lickitung poc2= new Lickitung("Valera", 1);
            Lickilicky poc3= new Lickilicky("Daria", 1);
            Pichu poc4= new Pichu("Artem", 1);
            Pikachu poc5= new Pikachu("Kristina", 1);
            Raichu poc6= new Raichu("Daniil", 1);
            b.addAlly(poc1);
            b.addFoe(poc2);
            b.addAlly(poc3);
            b.addFoe(poc4);
            b.addAlly(poc5);
            b.addFoe(poc6);
            b.go();

        }
}
