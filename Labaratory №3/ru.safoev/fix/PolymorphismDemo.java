/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию.
2. Метод переименован в DemonstrateShooters (PascalCase).
*/
package ru.safoev.fix;

import ru.safoev.weapon.Shooter;
import ru.safoev.weapon.Gun;
import ru.safoev.weapon.AutomaticGun;

/**
 * Демонстрирует полиморфизм на примере стрелков с разным оружием.
 */
public class PolymorphismDemo {
    /**
     * Создаёт трёх стрелков (без оружия, с пистолетом, с автоматом)
     * и демонстрирует их стрельбу.
     */
    public static void DemonstrateShooters() {
        System.out.println("=== Демонстрация полиморфизма со стрелками ===");
        Shooter shooter1 = new Shooter("Стрелок без оружия");
        Shooter shooter2 = new Shooter("Стрелок с пистолетом", new Gun(3, 10));
        Shooter shooter3 = new Shooter("Стрелок с автоматом", new AutomaticGun(20, 5));
        ((Gun) shooter2.getWeapon()).reload(5);
        ((AutomaticGun) shooter3.getWeapon()).reload(15);
        Shooter[] shooters = {shooter1, shooter2, shooter3};
        for (Shooter shooter : shooters) {
            System.out.println("\n" + shooter.getName() + ":");
            shooter.shoot();
        }
    }
}