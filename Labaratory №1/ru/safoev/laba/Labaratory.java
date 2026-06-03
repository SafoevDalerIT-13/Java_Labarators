package ru.safoev.laba;

import java.util.Random;
import java.util.Scanner;

public class Labaratory {
    private static Scanner scanner = new Scanner(System.in);

    // FIXME: метод menu() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Menu), п.15 "один метод - одна задача" (слишком длинный)
    /*
    public void menu() {
        while (true) {
            System.out.println("\nЗдравствуйте, это первая лабораторная работа по Java!");
            System.out.println("=======Меню=======");
            System.out.println("----Методы----");
            System.out.println("1 - Задача 2");
            System.out.println("2 - Задача 4");
            System.out.println("3 - Задача 6");
            System.out.println("4 - Задача 8");
            System.out.println("5 - Задача 10");
            System.out.println("----Условия----");
            System.out.println("6 - Задача 2");
            System.out.println("7 - Задача 4");
            System.out.println("8 - Задача 6");
            System.out.println("9 - Задача 8");
            System.out.println("10 - Задача 10");
            System.out.println("----Циклы----");
            System.out.println("11 - Задача 2");
            System.out.println("12 - Задача 4");
            System.out.println("13 - Задача 6");
            System.out.println("14 - Задача 8");
            System.out.println("15 - Задача 10");
            System.out.println("----Массивы----");
            System.out.println("16 - Задача 2");
            System.out.println("17 - Задача 4");
            System.out.println("18 - Задача 6");
            System.out.println("19 - Задача 8");
            System.out.println("20 - Задача 10");
            System.out.println("0 - Выход");
            System.out.print("Выберите задание: ");

            int choice = -1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }

            switch (choice) {
                case 0:
                    System.out.println("Выход из программы.......");
                    return;
                case 1:
                    int num = input2m();
                    System.out.println(sumLastNums(num));
                    break;
                case 2:
                    int num1 = input4m();
                    System.out.println(isPositive(num1));
                    break;
                case 3:
                    char simbol = input6m();
                    System.out.println(isUpperCase(simbol));
                    break;
                case 4:
                    int[] num2 = input8m();
                    int firstnum = num2[0];
                    int lastnum = num2[1];
                    System.out.println(isDivisor(firstnum, lastnum));
                    break;
                case 5:
                    int[] num3 = input10m();
                    int firstnum1 = num3[0];
                    int lastnum2 = num3[1];
                    lastNumSum(firstnum1, lastnum2);
                    break;
                case 6:
                    int[] num4 = input2y();
                    int firstnum4 = num4[0];
                    int lastnum4 = num4[1];
                    System.out.println(safeDiv(firstnum4, lastnum4));
                    break;
                case 7:
                    int[] num5 = input4y();
                    int firstnum5 = num5[0];
                    int lastnum5 = num5[1];
                    System.out.println(makeDecision(firstnum5, lastnum5));
                    break;
                case 8:
                    int[] num6 = input6y();
                    int onenum6 = num6[0];
                    int twonum6 = num6[1];
                    int threenum6 = num6[2];
                    System.out.println(sum3(onenum6, twonum6, threenum6));
                    break;
                case 9:
                    int num8 = input8y();
                    System.out.println(age(num8));
                    break;
                case 10:
                    String num9 = input10y();
                    printDays(num9);
                    break;
                case 11:
                    int num10 = input2c();
                    System.out.println(reverseListNums(num10));
                    break;
                case 12:
                    int[] num10arr = input4c();
                    int firstnum10 = num10arr[0];
                    int lastnum10 = num10arr[1];
                    System.out.println(pow(firstnum10, lastnum10));
                    break;
                case 13:
                    int num11 = input6c();
                    System.out.println(equalNum(num11));
                    break;
                case 14:
                    int num12 = input8c();
                    leftTriangle(num12);
                    break;
                case 15:
                    guessGame();
                    break;
                case 16:
                    int[] arr = input2arr();
                    outarr(arr);
                    int num12val = input2arr1();
                    System.out.println(findLast(arr, num12val));
                    break;
                case 17:
                    System.out.println("Задача: Необходимо реализовать метод таким образом, чтобы он возвращал новый\n" +
                        "массив, который будет содержать все элементы массива arr, однако в позицию\n" +
                        "pos будет вставлено значение x.\n");
                    int[] arr1 = input4arr();
                    outarr(arr1);
                    System.out.println("\nВведите число которое хотите вставить в массив! ");
                    int x = inputhelp2();
                    System.out.println("\nВведите на какую позицию вы хотите вставить число! ");
                    int pos = inputhelp2();
                    add(arr1, x, pos);
                    break;
                case 18:
                    System.out.println(
                        "Задача: Необходимо реализовать метод таким образом, чтобы он изменял массив arr.\n"
                            + "После проведенных изменений массив должен быть записан задом-наперед.");
                    int[] arr2 = helpinput();
                    result();
                    reverse(arr2);
                    break;
                case 19:
                    System.out.println(
                        "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал новый\n"
                            + "массив, в котором сначала идут элементы первого массива (arr1), а затем\n"
                            + "второго (arr2).\n");
                    System.out.println("Введите первый массив! ");
                    int[] arr3 = helpinput();
                    System.out.println("Введите второй массив! ");
                    int[] arr4 = helpinput();
                    System.out.println("Ваш первый массив!");
                    outarr(arr3);
                    System.out.println("\nВаш второй массив!");
                    outarr(arr4);
                    concat(arr3, arr4);
                    break;
                case 20:
                    System.out.println(
                        "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал новый\n"
                            + "массив, в котором записаны все элементы массива arr кроме отрицательных.\n");
                    int[] arr5 = helpinput();
                    outarr(arr5);
                    deleteNegative(arr5);
                    break;
                default:
                    System.out.println("Неверный выбор! Попробуйте снова.");
                    break;
            }
        }
    }
    */
    // FIXTO: исправлено имя метода на Menu (PascalCase), разбит на методы
    public void Menu() {
        while (true) {
            PrintMenu();
            int choice = GetIntInput("Выберите задание: ");
            if (choice == 0) {
                System.out.println("Выход из программы.......");
                return;
            }
            ExecuteChoice(choice);
        }
    }

    private void PrintMenu() {
        System.out.println("\nЗдравствуйте, это первая лабораторная работа по Java!");
        System.out.println("=======Меню=======");
        System.out.println("----Методы----");
        System.out.println("1 - Задача 2");
        System.out.println("2 - Задача 4");
        System.out.println("3 - Задача 6");
        System.out.println("4 - Задача 8");
        System.out.println("5 - Задача 10");
        System.out.println("----Условия----");
        System.out.println("6 - Задача 2");
        System.out.println("7 - Задача 4");
        System.out.println("8 - Задача 6");
        System.out.println("9 - Задача 8");
        System.out.println("10 - Задача 10");
        System.out.println("----Циклы----");
        System.out.println("11 - Задача 2");
        System.out.println("12 - Задача 4");
        System.out.println("13 - Задача 6");
        System.out.println("14 - Задача 8");
        System.out.println("15 - Задача 10");
        System.out.println("----Массивы----");
        System.out.println("16 - Задача 2");
        System.out.println("17 - Задача 4");
        System.out.println("18 - Задача 6");
        System.out.println("19 - Задача 8");
        System.out.println("20 - Задача 10");
        System.out.println("0 - Выход");
    }

    private int GetIntInput(String prompt) {
        System.out.print(prompt);
        while (true) {
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                System.out.print(prompt);
            }
        }
    }

    private void ExecuteChoice(int choice) {
        switch (choice) {
            case 1:
                int num = Input2M();
                System.out.println(SumLastNums(num));
                break;
            case 2:
                int num1 = Input4M();
                System.out.println(IsPositive(num1));
                break;
            case 3:
                char simbol = Input6M();
                System.out.println(IsUpperCase(simbol));
                break;
            case 4:
                int[] num2 = Input8M();
                System.out.println(IsDivisor(num2[0], num2[1]));
                break;
            case 5:
                int[] num3 = Input10M();
                LastNumSum(num3[0], num3[1]);
                break;
            case 6:
                int[] num4 = Input2Y();
                System.out.println(SafeDiv(num4[0], num4[1]));
                break;
            case 7:
                int[] num5 = Input4Y();
                System.out.println(MakeDecision(num5[0], num5[1]));
                break;
            case 8:
                int[] num6 = Input6Y();
                System.out.println(Sum3(num6[0], num6[1], num6[2]));
                break;
            case 9:
                int num8 = Input8Y();
                System.out.println(Age(num8));
                break;
            case 10:
                String num9 = Input10Y();
                PrintDays(num9);
                break;
            case 11:
                int num10 = Input2C();
                System.out.println(ReverseListNums(num10));
                break;
            case 12:
                int[] num10arr = Input4C();
                System.out.println(Pow(num10arr[0], num10arr[1]));
                break;
            case 13:
                int num11 = Input6C();
                System.out.println(EqualNum(num11));
                break;
            case 14:
                int num12 = Input8C();
                LeftTriangle(num12);
                break;
            case 15:
                GuessGame();
                break;
            case 16:
                int[] arr = Input2Arr();
                OutArr(arr);
                int num12val = Input2Arr1();
                System.out.println(FindLast(arr, num12val));
                break;
            case 17:
                System.out.println("Задача: Необходимо реализовать метод таким образом, чтобы он возвращал новый\n" +
                        "массив, который будет содержать все элементы массива arr, однако в позицию\n" +
                        "pos будет вставлено значение x.\n");
                int[] arr1 = Input4Arr();
                OutArr(arr1);
                System.out.println("\nВведите число которое хотите вставить в массив! ");
                int x = InputHelp2();
                System.out.println("\nВведите на какую позицию вы хотите вставить число! ");
                int pos = InputHelp2();
                Add(arr1, x, pos);
                break;
            case 18:
                System.out.println(
                        "Задача: Необходимо реализовать метод таким образом, чтобы он изменял массив arr.\n"
                                + "После проведенных изменений массив должен быть записан задом-наперед.");
                int[] arr2 = HelpInput();
                Result();
                Reverse(arr2);
                break;
            case 19:
                System.out.println(
                        "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал новый\n"
                                + "массив, в котором сначала идут элементы первого массива (arr1), а затем\n"
                                + "второго (arr2).\n");
                System.out.println("Введите первый массив! ");
                int[] arr3 = HelpInput();
                System.out.println("Введите второй массив! ");
                int[] arr4 = HelpInput();
                System.out.println("Ваш первый массив!");
                OutArr(arr3);
                System.out.println("\nВаш второй массив!");
                OutArr(arr4);
                Concat(arr3, arr4);
                break;
            case 20:
                System.out.println(
                        "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал новый\n"
                                + "массив, в котором записаны все элементы массива arr кроме отрицательных.\n");
                int[] arr5 = HelpInput();
                OutArr(arr5);
                DeleteNegative(arr5);
                break;
            default:
                System.out.println("Неверный выбор! Попробуйте снова.");
                break;
        }
    }

    // FIXME: метод result() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Result)
    /*
    public void result() {
        System.out.print("Результат: ");
    }
    */
    // FIXTO: исправлено имя на Result
    public void Result() {
        System.out.print("Результат: ");
    }

    // FIXME: метод outarr() - нарушает п.7 "методы пишутся в PascalCase" (должно быть OutArr)
    /*
    public void outarr(int[] arr) {
        System.out.print("Ваш массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    */
    // FIXTO: исправлено имя на OutArr
    public void OutArr(int[] arr) {
        System.out.print("Ваш массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // ========= МЕТОДЫ =========

    // FIXME: метод input2m() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input2M)
    /*
    public int input2m() {
        System.out.println(
            "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал результат\n"
                + "сложения двух последних знаков числах, предполагая, что знаков в числе не\n"
                + "менее двух.");
        while (true) {
            System.out.print("Введите целое число (минимум 2 цифры): ");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                scanner.nextLine();
                if (x < 0) {
                    System.out.println("Ошибка! Число отрицательное.");
                    continue;
                }
                if (x >= 10) {
                    return x;
                } else {
                    System.out.println("Ошибка! Число должно содержать минимум 2 цифры.");
                }
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
        }
    }
    */
    // FIXTO: исправлено имя на Input2M
    public int Input2M() {
        System.out.println(
                "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал результат\n"
                        + "сложения двух последних знаков числах, предполагая, что знаков в числе не\n"
                        + "менее двух.");
        while (true) {
            System.out.print("Введите целое число (минимум 2 цифры): ");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                scanner.nextLine();
                if (x < 0) {
                    System.out.println("Ошибка! Число отрицательное.");
                    continue;
                }
                if (x >= 10) {
                    return x;
                } else {
                    System.out.println("Ошибка! Число должно содержать минимум 2 цифры.");
                }
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
        }
    }

    // FIXME: метод sumLastNums() - нарушает п.7 "методы пишутся в PascalCase" (должно быть SumLastNums)
    /*
    public int sumLastNums(int x) {
        int last = x % 10;
        int last1 = (x / 10) % 10;
        result();
        return last + last1;
    }
    */
    // FIXTO: исправлено имя на SumLastNums
    public int SumLastNums(int x) {
        int last = x % 10;
        int last1 = (x / 10) % 10;
        Result();
        return last + last1;
    }

    // FIXME: метод inputhelp2() - нарушает п.7 "методы пишутся в PascalCase" (должно быть InputHelp2)
    /*
    public int inputhelp2() {
        while (true) {
            System.out.print("Введите целое число: ");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                scanner.nextLine();
                return x;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
        }
    }
    */
    // FIXTO: исправлено имя на InputHelp2
    public int InputHelp2() {
        while (true) {
            System.out.print("Введите целое число: ");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                scanner.nextLine();
                return x;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
        }
    }

    // FIXME: метод input4m() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input4M)
    /*
    public int input4m() {
        System.out.println(
            "Задача: Необходимо реализовать метод таким образом, чтобы он принимал число x и\n"
                + "возвращал true, если оно положительное.");
        return inputhelp2();
    }
    */
    // FIXTO: исправлено имя на Input4M
    public int Input4M() {
        System.out.println(
                "Задача: Необходимо реализовать метод таким образом, чтобы он принимал число x и\n"
                        + "возвращал true, если оно положительное.");
        return InputHelp2();
    }

    // FIXME: метод isPositive() - нарушает п.7 "методы пишутся в PascalCase" (должно быть IsPositive)
    /*
    public boolean isPositive(int x) {
        result();
        return x > 0;
    }
    */
    // FIXTO: исправлено имя на IsPositive
    public boolean IsPositive(int x) {
        Result();
        return x > 0;
    }

    // FIXME: метод input6m() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input6M)
    /*
    public char input6m() {
        System.out.println(
            "Задача: Необходимо реализовать метод таким образом, чтобы он принимал символ x и\n"
                + "возвращал true, если это большая буква в диапазоне от 'A' до 'Z'. ");
        while (true) {
            System.out.print("Введите символ (только A-Z): ");
            String input = scanner.next();
            if (input.length() != 1) {
                System.out.println("Ошибка! Введите ровно один символ.");
                continue;
            }
            char x = input.charAt(0);
            if ((x >= 'А' && x <= 'Я') || (x >= 'а' && x <= 'я')) {
                System.out.println("Ошибка! Введена русская буква. Введите только символы от A до Z.");
                continue;
            }
            return x;
        }
    }
    */
    // FIXTO: исправлено имя на Input6M
    public char Input6M() {
        System.out.println(
                "Задача: Необходимо реализовать метод таким образом, чтобы он принимал символ x и\n"
                        + "возвращал true, если это большая буква в диапазоне от 'A' до 'Z'. ");
        while (true) {
            System.out.print("Введите символ (только A-Z): ");
            String input = scanner.next();
            if (input.length() != 1) {
                System.out.println("Ошибка! Введите ровно один символ.");
                continue;
            }
            char x = input.charAt(0);
            if ((x >= 'А' && x <= 'Я') || (x >= 'а' && x <= 'я')) {
                System.out.println("Ошибка! Введена русская буква. Введите только символы от A до Z.");
                continue;
            }
            return x;
        }
    }

    // FIXME: метод isUpperCase() - нарушает п.7 "методы пишутся в PascalCase" (должно быть IsUpperCase)
    /*
    public boolean isUpperCase(char x) {
        result();
        return x >= 'A' && x <= 'Z';
    }
    */
    // FIXTO: исправлено имя на IsUpperCase
    public boolean IsUpperCase(char x) {
        Result();
        return x >= 'A' && x <= 'Z';
    }

    // FIXME: метод input8m() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input8M)
    /*
    public int[] input8m() {
        System.out.println(
            "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал true, если\n"
                + "любое из принятых чисел делит другое нацело.");
        int[] x = new int[2];
        for (int i = 0; i < x.length; i++) {
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
        }
        return x;
    }
    */
    // FIXTO: исправлено имя на Input8M
    public int[] Input8M() {
        System.out.println(
                "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал true, если\n"
                        + "любое из принятых чисел делит другое нацело.");
        int[] x = new int[2];
        for (int i = 0; i < x.length; i++) {
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
        }
        return x;
    }

    // FIXME: метод isDivisor() - нарушает п.7 "методы пишутся в PascalCase" (должно быть IsDivisor)
    /*
    public boolean isDivisor(int a, int b) {
        result();
        return a % b == 0 || b % a == 0;
    }
    */
    // FIXTO: исправлено имя на IsDivisor
    public boolean IsDivisor(int a, int b) {
        Result();
        return a % b == 0 || b % a == 0;
    }

    // FIXME: метод input10m() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input10M)
    /*
    public int[] input10m() {
        System.out.println(
            "Задача: Необходимо реализовать метод таким образом, чтобы он считал сумму цифр\n"
                + "двух чисел из разряда единиц. Выполните с его помощью последовательное\n"
                + "сложение пяти чисел и результат выведите на экран. Постарайтесь выполнить\n"
                + "задачу, используя минимально возможное количество вспомогательных\n"
                + "переменных.");
        int[] x = new int[2];
        for (int i = 0; i < x.length; i++) {
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
        }
        return x;
    }
    */
    // FIXTO: исправлено имя на Input10M
    public int[] Input10M() {
        System.out.println(
                "Задача: Необходимо реализовать метод таким образом, чтобы он считал сумму цифр\n"
                        + "двух чисел из разряда единиц. Выполните с его помощью последовательное\n"
                        + "сложение пяти чисел и результат выведите на экран. Постарайтесь выполнить\n"
                        + "задачу, используя минимально возможное количество вспомогательных\n"
                        + "переменных.");
        int[] x = new int[2];
        for (int i = 0; i < x.length; i++) {
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
        }
        return x;
    }

    // FIXME: метод lastNumSum() - нарушает п.7 "методы пишутся в PascalCase" (должно быть LastNumSum)
    /*
    public int lastNumSum(int a, int b) {
        a = a % 10 + b % 10;
        System.out.print("Результат первых двух чисел: " + a);
        for (int i = 2; i < 5; i++) {
            System.out.println();
            int x1;
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x1 = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
            a = a % 10 + x1 % 10;
            System.out.print("Результат: " + a);
        }
        System.out.println();
        System.out.println("Итог: " + a);
        return a;
    }
    */
    // FIXTO: исправлено имя на LastNumSum
    public int LastNumSum(int a, int b) {
        a = a % 10 + b % 10;
        System.out.print("Результат первых двух чисел: " + a);
        for (int i = 2; i < 5; i++) {
            System.out.println();
            int x1;
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x1 = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
            a = a % 10 + x1 % 10;
            System.out.print("Результат: " + a);
        }
        System.out.println();
        System.out.println("Итог: " + a);
        return a;
    }

    // ========= УСЛОВИЯ ========

    // FIXME: метод input2y() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input2Y)
    /*
    public int[] input2y() {
        System.out.println(
            "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал деление x\n"
                + "на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0. При\n"
                + "делении на 0 следует вернуть из метода число 0.");
        int[] x = new int[2];
        for (int i = 0; i < x.length; i++) {
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
        }
        return x;
    }
    */
    // FIXTO: исправлено имя на Input2Y
    public int[] Input2Y() {
        System.out.println(
                "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал деление x\n"
                        + "на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0. При\n"
                        + "делении на 0 следует вернуть из метода число 0.");
        int[] x = new int[2];
        for (int i = 0; i < x.length; i++) {
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
        }
        return x;
    }

    // FIXME: метод safeDiv() - нарушает п.7 "методы пишутся в PascalCase" (должно быть SafeDiv)
    /*
    public double safeDiv(int x, int y) {
        if (x != 0 && y != 0) {
            result();
            return (double) x / y;
        } else {
            result();
            return 0;
        }
    }
    */
    // FIXTO: исправлено имя на SafeDiv
    public double SafeDiv(int x, int y) {
        if (x != 0 && y != 0) {
            Result();
            return (double) x / y;
        } else {
            Result();
            return 0;
        }
    }

    // FIXME: метод input4y() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input4Y)
    /*
    public int[] input4y() {
        System.out.println(
            "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал строку,\n"
                + "которая включает два принятых методом числа и корректно выставленный\n"
                + "знак операции сравнения (больше, меньше, или равно).\n");
        int[] x = new int[2];
        for (int i = 0; i < x.length; i++) {
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
        }
        return x;
    }
    */
    // FIXTO: исправлено имя на Input4Y
    public int[] Input4Y() {
        System.out.println(
                "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал строку,\n"
                        + "которая включает два принятых методом числа и корректно выставленный\n"
                        + "знак операции сравнения (больше, меньше, или равно).\n");
        int[] x = new int[2];
        for (int i = 0; i < x.length; i++) {
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
        }
        return x;
    }

    // FIXME: метод makeDecision() - нарушает п.7 "методы пишутся в PascalCase" (должно быть MakeDecision)
    /*
    public String makeDecision(int x, int y) {
        if (x < y) {
            result();
            return x + " < " + y;
        } else if (x == y) {
            result();
            return x + " = " + y;
        } else {
            result();
            return x + " > " + y;
        }
    }
    */
    // FIXTO: исправлено имя на MakeDecision
    public String MakeDecision(int x, int y) {
        if (x < y) {
            Result();
            return x + " < " + y;
        } else if (x == y) {
            Result();
            return x + " = " + y;
        } else {
            Result();
            return x + " > " + y;
        }
    }

    // FIXME: метод input6y() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input6Y)
    /*
    public int[] input6y() {
        System.out.println(
            "Задача: "
                + "Необходимо реализовать метод таким образом, чтобы он возвращал true, если\n"
                + "два любых числа (из трех принятых) можно сложить так, чтобы получить\n"
                + "третье. ");
        int[] x = new int[3];
        for (int i = 0; i < x.length; i++) {
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
        }
        return x;
    }
    */
    // FIXTO: исправлено имя на Input6Y
    public int[] Input6Y() {
        System.out.println(
                "Задача: "
                        + "Необходимо реализовать метод таким образом, чтобы он возвращал true, если\n"
                        + "два любых числа (из трех принятых) можно сложить так, чтобы получить\n"
                        + "третье. ");
        int[] x = new int[3];
        for (int i = 0; i < x.length; i++) {
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
        }
        return x;
    }

    // FIXME: метод sum3() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Sum3)
    /*
    public boolean sum3(int x, int y, int z) {
        result();
        return (x + y == z) || (x + z == y) || (y + z == x);
    }
    */
    // FIXTO: исправлено имя на Sum3
    public boolean Sum3(int x, int y, int z) {
        Result();
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    // FIXME: метод input8y() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input8Y)
    /*
    public int input8y() {
        System.out.println(
            "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал строку, в\n"
                + "которой сначала будет число х, а затем одно из слов:\n"
                + "год\n"
                + "года\n"
                + "лет\n"
                + "Слово \"год\" добавляется, если число х заканчивается на 1, кроме числа 11.\n"
                + "Слово \"года\" добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел\n"
                + "12, 13, 14.\n"
                + "Слово \"лет\" добавляется во всех остальных случаях.\n");
        while (true) {
            System.out.print("Введите число: ");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                scanner.nextLine();
                if (x <= 0) {
                    System.out.println("Ошибка! Число отрицательное.");
                    continue;
                }
                return x;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
        }
    }
    */
    // FIXTO: исправлено имя на Input8Y
    public int Input8Y() {
        System.out.println(
                "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал строку, в\n"
                        + "которой сначала будет число х, а затем одно из слов:\n"
                        + "год\n"
                        + "года\n"
                        + "лет\n"
                        + "Слово \"год\" добавляется, если число х заканчивается на 1, кроме числа 11.\n"
                        + "Слово \"года\" добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел\n"
                        + "12, 13, 14.\n"
                        + "Слово \"лет\" добавляется во всех остальных случаях.\n");
        while (true) {
            System.out.print("Введите число: ");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                scanner.nextLine();
                if (x <= 0) {
                    System.out.println("Ошибка! Число отрицательное.");
                    continue;
                }
                return x;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
        }
    }

    // FIXME: метод age() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Age)
    /*
    public String age(int x) {
        if (x % 10 == 1) {
            if (x == 11) {
                result();
                return x + " лет";
            }
            result();
            return x + " год";
        } else if (x % 10 == 2 || x % 10 == 3 || x % 10 == 4) {
            if (x == 12 || x == 13 || x == 14) {
                result();
                return x + " лет";
            }
            result();
            return x + " года";
        } else {
            result();
            return x + " лет";
        }
    }
    */
    // FIXTO: исправлено имя на Age
    public String Age(int x) {
        if (x % 10 == 1) {
            if (x == 11) {
                Result();
                return x + " лет";
            }
            Result();
            return x + " год";
        } else if (x % 10 == 2 || x % 10 == 3 || x % 10 == 4) {
            if (x == 12 || x == 13 || x == 14) {
                Result();
                return x + " лет";
            }
            Result();
            return x + " года";
        } else {
            Result();
            return x + " лет";
        }
    }

    // FIXME: метод input10y() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input10Y), нарушен пробел после if
    /*
    public String input10y() {
        System.out.println(
            "Задача: В качестве параметра метод принимает строку, в которой записано название\n"
                + "дня недели. Необходимо реализовать метод таким образом, чтобы он выводил\n"
                + "на экран название переданного в него дня и всех последующих до конца недели\n"
                + "дней. Если в качестве строки передан не день, то выводится текст \"это не день\n"
                + "недели\". Первый день понедельник, последний – воскресенье.");
        while (true) {
            System.out.print("Введите день недели: ");
            if (scanner.hasNextInt()) {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это число. Введите день недели!.");
            } else {
                return scanner.nextLine();
            }
        }
    }
    */
    // FIXTO: исправлено имя на Input10Y и пробел после if
    public String Input10Y() {
        System.out.println(
                "Задача: В качестве параметра метод принимает строку, в которой записано название\n"
                        + "дня недели. Необходимо реализовать метод таким образом, чтобы он выводил\n"
                        + "на экран название переданного в него дня и всех последующих до конца недели\n"
                        + "дней. Если в качестве строки передан не день, то выводится текст \"это не день\n"
                        + "недели\". Первый день понедельник, последний – воскресенье.");
        while (true) {
            System.out.print("Введите день недели: ");
            if (scanner.hasNextInt()) {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это число. Введите день недели!.");
            } else {
                return scanner.nextLine();
            }
        }
    }

    // FIXME: метод printDays() - нарушает п.7 "методы пишутся в PascalCase" (должно быть PrintDays)
    /*
    public void printDays(String x) {
        System.out.println("Результат: ");
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }
    */
    // FIXTO: исправлено имя на PrintDays
    public void PrintDays(String x) {
        System.out.println("Результат: ");
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    // ========= ЦИКЛЫ ===========

    // FIXME: метод input2c() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input2C)
    /*
    public int input2c() {
        System.out.println(
            "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал строку, в\n"
                + "которой будут записаны все числа от x до 0 (включительно).");
        while (true) {
            System.out.print("Введите число: ");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                scanner.nextLine();
                result();
                return x;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
        }
    }
    */
    // FIXTO: исправлено имя на Input2C
    public int Input2C() {
        System.out.println(
                "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал строку, в\n"
                        + "которой будут записаны все числа от x до 0 (включительно).");
        while (true) {
            System.out.print("Введите число: ");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                scanner.nextLine();
                Result();
                return x;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
        }
    }

    // FIXME: метод reverseListNums() - нарушает п.7 "методы пишутся в PascalCase" (должно быть ReverseListNums)
    /*
    public String reverseListNums(int x) {
        if (x == 0) {
            return "0";
        }
        if (x > 0) {
            return x + " " + reverseListNums(x - 1);
        } else {
            return x + " " + reverseListNums(x + 1);
        }
    }
    */
    // FIXTO: исправлено имя на ReverseListNums
    public String ReverseListNums(int x) {
        if (x == 0) {
            return "0";
        }
        if (x > 0) {
            return x + " " + ReverseListNums(x - 1);
        } else {
            return x + " " + ReverseListNums(x + 1);
        }
    }

    // FIXME: метод input4c() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input4C)
    /*
    public int[] input4c() {
        System.out.println(
            "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал результат\n"
                + "возведения x в степень y.");
        int[] x = new int[2];
        for (int i = 0; i < x.length; i++) {
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
        }
        return x;
    }
    */
    // FIXTO: исправлено имя на Input4C
    public int[] Input4C() {
        System.out.println(
                "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал результат\n"
                        + "возведения x в степень y.");
        int[] x = new int[2];
        for (int i = 0; i < x.length; i++) {
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
        }
        return x;
    }

    // FIXME: метод pow() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Pow)
    /*
    public double pow(int x, int y) {
        if (y == 0) {
            result();
            return 1;
        }
        if (y < 0) {
            double result = 1.0;
            for (int i = 0; i < -y; i++) {
                result *= x;
            }
            result();
            return 1.0 / result;
        } else {
            int result = 1;
            for (int i = 0; i < y; i++) {
                result *= x;
            }
            result();
            return result;
        }
    }
    */
    // FIXTO: исправлено имя на Pow
    public double Pow(int x, int y) {
        if (y == 0) {
            Result();
            return 1;
        }
        if (y < 0) {
            double result = 1.0;
            for (int i = 0; i < -y; i++) {
                result *= x;
            }
            Result();
            return 1.0 / result;
        } else {
            int result = 1;
            for (int i = 0; i < y; i++) {
                result *= x;
            }
            Result();
            return result;
        }
    }

    // FIXME: метод input6c() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input6C)
    /*
    public int input6c() {
        System.out.println(
            "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал true, если\n"
                + "все знаки числа одинаковы, и false в ином случае.");
        while (true) {
            System.out.print("Введите число: ");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                scanner.nextLine();
                result();
                return x;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
        }
    }
    */
    // FIXTO: исправлено имя на Input6C
    public int Input6C() {
        System.out.println(
                "Задача: Необходимо реализовать метод таким образом, чтобы он возвращал true, если\n"
                        + "все знаки числа одинаковы, и false в ином случае.");
        while (true) {
            System.out.print("Введите число: ");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                scanner.nextLine();
                Result();
                return x;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
        }
    }

    // FIXME: метод equalNum() - нарушает п.7 "методы пишутся в PascalCase" (должно быть EqualNum)
    /*
    public boolean equalNum(int x) {
        if (x < 10 && x >= 0) {
            return true;
        }
        if (x < 0) {
            x = -x;
        }
        int lastx = x % 10;
        x = x / 10;
        while (x > 0) {
            int currentx = x % 10;
            if (currentx != lastx) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }
    */
    // FIXTO: исправлено имя на EqualNum
    public boolean EqualNum(int x) {
        if (x < 10 && x >= 0) {
            return true;
        }
        if (x < 0) {
            x = -x;
        }
        int lastx = x % 10;
        x = x / 10;
        while (x > 0) {
            int currentx = x % 10;
            if (currentx != lastx) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }

    // FIXME: метод input8c() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input8C)
    /*
    public int input8c() {
        System.out.println(
            "Задача: Необходимо реализовать метод таким образом, чтобы он выводил на экран\n"
                + "треугольник из символов '*' у которого х символов в высоту, а количество\n"
                + "символов в ряду совпадает с номером строки.\n");
        while (true) {
            System.out.print("Введите число: ");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                scanner.nextLine();
                if (x < 0) {
                    System.out.println("Ошибка! Число отрицательное.");
                    continue;
                }
                result();
                System.out.println();
                return x;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
        }
    }
    */
    // FIXTO: исправлено имя на Input8C
    public int Input8C() {
        System.out.println(
                "Задача: Необходимо реализовать метод таким образом, чтобы он выводил на экран\n"
                        + "треугольник из символов '*' у которого х символов в высоту, а количество\n"
                        + "символов в ряду совпадает с номером строки.\n");
        while (true) {
            System.out.print("Введите число: ");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                scanner.nextLine();
                if (x < 0) {
                    System.out.println("Ошибка! Число отрицательное.");
                    continue;
                }
                Result();
                System.out.println();
                return x;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
        }
    }

    // FIXME: метод leftTriangle() - нарушает п.7 "методы пишутся в PascalCase" (должно быть LeftTriangle)
    /*
    public void leftTriangle(int x) {
        char x1 = '*';
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x1);
            }
            System.out.println();
        }
    }
    */
    // FIXTO: исправлено имя на LeftTriangle
    public void LeftTriangle(int x) {
        char x1 = '*';
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(x1);
            }
            System.out.println();
        }
    }

    // FIXME: метод guessGame() - нарушает п.7 "методы пишутся в PascalCase" (должно быть GuessGame), нарушен пробел после if
    /*
    public void guessGame() {
        System.out.println(
            "Задача: Необходимо реализовать метод таким образом, чтобы он генерировал\n"
                + "случайное число от 0 до 9, далее считывал с консоли введенное пользователем\n"
                + "число и выводил, угадал ли пользователь то, что было загадано, или нет. Метод\n"
                + "запускается до тех пор, пока пользователь не угадает число. После этого\n"
                + "выведите на экран количество попыток, которое потребовалось пользователю,\n"
                + "чтобы угадать число.");
        Random random = new Random();
        int i = 0;
        int pc = random.nextInt(10);
        while (true) {
            System.out.print("Введите число от 0 до 9: ");
            i++;
            if(scanner.hasNextInt()) {
                int user = scanner.nextInt();
                if(user < 0 || user > 10) {
                    System.out.println("Ошибка! Число должно быть от 0 до 9!");
                    continue;
                }
                if (pc == user) {
                    System.out.println("Вы выиграли! \nВы отгадали число за " + i + " попыток!");
                    break;
                } else {
                    System.out.println("Вы не угадали! ");
                    continue;
                }
            }
            else {
                String input = scanner.next();
                System.out.println(input + " - это не число!");
            }
        }
    }
    */
    // FIXTO: исправлено имя на GuessGame и пробелы после if
    public void GuessGame() {
        System.out.println(
                "Задача: Необходимо реализовать метод таким образом, чтобы он генерировал\n"
                        + "случайное число от 0 до 9, далее считывал с консоли введенное пользователем\n"
                        + "число и выводил, угадал ли пользователь то, что было загадано, или нет. Метод\n"
                        + "запускается до тех пор, пока пользователь не угадает число. После этого\n"
                        + "выведите на экран количество попыток, которое потребовалось пользователю,\n"
                        + "чтобы угадать число.");
        Random random = new Random();
        int i = 0;
        int pc = random.nextInt(10);
        while (true) {
            System.out.print("Введите число от 0 до 9: ");
            i++;
            if (scanner.hasNextInt()) {
                int user = scanner.nextInt();
                if (user < 0 || user > 10) {
                    System.out.println("Ошибка! Число должно быть от 0 до 9!");
                    continue;
                }
                if (pc == user) {
                    System.out.println("Вы выиграли! \nВы отгадали число за " + i + " попыток!");
                    break;
                } else {
                    System.out.println("Вы не угадали! ");
                    continue;
                }
            } else {
                String input = scanner.next();
                System.out.println(input + " - это не число!");
            }
        }
    }

    // ======== МАССИВЫ ==========

    // FIXME: метод input2arr1() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input2Arr1)
    /*
    public int input2arr1() {
        while (true) {
            System.out.println();
            System.out.print("Введите число, которое хотите найти в массиве: ");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                scanner.nextLine();
                System.out.println();
                return x;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
        }
    }
    */
    // FIXTO: исправлено имя на Input2Arr1
    public int Input2Arr1() {
        while (true) {
            System.out.println();
            System.out.print("Введите число, которое хотите найти в массиве: ");
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();
                scanner.nextLine();
                System.out.println();
                return x;
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
        }
    }

    // FIXME: метод helpinput() - нарушает п.7 "методы пишутся в PascalCase" (должно быть HelpInput)
    /*
    public int[] helpinput() {
        System.out.print("Введите длину массива: ");
        int n = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                scanner.nextLine();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Ошибка! Длина массива должна быть положительным числом.");
                }
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
            System.out.print("Введите длину массива: ");
        }
        int[] x = new int[n];
        for (int i = 0; i < x.length; i++) {
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
        }
        return x;
    }
    */
    // FIXTO: исправлено имя на HelpInput
    public int[] HelpInput() {
        System.out.print("Введите длину массива: ");
        int n = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                scanner.nextLine();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Ошибка! Длина массива должна быть положительным числом.");
                }
            } else {
                String invalidInput = scanner.next();
                System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
            }
            System.out.print("Введите длину массива: ");
        }
        int[] x = new int[n];
        for (int i = 0; i < x.length; i++) {
            while (true) {
                System.out.print("Введите " + (i + 1) + " число: ");
                if (scanner.hasNextInt()) {
                    x[i] = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    String invalidInput = scanner.next();
                    System.out.println("Ошибка! '" + invalidInput + "' - это не число. Введите только цифры.");
                }
            }
        }
        return x;
    }

    // FIXME: метод input2arr() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input2Arr)
    /*
    public int[] input2arr() {
        System.out.println("Задача: Необходимо реализовать метод таким образом, чтобы он возвращал индекс\n" +
            "последнего вхождения числа x в массив arr. Если число не входит в массив –\n" +
            "возвращается -1");
        return helpinput();
    }
    */
    // FIXTO: исправлено имя на Input2Arr
    public int[] Input2Arr() {
        System.out.println("Задача: Необходимо реализовать метод таким образом, чтобы он возвращал индекс\n" +
                "последнего вхождения числа x в массив arr. Если число не входит в массив –\n" +
                "возвращается -1");
        return HelpInput();
    }

    // FIXME: метод findLast() - нарушает п.7 "методы пишутся в PascalCase" (должно быть FindLast)
    /*
    public int findLast(int[] arr, int x) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                j = i;
            }
        }
        result();
        return j;
    }
    */
    // FIXTO: исправлено имя на FindLast
    public int FindLast(int[] arr, int x) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                j = i;
            }
        }
        Result();
        return j;
    }

    // FIXME: метод input4arr() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Input4Arr)
    /*
    public int[] input4arr() {
        return helpinput();
    }
    */
    // FIXTO: исправлено имя на Input4Arr
    public int[] Input4Arr() {
        return HelpInput();
    }

    // FIXME: метод add() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Add)
    /*
    public int[] add(int[] arr, int x, int pos) {
        if (pos < 0 || pos > arr.length) {
            System.out.println("Некорректная позиция: " + pos);
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        outarr(newArr);
        return newArr;
    }
    */
    // FIXTO: исправлено имя на Add
    public int[] Add(int[] arr, int x, int pos) {
        if (pos < 0 || pos > arr.length) {
            System.out.println("Некорректная позиция: " + pos);
            return arr;
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        OutArr(newArr);
        return newArr;
    }

    // FIXME: метод reverse() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Reverse)
    /*
    public void reverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    */
    // FIXTO: исправлено имя на Reverse
    public void Reverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    // FIXME: метод concat() - нарушает п.7 "методы пишутся в PascalCase" (должно быть Concat)
    /*
    public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        System.out.print("\nОбьединненый массив: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        return result;
    }
    */
    // FIXTO: исправлено имя на Concat
    public int[] Concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        System.out.print("\nОбьединненый массив: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        return result;
    }

    // FIXME: метод deleteNegative() - нарушает п.7 "методы пишутся в PascalCase" (должно быть DeleteNegative)
    /*
    public int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                result[index] = num;
                index++;
            }
        }
        System.out.print("\nРезультат: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        return result;
    }
    */
    // FIXTO: исправлено имя на DeleteNegative
    public int[] DeleteNegative(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                result[index] = num;
                index++;
            }
        }
        System.out.print("\nРезультат: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        return result;
    }
}