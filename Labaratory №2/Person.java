public class Person {

    // FIXME: отступ - 2 пробела, нужна табуляция (п.1)
    // Поля - FIXME: комментарий излишен (п.21)
    private String name;
    private int height;

    //Геттеры и сеттеры - FIXME: нужен пробел после // (п.21), также порядок: сначала конструкторы, потом геттеры/сеттеры (п.12 - сначала private, но это поля, а методы public лучше после конструкторов)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return  this.height;  // FIXME: лишний пробел после return (п.4)
    }

    // Конструкторы - FIXME: должны быть до геттеров/сеттеров (п.12)
    public Person() {
        this.name = null;
        this.height = 0;
    }

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    // Метод to_string - FIXME: комментарий излишен (п.21)
    @Override
    public String toString() {
        return this.name + ", рост: " + this.height;
    }

}