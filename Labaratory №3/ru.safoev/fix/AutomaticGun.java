
/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию.
2. Метод fireSecond переименован в FireSecond (PascalCase).
3. Убраны излишние комментарии.
*/
package ru.safoev.fix;

/**
 * Представляет автоматическое оружие (автомат), наследующее от {@link Gun}.
 * Добавляет свойство скорострельности и возможность стрельбы очередью.
 */
public class AutomaticGun extends Gun {
    /** Скорострельность (выстрелов за раз/за секунду) */
    private final int fireRate;

    /**
     * Создаёт автомат с 30 патронами и скорострельностью 30.
     */
    public AutomaticGun() {
        super(30, 30);
        this.fireRate = 30;
    }

    /**
     * Создаёт автомат с указанной вместимостью. Скорострельность = вместимость / 2.
     * @param maxOfCartridges максимальное количество патронов
     */
    public AutomaticGun(int maxOfCartridges) {
        super(maxOfCartridges, maxOfCartridges);
        int calculatedRate = maxOfCartridges / 2;
        if (calculatedRate < 1) {
            this.fireRate = 1;
        } else {
            this.fireRate = calculatedRate;
        }
    }

    /**
     * Создаёт автомат с указанной вместимостью и скорострельностью.
     * @param maxOfCartridges максимальное количество патронов
     * @param fireRate скорострельность (выстрелов за раз)
     * @throws IllegalArgumentException если fireRate &lt;= 0 или maxOfCartridges &lt;= 0
     */
    public AutomaticGun(int maxOfCartridges, int fireRate) {
        super(maxOfCartridges, maxOfCartridges);
        if (fireRate <= 0) {
            throw new IllegalArgumentException("Скорострельность должна быть положительным числом!");
        }
        if (maxOfCartridges <= 0) {
            throw new IllegalArgumentException("Вместимость должна быть положительным числом!");
        }
        this.fireRate = fireRate;
    }

    /**
     * Возвращает скорострельность автомата.
     * @return скорострельность
     */
    public int getFireRate() {
        return fireRate;
    }

    /**
     * Выполняет одиночную очередь: производит {@link #fireRate} выстрелов.
     */
    @Override
    public void fire() {
        for (int i = 0; i < fireRate; i++) {
            if (ammo > 0) {
                super.fire();
            } else {
                System.out.println("Патроны закончились!");
                break;
            }
        }
    }

    /**
     * Стрельба в течение указанного количества секунд.
     * @param n количество секунд (должно быть &gt; 0)
     */
    public void FireSecond(int n) {
        if (n <= 0) {
            System.out.println("Время стрельбы должно быть положительным!");
            return;
        }
        int totalShots = n * fireRate;
        System.out.println("Стрельба в течение " + n + " секунд...");
        int shotsFired = 0;
        for (int i = 0; i < totalShots; i++) {
            if (ammo > 0) {
                super.fire();
                shotsFired++;
            } else {
                System.out.println("Патроны закончились на " + (i + 1) + " выстреле");
                break;
            }
        }
        System.out.println("Кол-во выстрелов за " + n + " сек - " + shotsFired);
    }
}