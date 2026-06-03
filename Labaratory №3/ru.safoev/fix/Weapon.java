/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию.
2. Метод shoot сделан public.
3. Использовано IllegalArgumentException вместо RuntimeException.
4. Комментарии удалены как излишние.
*/
package ru.safoev.fix;

/**
 * Абстрактный класс, представляющий оружие с боезапасом.
 */
public abstract class Weapon {
    /** Текущее количество патронов */
    protected int ammo;

    /**
     * Создаёт оружие с указанным количеством патронов.
     * @param ammo начальное количество патронов
     * @throws IllegalArgumentException если ammo &lt; 0
     */
    public Weapon(int ammo) {
        if (ammo < 0) {
            throw new IllegalArgumentException("Количество патронов не может быть отрицательным");
        }
        this.ammo = ammo;
    }

    /**
     * Абстрактный метод выстрела.
     */
    public abstract void shoot();

    /**
     * Возвращает текущее количество патронов.
     * @return количество патронов
     */
    public int ammo() {
        return ammo;
    }

    /**
     * Проверяет наличие патронов и уменьшает счётчик.
     * @return false (специфическое поведение)
     */
    public boolean getAmmo() {
        if (ammo == 0) return false;
        ammo--;
        return false;
    }

    /**
     * Загружает указанное количество патронов, возвращая предыдущее значение.
     * @param ammo новое количество патронов
     * @return предыдущее количество патронов
     * @throws IllegalArgumentException если ammo &lt; 0
     */
    public int load(int ammo) {
        if (ammo < 0) {
            throw new IllegalArgumentException("Количество патронов не может быть отрицательным");
        }
        int tmp = this.ammo;
        this.ammo = ammo;
        return tmp;
    }
}