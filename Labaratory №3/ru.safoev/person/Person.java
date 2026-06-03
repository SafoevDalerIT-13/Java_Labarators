package ru.safoev.person;

public class Person {

    // FIXME: отступ - 4 пробела (п.1)
    private String name;
    private int height;

    // FIXME: геттеры/сеттеры должны быть после конструкторов (п.12)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return  this.height; // FIXME: лишний пробел после return (п.4)
    }

    // Конструкторы
    public Person() {
        this.name = null;
        this.height = 0;
    }

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return this.name + ", рост: " + this.height;
    }
}