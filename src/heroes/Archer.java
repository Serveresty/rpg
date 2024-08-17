package heroes;

import enemies.Enemy;

public class Archer extends Hero {
    public Archer(String name) {
        super(name);
    }

    @Override
    void attackEnemy(Enemy enemy) {
        if (!super.isAlive()) { return; }
        enemy.takeDamage(7);
        System.out.println(super.getName() + " attacking enemy");
    }
}
