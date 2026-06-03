/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию.
2. Метод power переименован в Power (PascalCase).
3. Вызовы методов приведены к PascalCase (demonstrateShooters -> DemonstrateShooters, menu -> Menu).
*/
package ru.safoev.fix;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

/**
 * Главный класс программы. Запускает демонстрацию полиморфизма и меню.
 */
public class Main {
    /**
     * Точка входа в программу. Принимает два аргумента для возведения в степень,
     * затем запускает демонстрацию стрелков и меню.
     * @param args аргументы командной строки (x y)
     */
    public static void main(String[] args) {
        if (args.length >= 2) {
            String xStr = args[0];
            String yStr = args[1];
            double result = Power(xStr, yStr);
            System.out.printf("Результат возведения %s в степень %s: %s%n", xStr, yStr, result);
        }
        PolymorphismDemo.DemonstrateShooters();
        MenuAndValidator menu = new MenuAndValidator();
        menu.Menu();
    }

    /**
     * Возводит x в степень y.
     * @param xStr основание в строковом виде
     * @param yStr показатель степени в строковом виде
     * @return результат возведения в степень
     */
    public static double Power(String xStr, String yStr) {
        int x = parseInt(xStr);
        int y = parseInt(yStr);
        return pow(x, y);
    }
}