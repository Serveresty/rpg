package heroes;

import enemies.Enemy;
import repository.Mortal;

public abstract class Hero implements Mortal {
    public static final int MAXHP = 100;
    public static final int MAXMP = 100;

    private String name;
    private int health;

    Hero(String name) {
        this.name = name;
        this.health = MAXHP;
    }

    Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
