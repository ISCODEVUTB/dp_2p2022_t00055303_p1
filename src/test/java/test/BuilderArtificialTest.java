package test;

import org.junit.Test;

public class BuilderArtificialTest extends BuilderCharacter{
    @Test
    public void BuildPersonality() {
        Character.setPersonality("Warrior Machine");
    }
    public void BuildCharacterComplete(String Name, String LastName, String Gender) {
        Character.setCharacterComplete("Kayo","Netting","Male");
    }
    @Test
    public void BuildAbility() {
        Character.setAbility("Fragmentation Grenade");
    }
    @Test
    public void BuildPower() {
        Character.setPower("Suppress Skills");
    }
    @Test
    public void BuildWeakness() {
        Character.setWeakness("Duelists");
    }
    @Test
    public void BuildWeapons(){
        Character.setWeapons("Phantom Reaver");
    }
}
