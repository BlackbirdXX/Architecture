package HW02;

public class SummonHeal implements HeroGenerator{

    @Override
    public HeroAction createHero() {
        return new Healer();
    }
    
}
