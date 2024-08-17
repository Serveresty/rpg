package enemies;

import heroes.Hero;

public class Zombie extends Enemy{

    public Zombie() {
        super();
    }

    @Override
    public void attackHero(Hero hero) {
        if (!super.isAlive()) { return; }
        hero.takeDamage(5);
        System.out.println("Zombie damaging " + hero.getName());
    }
}
