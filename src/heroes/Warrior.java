package heroes;

import enemies.Enemy;

public class Warrior extends Hero {
    public Warrior(String name) {
        super(name);
    }

    @Override
    void attackEnemy(Enemy enemy) {
        if (!super.isAlive()) { return; }
        enemy.takeDamage(10);
        System.out.println(super.getName() + " attacking enemy");
    }
}
