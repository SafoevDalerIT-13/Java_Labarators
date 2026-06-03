/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию.
2. Удалён нереализованный метод equals.
3. Добавлен пробел после if.
4. Порядок: поля → конструкторы → геттеры/сеттеры → методы.
*/
package ru.safoev.fix;

/**
 * Представляет стрелка, который может иметь оружие и стрелять.
 */
public class Shooter {
    /** Имя стрелка */
    private String name;
    /** Оружие стрелка (может быть null) */
    private Weapon weapon;

    /**
     * Создаёт стрелка с именем, но без оружия.
     * @param name имя стрелка
     */
    public Shooter(String name) {
        this.name = name;
        this.weapon = null;
    }

    /**
     * Создаёт стрелка с именем и оружием.
     * @param name имя стрелка
     * @param weapon оружие
     */
    public Shooter(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    /**
     * Возвращает имя стрелка.
     * @return имя
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя стрелка.
     * @param name новое имя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает оружие стрелка.
     * @return оружие или null
     */
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * Устанавливает оружие стрелка.
     * @param weapon новое оружие (может быть null)
     */
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * Стреляет из оружия. Если оружие отсутствует, выводит сообщение
     * "не могу участвовать в перестрелке".
     */
    public void shoot() {
        if (weapon != null) {
            System.out.print(name + " стреляет: ");
            weapon.shoot();
        } else {
            System.out.println(name + ": не могу участвовать в перестрелке");
        }
    }

    /**
     * Возвращает строковое описание стрелка.
     * @return описание с именем
     */
    @Override
    public String toString() {
        return "Вы создали Стрелка с именем - " + name;
    }
}