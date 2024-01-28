package HW02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random rnd = ThreadLocalRandom.current();
        List<HeroGenerator> heroList = new ArrayList<>();
        heroList.add(new SummonWar());
        heroList.add(new SummonWiz());
        heroList.add(new SummonHeal());

        for (int i = 0; i < 20; i++) {
            HeroAction hero = heroList.get(Math.abs(rnd.nextInt() % heroList.size())).createHero();
            hero.action();
        }
    }

}
