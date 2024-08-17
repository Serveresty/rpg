package enemies;

import heroes.Hero;

public class Goblin extends Enemy{

    public Goblin() {
        super();
    }

    @Override
    void attackHero(Hero hero) {
        if (!super.isAlive()) { return; }
        hero.takeDamage(8);
    }
}
