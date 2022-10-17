package test;

import org.junit.Test;

public class BuilderHumansTest extends BuilderCharacter{
    @Test
    public void BuildPersonality() {
        Character.setPersonality("Arrogant");
    }
    @Test
    public void BuildCharacterComplete() {
        Character.setCharacterComplete("Chamber","Paris","Male");
    }
    @Test
    public void BuildAbility() {
        Character.setAbility("Teleport");
    }
    @Test
    public void BuildPower() {
        Character.setPower("Bot Alarm");
    }
    @Test
    public void BuildWeakness() {
        Character.setWeakness("High places");
    }
    @Test
    public void BuildWeapons(){
        Character.setWeapons("Operator");
    }
}
