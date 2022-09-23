package Code;
public class Character implements IToken {
    private String Name;
    private String LName;
    private int Age;
    private String Gender;
    private Character[] characters;
    Character(String Name, String LName, int Age, String Gender, Character[] characters){
        this.characters = characters;
        this.Age = Age;
        this.Name = Name;
        this.LName = LName;
        this.Gender = Gender;
    }
    public Character() {}
    //Getters and Setters.
    public String getName() {return Name;}
    public String getLName() {return LName;}
    public int getAge() {return Age;}
    public String getGender() {return Gender;}
    public Character[] getCharacters() {return characters;}
    public void setName(String name) {Name = name;}
    public void setLName(String LName) {this.LName = LName;}
    public void setAge(int age) {Age = age;}
    public void setGender(String gender) {Gender = gender;}
    //Methods.
    public void Add(Character characters) {}
    public void League(Character characters, String League) {}
    public void Enemy(Character characters) {}}