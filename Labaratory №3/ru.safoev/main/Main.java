package ru.safoev.main;

import ru.safoev.application.MenuAndValidator;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {
        if (args.length >= 2) {
            String xStr = args[0];
            String yStr = args[1];
            double result = power(xStr, yStr);
            System.out.printf("Результат возведения " + xStr + " в степень " + yStr + ": " + result);
            System.out.println();
        }
        PolymorphismDemo.demonstrateShooters();
        MenuAndValidator menu = new MenuAndValidator();
        menu.menu();
    }

    // FIXME: метод power не в PascalCase (п.7)
    public static double power(String xStr, String yStr) {
        int x = parseInt(xStr);
        int y = parseInt(yStr);
        return pow(x, y);
    }
}