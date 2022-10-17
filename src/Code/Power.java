package Code;
public class Power extends Characterization{
    private String Agent;
    private float Shield;
    Power(String Name, String LName, int Age, String Gender, Characterization[] characterizations, Character[] characters) {
        super(Name, LName, Age, Gender, characterizations);
        this.Shield = Shield;}
    //Getters & Setters.
    public String getAgent() {return Agent;}
    public void setAgent(String agent) {Agent = agent;}
    public float getShield() {return Shield;}
    public void setShield(float shield) {Shield = shield;}}