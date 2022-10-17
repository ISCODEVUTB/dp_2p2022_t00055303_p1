package test;
public class Character {
    //DEFINE BUILDER.
    private static String Ability = "";
    private static String Personality = "";
    private static String Power = "";
    private static String Weakness = "";
    private static String Weapons = "";
    private String CharacterComplete ="";

    public static void setCharacterComplete(String Name, String LastName, String Gender){
    }
    public static void setAbility(String ability) {
        Ability = ability;
    }
    public static void setPersonality(String personality) {
        Personality = personality;
    }
    public static void setPower(String power) {
        Power = power;
    }
    public static void setWeakness(String weakness) {

        Weakness = weakness;
    }
    public static void setWeapons(String weapons) {
        Weapons = weapons;
    }
}