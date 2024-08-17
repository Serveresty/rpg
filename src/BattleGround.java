import enemies.Enemy;
import enemies.Goblin;
import enemies.Zombie;
import heroes.Archer;
import heroes.Mage;
import heroes.Priest;
import heroes.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Archer archer = new Archer("Legolas");
        Mage mage = new Mage("Megumin");
        Priest priest = new Priest("Himejima");
        Warrior warrior = new Warrior("Shadow");

        Zombie[] enemies = generateZombies(10);

        mage.meteorsShtorm(enemies);
        enemies[1].attackHero(mage);
        enemies[2].attackHero(mage);
        enemies[0].attackHero(mage);

        priest.heal(mage);
    }

    public static Zombie[] generateZombies(int countEnemies) {
        Zombie[] enemies = new Zombie[countEnemies];
        for (int i = 0; i < countEnemies; i++) {
            enemies[i] = new Zombie();
        }
        return enemies;
    }
}
