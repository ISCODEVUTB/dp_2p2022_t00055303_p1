package Code;
public class Artificial extends Character {
    private float Kayo_Shield;
    private float Phoenix_Shield;
    public Artificial(String Name, String LName, int Age, String Gender, Character[] characters) {
        super(Name, LName, Age, Gender, characters);
        this.Kayo_Shield = Kayo_Shield;
        this.Phoenix_Shield = Phoenix_Shield;}
    public Artificial(String sergio) {}
    //Getters & Setters.
    public float getKayo_Shield() {return Kayo_Shield;}
    public void setKayo_Shield(float kayo_Shield) {Kayo_Shield = kayo_Shield;}
    public float getPhoenix_Shield() {return Phoenix_Shield;}
    public void setPhoenix_Shield(float phoenix_Shield) {Phoenix_Shield = phoenix_Shield;}}