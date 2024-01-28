package HW02;

public class SummonWar implements HeroGenerator{

    @Override
    public HeroAction createHero() {
        return new Warrior();
    }
    
}
