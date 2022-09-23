package Code;
public class Personality extends Characterization{
    private float Chamber;
    private float Astra;
    private float Killjoy;
    Personality(String Name, String LName, int Age, String Gender, Characterization[] characterizations, Character[] characters) {
        super(Name, LName, Age, Gender, characterizations);
        this.Astra = Astra;
        this.Chamber = Chamber;
        this.Killjoy = Killjoy;}
    //Getters & Setters.
    public float getChamber() {return Chamber;}
    public void setChamber(float chamber) {Chamber = chamber;}
    public float getAstra() {return Astra;}
    public void setAstra(float astra) {Astra = astra;}
    public float getKilljoy() {return Killjoy;}
    public void setKilljoy(float killjoy) {Killjoy = killjoy;}}