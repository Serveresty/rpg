package heroes;

import enemies.Enemy;

public class Priest extends Hero{
    private int manaPool;
    public Priest(String name) {
        super(name);
        this.manaPool = MAXMP;
    }

    public void heal(Hero hero) {
        if (manaPool < 10) {
            System.out.println("Not enough mana, " + super.getName());
            return;
        }
        int hp = hero.getHealth();
        hero.setHealth(hp+15);
        this.manaPool -= 10;
        System.out.println(super.getName() + " healing " + hero.getName());
    }

    public void revival(Hero hero) {
        if (!hero.isAlive() && manaPool >= 30) {
            hero.setHealth(MAXHP);
            manaPool -= 30;
            System.out.println(super.getName() + " revived " + hero.getName());
            return;
        }
        System.out.println("Not enough mana, " + super.getName());
    }

    @Override
    void attackEnemy(Enemy enemy) {
        if (!super.isAlive()) { return; }
        enemy.takeDamage(5);
        System.out.println(super.getName() + " attacking enemy");
    }
}
