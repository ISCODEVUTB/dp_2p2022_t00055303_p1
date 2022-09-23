package Code;
public class Weapons extends Characterization{
    private float Vandal;
    private float Phantom;
    private float Sheriff;
    private float Stinger;
    Weapons(String Name, String LName, int Age, String Gender, Character[] characters) {
        super(Name, LName, Age, Gender, characters);
        this.Vandal = Vandal;
        this.Phantom = Phantom;
        this.Stinger = Stinger;
        this.Sheriff = Sheriff;}
    //Getters & Setters.
    public float getVandal() {return Vandal;}
    public void setVandal(float vandal) {Vandal = vandal;}
    public float getPhantom() {return Phantom;}
    public void setPhantom(float phantom) {Phantom = phantom;}
    public float getSheriff() {return Sheriff;}
    public void setSheriff(float sheriff) {Sheriff = sheriff;}
    public float getStinger() {return Stinger;}
    public void setStinger(float stinger) {Stinger = stinger;}}