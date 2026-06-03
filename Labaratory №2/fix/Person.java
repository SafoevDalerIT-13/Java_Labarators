package fix;

/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию (п.1)
2. Порядок методов: конструкторы → геттеры/сеттеры → toString (п.12)
3. Убран лишний пробел после return (п.4)
4. Убраны излишние комментарии (п.21)
*/

public class Person {
    private String name;
    private int height;

    public Person() {
        this.name = null;
        this.height = 0;
    }

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return this.name + ", рост: " + this.height;
    }
}
