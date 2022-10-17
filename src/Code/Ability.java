package Code;
public class Ability extends Characterization {
    private float TTransportation;
    private float Gun;
    private float Bot_Alarm;
    public Ability(String Name, String LName, int Age, String Gender, Character[] characters) {
        super(Name, LName, Age, Gender, characters);
        this.Bot_Alarm = Bot_Alarm;
        this.Gun = Gun;
        this.TTransportation = TTransportation;}

    public Ability() {
        super();
    }

    //Getters & Setters.
    public float getTTransportation() {return TTransportation;}
    public void setTTransportation(float TTransportation) {this.TTransportation = TTransportation;}
    public float getGun() {return Gun;}
    public void setGun(float gun) {Gun = gun;}
    public float getBot_Alarm() {return Bot_Alarm;}
    public void setBot_Alarm(float bot_Alarm) {Bot_Alarm = bot_Alarm;}}