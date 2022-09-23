package Code;
public class Weakness extends Characterization {
    private float Health;
    private float LessShield;
    Weakness(String Name, String LName, int Age, String Gender, Character[] characters) {
        super(Name, LName, Age, Gender, characters);
        this.Health = Health;
        this.LessShield = LessShield;}
    //Getters & Setters.
    public float getHealth() {return Health;}
    public void setHealth(float health) {Health = health;}
    public float getLessShield() {return LessShield;}
    public void setLessShield(float lessShield) {LessShield = lessShield;}}