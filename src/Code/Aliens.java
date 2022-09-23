package Code;
public class Aliens extends Character{
    private float Kayo_Health;
    private float Phoenix_Health;
    public Aliens(String Name, String LName, int Age, String Gender, Character[] characters) {
        super(Name, LName, Age, Gender, characters);
        this.Kayo_Health = Kayo_Health;
        this.Phoenix_Health = Phoenix_Health;}
    public Aliens() {}
    //Getters & Setters.
    public float getKayo_Health() {return Kayo_Health;}
    public void setKayo_Health(float kayo_Health) {Kayo_Health = kayo_Health;}
    public float getPhoenix_Health() {return Phoenix_Health;}
    public void setPhoenix_Health(float phoenix_Health) {Phoenix_Health = phoenix_Health;}}