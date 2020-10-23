import ru.ifmo.se.pokemon.*;
class Latias extends Pokemon {
    public Latias(String name, int level) {
        super(name, level);
        setStats(80, 80,90,110,130,110);
        setType(Type.DRAGON, Type.PSYCHIC);
        setMove(new MistBall(), new ShadowClaw(), new DreamEater(), new DragonPulse());
    }
}
class Lickitung extends Pokemon {
    public Lickitung(String name, int level) {
        super(name, level);
        setStats(90, 55,75,60,75,30);
        setType(Type.NORMAL);
        setMove(new PowerWhip(), new Thunder(), new RockSlide());
    }
}
class Lickilicky extends Lickitung {
    public Lickilicky(String name, int level) {
        super(name, level);
        setStats(110, 85,95,80,95,50);
        setType(Type.NORMAL);
        setMove(new PowerWhip(), new Thunder(), new RockSlide(),new FocusBlast());
    }
}
class Pichu  extends Pokemon {
    public Pichu(String name, int level) {
        super(name, level);
        setStats(20, 40,15,35,35,60);
        setType(Type.ELECTRIC);
        setMove(new Swagger(), new ChargeBeam());
    }
}
class Pikachu  extends Pichu {
    public Pikachu(String name, int level) {
        super(name, level);
        setStats(35, 55,40,50,50,90);
        setType(Type.ELECTRIC);
        setMove(new Swagger(), new ChargeBeam(),new Slam());
    }
}
class Raichu  extends Pikachu {
    public Raichu(String name, int level) {
        super(name, level);
        setStats(60, 90,55,90,80,110);
        setType(Type.ELECTRIC);
        setMove(new Swagger(), new ChargeBeam(),new Slam(),new ThunderShock());
    }
}
class ThunderShock extends SpecialMove{//Thunder Shock наносит урон и имеет 10% шанс парализовать цель.
    public ThunderShock(){                // Покемонов электрического типа нельзя парализовать.
        type = Type.ELECTRIC;
        power = 40;
        accuracy = 100;
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random()>0.1){
            Effect.paralyze(p);
        }
    }
    @Override
    protected java.lang.String describe() {
        return new String("использует атаку Thunder Shock ");
    }
}
class Slam extends PhysicalMove{//Удар наносит урон без дополнительных эффектов.
    public Slam(){
        type = Type.NORMAL;
        power = 80;
        accuracy = 75;
    }
    @Override
    protected java.lang.String describe() {
        return new String("использует атаку Slam ");
    }
}
class Swagger extends StatusMove{//Swagger сбивает цель с толку и увеличивает ее атаку на два уровня.
    public Swagger(){
        type = Type.NORMAL;
        accuracy = 85;
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);
        Effect e = new Effect().stat(Stat.ATTACK, +2);
        p.addEffect(e);
    }
    @Override
    protected java.lang.String describe() {
        return new String("использует атаку Swagger ");
    }
}
class ChargeBeam extends SpecialMove{//Charge Beam наносит урон и имеет 70% шанс
    public ChargeBeam(){   // повысить специальную атаку пользователя на один уровень.
        type = Type.ELECTRIC;
        power = 50;
        accuracy = 90;
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e = new Effect().chance(0.7).stat(Stat.SPECIAL_ATTACK, +1);
        p.addEffect(e);
    }
    @Override
    protected java.lang.String describe() {
        return new String("использует атаку Charge Beam ");
    }
}
class FocusBlast extends SpecialMove{ //Focus Blast наносит урон и имеет 10%
    public FocusBlast(){  // шанс понизить специальную защиту цели на один уровень.
        type = Type.FIGHTING;
        power = 120;
        accuracy = 70;
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(e);
    }
    @Override
    protected java.lang.String describe() {
        return new String("использует атаку Focus Blast ");
    }
}
class RockSlide extends PhysicalMove{//Rock Slide наносит урон и с вероятностью 30%
    public RockSlide(){                    // заставит цель вздрогнуть .
        type = Type.ROCK;
        power = 75;
        accuracy = 90;
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random()<=0.3){
            Effect.flinch(p);
        }
    }
    @Override
    protected java.lang.String describe() {
        return new String("использует атаку Rock Slide ");
    }
}
class Thunder extends SpecialMove{  // наносит урон и имеет 30% шанс парализовать цель.
    public Thunder(){          // Покемонов электрического типа нельзя парализовать.
        type = Type.ELECTRIC;
        power = 110;
        accuracy = 70;
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random()<=0.3){
            Effect.paralyze(p);
        }
    }
    @Override
    protected java.lang.String describe() {
        return new String("использует атаку Thunder ");
    }
}
class PowerWhip extends PhysicalMove{ //Power Whip наносит урон без дополнительных эффектов.
    public PowerWhip(){
        type = Type.GRASS;
        power = 120;
        accuracy = 85;
    }
    @Override
    protected java.lang.String describe() {
        return new String("использует атаку Power Whip ");
    }
}
class DragonPulse extends SpecialMove{  //Пульс дракона наносит урон без дополнительных эффектов.
    public DragonPulse(){
        type = Type.DRAGON;
        power = 85;
        accuracy = 100;
    }
    @Override
    protected java.lang.String describe() {
        return new String("использует атаку Dragon Pulse ");
    }
}
class DreamEater extends SpecialMove{//Пожиратель снов наносит урон только спящим противникам,
    public DreamEater(){    // а пользователь восстанавливает 50% потраченного здоровья.
        type = Type.PSYCHIC;
        power = 100;
        accuracy = 100;
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Pokemon p1= new Pokemon();
        Effect e = new Effect().condition(Status.SLEEP);
        p.addEffect(e);
        if (p.getCondition() == p1.getCondition()){
            Move.getNoMove();
        }
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP,-(int)(80-p.getHP())/2);
    }
    @Override
    protected java.lang.String describe() {
        return new String("использует атаку Dream Eater ");
    }
}
class ShadowClaw extends PhysicalMove{//Shadow Claw наносит урон и имеет повышенный
    public ShadowClaw(){      //  коэффициент критического удара ( 1 ⁄ 8 вместо 1 ⁄ 24 )
        type = Type.GHOST;
        power = 70;
        accuracy = 100;
    }
    @Override
    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if (3 * var1.getStat(Stat.SPEED) / 512.0D > Math.random()) {
            return 2.0D;
        } else {
            return 1.0D;
        }
    }
    @Override
    protected java.lang.String describe() {
        return new String("использует атаку Shadow Claw");
    }
}
class MistBall extends SpecialMove {//Mist Ball наносит урон и с вероятностью 50%
    public MistBall() {            // снижает специальную атаку цели на один уровень.
        type = Type.PSYCHIC;
        power = 70;
        accuracy = 100;
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.5).stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(e);
    }
    @Override
    protected java.lang.String describe() {
        return new String("использует атаку Mist Ball");
    }
}
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

