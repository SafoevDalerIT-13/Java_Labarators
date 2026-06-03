

/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию.
2. Порядок: поля → конструкторы → геттеры/сеттеры → toString → equals.
3. Добавлен hashCode.
*/
package ru.safoev.fix;

/**
 * Представляет точку на плоскости с координатами X и Y.
 * Поддерживает сравнение по состоянию через {@link #equals(Object)}.
 */
public class Point {
    /** Координата X */
    private double x;
    /** Координата Y */
    private double y;

    /**
     * Создаёт точку в начале координат (0, 0).
     */
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * Создаёт точку с указанными координатами.
     * @param x координата X
     * @param y координата Y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает координату X.
     * @return X
     */
    public double getX() {
        return x;
    }

    /**
     * Устанавливает координату X.
     * @param x новое значение X
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Возвращает координату Y.
     * @return Y
     */
    public double getY() {
        return y;
    }

    /**
     * Устанавливает координату Y.
     * @param y новое значение Y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Возвращает строковое описание точки.
     * @return описание с координатами
     */
    @Override
    public String toString() {
        return "Вы создали точку с координатами по x: " + x + ", y: " + y;
    }

    /**
     * Сравнивает точки по координатам.
     * @param obj объект для сравнения
     * @return true если координаты совпадают
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point other = (Point) obj;
        return Double.compare(x, other.x) == 0 && Double.compare(y, other.y) == 0;
    }

    /**
     * Возвращает хэш-код на основе координат.
     * @return хэш-код
     */
    @Override
    public int hashCode() {
        return Double.hashCode(x) * 31 + Double.hashCode(y);
    }
}