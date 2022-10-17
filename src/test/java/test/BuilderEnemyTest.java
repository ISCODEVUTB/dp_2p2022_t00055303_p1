package test;

import org.junit.Test;

public class BuilderEnemyTest extends BuilderCharacter{
    @Test
    public void BuildPersonality() {
        Character.setPersonality("Rude");
    }
    @Test
    public void BuildCharacterComplete() {
        Character.setCharacterComplete("Harbor","India","Male");
    }
    @Test
    public void BuildAbility() {
        Character.setAbility("Water proof");
    }
    @Test
    public void BuildPower() {
        Character.setPower("Control the Nightmares");
    }
    @Test
    public void BuildWeakness() {
        Character.setWeakness("Explosive Bots");
    }
    @Test
    public void BuildWeapons(){
        Character.setWeapons("Sheriff");
    }
}
