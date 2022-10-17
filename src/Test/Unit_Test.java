package Test;
import Code.*;
import Code.Character;

// Unit Testing.
public class Unit_Test {
    public void Character() {
        SuperHumans A = new SuperHumans();
        A.Add(new Character());
        A.setAfrican("Wakanda");
        A.setMerlyn_God("Tall Guy");
        A.setZeus_God("Skye flow");
        Humans B = new Humans();
        B.setOdin_Gun(90);
        B.setSinsII("Ban-Kay");
        Aliens C = new Aliens();
        C.setKayo_Health(125);
        C.setPhoenix_Health(150);
        Artificial D = new Artificial("Sergio");
        D.setKayo_Shield(50);
        D.setPhoenix_Shield(60);
    }
    public void Enemy(){
        Ability A = new Ability();
        A.Enemy(new Character());
        A.setBot_Alarm(25);
        A.setTTransportation(10);
        A.setName("Sergio");
        A.setAge(21);
        A.setLName("Sanchez");
        A.setGun(50);
        A.League(new Character(),"TheNewLeague");
        A.setGender("Male");
    }

    @Override
    public String toString() {return "Unit_Test{}";}

    public void Options(){
        SuperHumans A = new SuperHumans();
        A.Add(new Character());
        Ability B= new Ability();
        A.getAfrican();
        A.getMerlyn_God();
        A.getCharacters();
        A.getGender();
        A.getAge();
        A.getLName();
        A.getName();
        A.getZeus_God();
        B.getAge();
        B.getBot_Alarm();
        B.getTTransportation();
        B.getGun();
        Options();
    }
}
