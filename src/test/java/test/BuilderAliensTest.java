package test;
import org.junit.Test;

public class BuilderAliensTest extends BuilderCharacter {
    @Test
    public void BuildPersonality() {
        Character.setPersonality("Sweet");
    }
    @Test
    public void BuildCharacterComplete() {
        Character.setCharacterComplete("Sage","Pocket","Female");
    }
    @Test
    public void BuildAbility() {
        Character.setAbility("Healing");
    }
    @Test
    public void BuildPower() {
        Character.setPower("Resurrection");
    }
    @Test
    public void BuildWeakness() {
        Character.setWeakness("Chamber");
    }
    @Test
    public void BuildWeapons(){
        Character.setWeapons("Marshall");
    }
}
