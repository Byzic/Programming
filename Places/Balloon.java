package Places;

import Interfaces.*;

public class Balloon implements ConditionChecker,StatusSetter {
    private boolean cooldown = false;
    private int height=30;
    private int temperature=15;
    public int goDown(){
        System.out.println(getName()+" стал спускаться вниз");
        return height-5;
    }
    public int goUp(){
        System.out.println(getName()+" стал подниматься вверх");
        return height+5;
    }
    @Override
    public void morning() {
        temperature +=  6;
        cooldown = false;
        printCondition();
        height=goUp();
    }
    @Override
    public void evening() {
        temperature -=  6;
        cooldown = true;
        printCondition();
        height=goDown();
    }
    @Override
    public boolean condition() {   //возвращаем остыл шар или нет
        return cooldown;
    }

    public String getName(){
        return "Воздушный шар";
    }

    @Override
    public void printCondition(){
        System.out.println(condition() ? "Шар остыл " : "Шар не остыл");
    }

    @Override
    public String toString() {
        return getName();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Balloon balloon = (Balloon) o;
        return cooldown == balloon.condition() ;
    }
     @Override
    public int hashCode() {
        return this.toString().length();
    }
}
