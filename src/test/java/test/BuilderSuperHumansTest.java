package test;

import org.junit.Test;

public class BuilderSuperHumansTest extends BuilderCharacter {
    @Test
    public void BuildPersonality() {
        Character.setPersonality("Foolish");
    }
    @Test
    public void BuildCharacterComplete() {
        Character.setCharacterComplete("Juan Carlos","Martinez","Male");
    }
    @Test
    public void BuildAbility() {
        Character.setAbility("Can Fly");
    }
    @Test
    public void BuildPower() {
        Character.setPower("Laser Beam");
    }
    @Test
    public void BuildWeakness() {
        Character.setWeakness("Storms are his weakness");
    }
    @Test
    public void BuildWeapons(){
        Character.setWeapons("Vandal Prime");
    }
}