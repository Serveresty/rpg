package heroes;

import enemies.Enemy;

public class Mage extends Hero {
    private int manaPool;
    public Mage(String name) {
        super(name);
        this.manaPool = MAXMP;
    }

    public void fireball(Enemy enemy) {
        if (manaPool >= 4) {
            enemy.takeDamage(11);
            manaPool -= 4;
            System.out.println(super.getName() + " used fireball");
            return;
        }
        System.out.println("Not enough mana, " + super.getName());
    }

    public void meteorsShtorm(Enemy[] enemy) {
        if (manaPool < 15) {
            System.out.println("Not enough mana, " + super.getName());
            return;
        }
        System.out.println(super.getName() + " damaging AOE: ");
        for (Enemy e : enemy) {
            e.takeDamage(22);
        }
    }

    @Override
    void attackEnemy(Enemy enemy) {
        if (!super.isAlive()) { return; }
        enemy.takeDamage(8);
        System.out.println(super.getName() + " attacking enemy");
    }
}
