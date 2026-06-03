package ru.safoev.geometry;

public class Point {
    // FIXME: отступ - 4 пробела (п.1)
    private double x;
    private double y;

    //Геттеры и сеттеры - FIXME: должны быть после конструкторов (п.12)
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    //Конструкторы
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Вы создали точку с координатами по x: " + this.x + ", y: " + this.y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point other = (Point) obj;
        return Double.compare(this.x, other.x) == 0 && Double.compare(this.y, other.y) == 0;
    }
}