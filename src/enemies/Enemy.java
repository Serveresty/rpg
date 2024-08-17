package enemies;

import heroes.Hero;
import repository.Mortal;

public abstract class Enemy implements Mortal {
    public static final int MAXHP = 100;

    private int health;

    Enemy() {
        this.health = MAXHP;
    }

    Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println("Enemy: damage taken: " + damage + " current hp: " + this.health);
    }

    abstract void attackHero(Hero hero);

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
