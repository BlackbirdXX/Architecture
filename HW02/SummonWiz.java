package HW02;

public class SummonWiz implements HeroGenerator{

    @Override
    public HeroAction createHero() {
        return new Wizard();
    }
    
}
