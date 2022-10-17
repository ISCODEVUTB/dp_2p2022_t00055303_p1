package test;
public abstract class BuilderCharacter {
    //ABSTRACT BUILDER.
    protected Character character;
    public Character getCharacter() {
        return character;
    }
    public void NewCharacter(){
        character = new Character();
    }

    public void BuildPersonality() {
    }

    public void BuildCharacterComplete(String Name, String LastName, String Gender){};

    public void BuildAbility() {
    }
    public void BuildPower() {
    }

    public void BuildWeakness() {
    }
    public void BuildWeapons(){}
}