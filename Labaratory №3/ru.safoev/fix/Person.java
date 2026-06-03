/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию.
2. Порядок: поля → конструкторы → геттеры/сеттеры → toString.
3. Убран лишний пробел после return.
*/
package ru.safoev.fix;

/**
 * Представляет человека с именем и ростом.
 */
public class Person {
    /** Имя человека */
    private String name;
    /** Рост человека */
    private int height;

    /**
     * Создаёт человека без имени и роста (null, 0).
     */
    public Person() {
        this.name = null;
        this.height = 0;
    }

    /**
     * Создаёт человека с именем и ростом.
     * @param name имя
     * @param height рост
     */
    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    /**
     * Возвращает имя человека.
     * @return имя
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя человека.
     * @param name новое имя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает рост человека.
     * @return рост
     */
    public int getHeight() {
        return height;
    }

    /**
     * Возвращает строку вида "имя, рост: height".
     * @return строковое представление
     */
    @Override
    public String toString() {
        return name + ", рост: " + height;
    }
}