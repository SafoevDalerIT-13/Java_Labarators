/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию.
2. Методы out... переименованы в Print... (PascalCase).
3. Метод chargedOrNotCharged переименован в PrintChargedStatus.
4. Порядок методов: конструкторы, геттеры, reload, unLoad, isCharged, Print..., fire, shoot, toString.
*/
package ru.safoev.fix;

/**
 * Представляет пистолет — вид оружия с ограниченной обоймой.
 * Поддерживает перезарядку, разрядку и стрельбу.
 */
public class Gun extends Weapon {
    /** Максимальная вместимость обоймы */
    private final int maxOfCartridges;

    /**
     * Создаёт пистолет с 5 патронами и вместимостью 5.
     */
    public Gun() {
        super(5);
        this.maxOfCartridges = 5;
    }

    /**
     * Создаёт пистолет с указанным количеством патронов.
     * Вместимость устанавливается равной количеству патронов.
     * @param numberOfCartridges начальное количество патронов
     */
    public Gun(int numberOfCartridges) {
        super(numberOfCartridges);
        this.maxOfCartridges = numberOfCartridges;
    }

    /**
     * Создаёт пистолет с указанным количеством патронов и вместимостью.
     * @param numberOfCartridges начальное количество патронов
     * @param maxOfCartridges максимальная вместимость обоймы
     */
    public Gun(int numberOfCartridges, int maxOfCartridges) {
        super(numberOfCartridges);
        if (maxOfCartridges < numberOfCartridges) {
            System.out.println("Обойма не может быть меньше кол-ва патрон в ней! Установлено значение кол-ва патрон!");
            this.maxOfCartridges = numberOfCartridges;
        } else {
            this.maxOfCartridges = maxOfCartridges;
        }
    }

    /**
     * Возвращает текущее количество патронов.
     * @return количество патронов
     */
    public int getNumberOfCartridges() {
        return ammo;
    }

    /**
     * Возвращает максимальную вместимость обоймы.
     * @return максимальная вместимость
     */
    public int getMaxOfCartridges() {
        return maxOfCartridges;
    }

    /**
     * Перезаряжает пистолет указанным количеством патронов.
     * Лишние патроны возвращаются.
     * @param numberOfCartridges количество патронов для зарядки
     * @return количество лишних патронов
     * @throws IllegalArgumentException если numberOfCartridges &lt; 0
     */
    public int reload(int numberOfCartridges) {
        System.out.println("Перезаряжаем пистолет...");
        if (numberOfCartridges < 0) {
            throw new IllegalArgumentException("Количество патронов не может быть отрицательным!");
        }
        int totalAmmo = ammo + numberOfCartridges;
        int extra = 0;
        if (totalAmmo <= maxOfCartridges) {
            ammo = totalAmmo;
        } else {
            extra = totalAmmo - maxOfCartridges;
            ammo = maxOfCartridges;
            System.out.println("Добавлено патронов: " + (numberOfCartridges - extra));
            System.out.println("Кол-во лишних патрон: " + extra);
        }
        System.out.println("После перезарядки: " + ammo);
        return extra;
    }

    /**
     * Разряжает пистолет, обнуляя патроны.
     * @return количество извлечённых патронов
     */
    public int unLoad() {
        int result = ammo;
        ammo = 0;
        System.out.println("Вы разрядили пистолет! Возвращено патронов: " + result);
        return result;
    }

    /**
     * Проверяет, заряжен ли пистолет.
     * @return true если есть хотя бы один патрон
     */
    public boolean isCharged() {
        return ammo > 0;
    }

    /**
     * Выводит статус заряженности пистолета в консоль.
     */
    public void PrintChargedStatus() {
        if (isCharged()) {
            System.out.println("Пистолет заряжен!");
        } else {
            System.out.println("Пистолет разряжен!");
        }
    }

    /**
     * Выводит максимальную вместимость пистолета.
     */
    public void PrintMaxOfCartridges() {
        System.out.println("Максимально кол-во патронов, которых вмещает пистолет: " + maxOfCartridges);
    }

    /**
     * Выводит текущее количество патронов.
     */
    public void PrintNumberOfCartridges() {
        System.out.println("Сейчас заряженно патрон: " + ammo);
    }

    /**
     * Выполняет один выстрел (делегирует {@link #shoot()}).
     */
    public void fire() {
        shoot();
    }

    /**
     * Производит выстрел: выводит "Бах!" и уменьшает количество патронов,
     * или "Клац!" если патронов нет.
     */
    @Override
    public void shoot() {
        if (ammo > 0) {
            ammo--;
            System.out.println("Бах!");
        } else {
            System.out.println("Клац!");
        }
    }

    /**
     * Возвращает строковое описание пистолета.
     * @return описание с количеством патронов и вместимостью
     */
    @Override
    public String toString() {
        return "Вы создали пистолет, в котором обойма состоит из - " + ammo +
                " и максимальной обоймой - " + maxOfCartridges;
    }
}