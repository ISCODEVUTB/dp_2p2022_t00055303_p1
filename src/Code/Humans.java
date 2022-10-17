package Code;
public class Humans extends Character {
    private String SinsII; // 7 Deadly Sins.
    private float Odin_Gun;
    public Humans(String Name, String LName, int Age, String Gender, Character[] characters) {
        super(Name, LName, Age, Gender, characters);
        this.Odin_Gun = Odin_Gun;}
    public Humans() {}

    //Getter and Setters.
    public String getSinsII() {return SinsII;}
    public void setSinsII(String sinsII) {SinsII = sinsII;}
    public float getOdin_Gun() {return Odin_Gun;}
    public void setOdin_Gun(float odin_Gun) {Odin_Gun = odin_Gun;}}