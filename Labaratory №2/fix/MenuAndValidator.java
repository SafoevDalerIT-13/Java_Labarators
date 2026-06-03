package fix;

/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию (п.1)
2. Все методы переименованы в PascalCase (п.7):
   - menu() → Menu()
   - manualInputMenu() → ManualInputMenu()
   - autoInputMenu() → AutoInputMenu()
   - executeAutoTask1-6() → ExecuteAutoTask1-6()
   - executeInputTask1-6() → ExecuteInputTask1-6()
   - inputName() → InputName()
   - inputLastname() → InputLastName()
   - inputSurname() → InputPatronymic()
   - inputHeight() → InputHeight()
   - inputDepartment() → InputDepartment()
3. Удалён закомментированный код (п.17)
4. Поле scanner переименовано в SCANNER как константа (п.20)
5. Убраны излишние комментарии (п.21)
6. Методы ручного ввода упрощены (убрано дублирование)
*/

import java.util.List;
import java.util.Scanner;

public class MenuAndValidator {
    private static final Scanner SCANNER = new Scanner(System.in);

    public void Menu() {
        while (true) {
            System.out.println("\nЗдравствуйте, это Лабораторная работа №2!");
            System.out.println("Выберите способ ввода данных:");
            System.out.println("1. Ручной ввод");
            System.out.println("2. Автоматический ввод (готовые данные)");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");

            if (SCANNER.hasNextInt()) {
                int inputMethod = SCANNER.nextInt();
                SCANNER.nextLine();

                switch (inputMethod) {
                    case 1:
                        ManualInputMenu();
                        return;
                    case 2:
                        AutoInputMenu();
                        return;
                    case 0:
                        System.out.println("Выход из программы...");
                        System.exit(0);
                    default:
                        System.out.println("Неверный выбор способа ввода!");
                        break;
                }
            } else {
                SCANNER.next();
                System.out.println("Неверно! Введите число от 0 до 3");
            }
        }
    }

    private void ManualInputMenu() {
        while (true) {
            System.out.println("\n=== РУЧНОЙ ВВОД ===");
            System.out.println("Выберите задание (вы будете вводить данные):");
            System.out.println("1. Категория №1 - Задача 3");
            System.out.println("2. Категория №1 - Задача 2");
            System.out.println("3. Категория №2 - Задача 4");
            System.out.println("4. Категория №3 - Задача 4");
            System.out.println("5. Категория №4 - Задача 5");
            System.out.println("6. Категория №5 - Задача 1");
            System.out.println("0. Назад к выбору способа ввода");
            System.out.print("Ваш выбор задания: ");

            if (SCANNER.hasNextInt()) {
                int choice = SCANNER.nextInt();
                SCANNER.nextLine();

                switch (choice) {
                    case 1:
                        ExecuteInputTask1();
                        break;
                    case 2:
                        ExecuteInputTask2();
                        break;
                    case 3:
                        ExecuteInputTask3();
                        break;
                    case 4:
                        ExecuteInputTask4();
                        break;
                    case 5:
                        ExecuteInputTask5();
                        break;
                    case 6:
                        ExecuteInputTask6();
                        break;
                    case 0:
                        Menu();
                        return;
                    default:
                        System.out.println("Неверный номер задания!");
                        break;
                }
            } else {
                SCANNER.next();
                System.out.println("Неверно! Введите число от 0 до 6");
            }
        }
    }

    private void AutoInputMenu() {
        while (true) {
            System.out.println("\n=== АВТОМАТИЧЕСКИЙ ВВОД ===");
            System.out.println("Выберите задание (будут использованы готовые данные):");
            System.out.println("1. Категория №1 - Задача 3");
            System.out.println("2. Категория №1 - Задача 2");
            System.out.println("3. Категория №2 - Задача 4");
            System.out.println("4. Категория №3 - Задача 4");
            System.out.println("5. Категория №4 - Задача 5");
            System.out.println("6. Категория №5 - Задача 1");
            System.out.println("0. Назад к выбору способа ввода");
            System.out.print("Ваш выбор задания: ");

            if (SCANNER.hasNextInt()) {
                int choice = SCANNER.nextInt();
                SCANNER.nextLine();

                switch (choice) {
                    case 1:
                        ExecuteAutoTask1();
                        break;
                    case 2:
                        ExecuteAutoTask2();
                        break;
                    case 3:
                        ExecuteAutoTask3();
                        break;
                    case 4:
                        ExecuteAutoTask4();
                        break;
                    case 5:
                        ExecuteAutoTask5();
                        break;
                    case 6:
                        ExecuteAutoTask6();
                        break;
                    case 0:
                        Menu();
                        return;
                    default:
                        System.out.println("Неверный номер задания!");
                        break;
                }
            } else {
                SCANNER.next();
                System.out.println("Неверно! Введите число от 0 до 6");
            }
        }
    }

    private void ExecuteAutoTask1() {
        System.out.println("Категория №1: Задача 3");
        System.out.println("Имена.\n" +
                "Создайте сущность Имя...");
        Name cleopatra = new Name("Клеопатра");
        Name pushkin = new Name("Пушкин", "Александр", "Сергеевич");
        Name mayakovskiy = new Name("Маяковский", "Владимир");

        System.out.println(cleopatra);
        System.out.println(pushkin);
        System.out.println(mayakovskiy);
    }

    private void ExecuteAutoTask2() {
        System.out.println("Категория №1: Задача 2");
        System.out.println("Человек.\n" +
                "Создайте сущность Человек...");
        Person cleopatra = new Person("Клеопатра", 152);
        Person pushkin = new Person("Пушкин", 167);
        Person mayakovskiy = new Person("Владимир", 189);

        System.out.println(cleopatra);
        System.out.println(pushkin);
        System.out.println(mayakovskiy);
    }

    private void ExecuteAutoTask3() {
        System.out.println("Категория №2: Задача 4");
        System.out.println("Сотрудники и отделы.\n" +
                "Создайте сущность Сотрудник...");
        Department it = new Department("IT");
        Employee petrov = new Employee("Петров", it);
        Employee kozlov = new Employee("Козлов", it);
        Employee sidorov = new Employee("Сидоров", it);

        it.setManager(kozlov);

        System.out.println(petrov);
        System.out.println(kozlov);
        System.out.println(sidorov);
    }

    private void ExecuteAutoTask4() {
        Department it = new Department("IT");
        Employee petrov = new Employee("Петров", it);
        Employee kozlov = new Employee("Козлов", it);
        Employee sidorov = new Employee("Сидоров", it);

        System.out.println("Категория №3: Задача 4");
        System.out.println("Сотрудники и отделы.\n" +
                "Измените решение, полученное в задаче 2.4...");

        System.out.println("Список сотрудников IT отдела (через Петрова):");
        for (Employee emp : petrov.getAllDepartmentEmployees()) {
            System.out.println("- " + emp.getName());
        }

        System.out.println("\nСписок сотрудников IT отдела (через Козлова):");
        for (Employee emp : kozlov.getAllDepartmentEmployees()) {
            System.out.println("- " + emp.getName());
        }

        System.out.println("\nСписок сотрудников IT отдела (через Сидорова):");
        for (Employee emp : sidorov.getAllDepartmentEmployees()) {
            System.out.println("- " + emp.getName());
        }
    }

    private void ExecuteAutoTask5() {
        System.out.println("Категория №4: Задача 5");
        System.out.println("Создаем Имена.\n" +
                "Измените сущность Имя из задачи 1.3...");
        Name cleopatra = new Name("Клеопатра");
        Name pushkin = new Name("Пушкин", "Александр", "Сергеевич");
        Name mayakovskiy = new Name("Маяковский", "Владимир");
        Name hristofor = new Name("Бонифатьевич", "Христофор");

        System.out.println(cleopatra.toStringAlternative());
        System.out.println(pushkin.toStringAlternative());
        System.out.println(mayakovskiy.toStringAlternative());
        System.out.println(hristofor.toStringAlternative());
    }

    private void ExecuteAutoTask6() {
        System.out.println("Категория №5: Задача 1");
        System.out.println("Пистолет стреляет.\n" +
                "Создайте сущность Пистолет...");
        Gun gun = new Gun(3);
        for (int i = 0; i < 5; i++) {
            gun.fire();
        }
    }

    private void ExecuteInputTask1() {
        System.out.println("Категория №1: Задача 3");
        while (true) {
            System.out.println("\nКакие входные параметры вы хотите ввести?");
            System.out.println("1. Только имя");
            System.out.println("2. Фамилию, имя и отчество");
            System.out.println("3. Фамилию и имя");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");

            if (SCANNER.hasNextInt()) {
                int choice = SCANNER.nextInt();
                SCANNER.nextLine();

                switch (choice) {
                    case 1:
                        String firstName = InputName();
                        Name name1 = new Name(firstName);
                        System.out.println("Создано: " + name1);
                        break;
                    case 2:
                        String lastName = InputLastName();
                        String firstName2 = InputName();
                        String patronymic = InputPatronymic();
                        Name name2 = new Name(lastName, firstName2, patronymic);
                        System.out.println("Создано: " + name2);
                        break;
                    case 3:
                        String lastName3 = InputLastName();
                        String firstName3 = InputName();
                        Name name3 = new Name(lastName3, firstName3);
                        System.out.println("Создано: " + name3);
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Неверный выбор!");
                        break;
                }
            } else {
                SCANNER.next();
                System.out.println("Ошибка! Введите число от 0 до 3");
            }
        }
    }

    private void ExecuteInputTask2() {
        System.out.println("Категория №1: Задача 2");
        String name = InputName();
        int height = (int) InputHeight();
        Person person = new Person(name, height);
        System.out.println("Создано: " + person);
    }

    private void ExecuteInputTask3() {
        System.out.println("Категория №2: Задача 4");
        System.out.println("Для начала введем департамент!");
        String deptName = InputDepartment();
        Department department = new Department(deptName);

        System.out.println("Теперь введите первого сотрудника!");
        String name1 = InputName();
        Employee emp1 = new Employee(name1, department);

        System.out.println("Затем введите второго сотрудника!");
        String name2 = InputName();
        Employee emp2 = new Employee(name2, department);

        System.out.println("И введите третьего сотрудника!");
        String name3 = InputName();
        Employee emp3 = new Employee(name3, department);

        System.out.println("Какого сотрудника вы хотите сделать управляющим отделом " + deptName + "?");
        System.out.println("1. " + name1);
        System.out.println("2. " + name2);
        System.out.println("3. " + name3);
        System.out.print("Ваш выбор: ");

        if (SCANNER.hasNextInt()) {
            int choice = SCANNER.nextInt();
            SCANNER.nextLine();
            switch (choice) {
                case 1:
                    department.setManager(emp1);
                    break;
                case 2:
                    department.setManager(emp2);
                    break;
                case 3:
                    department.setManager(emp3);
                    break;
                default:
                    System.out.println("Некорректный выбор!");
                    break;
            }
        }

        System.out.println("\nРезультат:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }

    private void ExecuteInputTask4() {
        System.out.println("Категория №3: Задача 4");
        System.out.println("Для начала введем департамент!");
        String deptName = InputDepartment();
        Department department = new Department(deptName);

        System.out.println("Теперь введите первого сотрудника!");
        String name1 = InputName();
        Employee emp1 = new Employee(name1, department);

        System.out.println("Затем введите второго сотрудника!");
        String name2 = InputName();
        Employee emp2 = new Employee(name2, department);

        System.out.println("И введите третьего сотрудника!");
        String name3 = InputName();
        Employee emp3 = new Employee(name3, department);

        System.out.println("Какого сотрудника вы хотите сделать управляющим отделом " + deptName + "?");
        System.out.println("1. " + name1);
        System.out.println("2. " + name2);
        System.out.println("3. " + name3);
        System.out.print("Ваш выбор: ");

        if (SCANNER.hasNextInt()) {
            int choice = SCANNER.nextInt();
            SCANNER.nextLine();
            switch (choice) {
                case 1:
                    department.setManager(emp1);
                    break;
                case 2:
                    department.setManager(emp2);
                    break;
                case 3:
                    department.setManager(emp3);
                    break;
                default:
                    System.out.println("Некорректный выбор!");
                    break;
            }
        }

        System.out.println("\nЧерез какого сотрудника вы хотите получить всех сотрудников?");
        System.out.println("1. " + name1);
        System.out.println("2. " + name2);
        System.out.println("3. " + name3);
        System.out.print("Ваш выбор: ");

        if (SCANNER.hasNextInt()) {
            int choice = SCANNER.nextInt();
            SCANNER.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Список сотрудников отдела (через " + name1 + "):");
                    for (Employee emp : emp1.getAllDepartmentEmployees()) {
                        System.out.println("- " + emp.getName());
                    }
                    break;
                case 2:
                    System.out.println("Список сотрудников отдела (через " + name2 + "):");
                    for (Employee emp : emp2.getAllDepartmentEmployees()) {
                        System.out.println("- " + emp.getName());
                    }
                    break;
                case 3:
                    System.out.println("Список сотрудников отдела (через " + name3 + "):");
                    for (Employee emp : emp3.getAllDepartmentEmployees()) {
                        System.out.println("- " + emp.getName());
                    }
                    break;
                default:
                    System.out.println("Некорректный выбор!");
                    break;
            }
        }
    }

    private void ExecuteInputTask5() {
        System.out.println("Категория №4: Задача 5");
        while (true) {
            System.out.println("\nКакие входные параметры вы хотите ввести?");
            System.out.println("1. Только имя");
            System.out.println("2. Фамилию, имя и отчество");
            System.out.println("3. Фамилию и имя");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");

            if (SCANNER.hasNextInt()) {
                int choice = SCANNER.nextInt();
                SCANNER.nextLine();

                switch (choice) {
                    case 1:
                        String firstName = InputName();
                        Name name1 = new Name(firstName);
                        System.out.println("Создано: " + name1.toStringAlternative());
                        break;
                    case 2:
                        String lastName = InputLastName();
                        String firstName2 = InputName();
                        String patronymic = InputPatronymic();
                        Name name2 = new Name(lastName, firstName2, patronymic);
                        System.out.println("Создано: " + name2.toStringAlternative());
                        break;
                    case 3:
                        String lastName3 = InputLastName();
                        String firstName3 = InputName();
                        Name name3 = new Name(lastName3, firstName3);
                        System.out.println("Создано: " + name3.toStringAlternative());
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Неверный выбор!");
                        break;
                }
            } else {
                SCANNER.next();
                System.out.println("Ошибка! Введите число от 0 до 3");
            }
        }
    }

    private void ExecuteInputTask6() {
        System.out.println("Категория №5: Задача 1");
        Gun gun = null;

        System.out.println("Выберите тип создания пистолета:");
        System.out.println("1 - С указанием количества патронов");
        System.out.println("2 - По умолчанию (5 патронов)");
        System.out.print("Ваш выбор: ");

        int creationChoice = SCANNER.nextInt();
        SCANNER.nextLine();

        if (creationChoice == 1) {
            System.out.print("Введите количество патронов: ");
            int cartridges = SCANNER.nextInt();
            SCANNER.nextLine();
            gun = new Gun(cartridges);
        } else if (creationChoice == 2) {
            gun = new Gun();
        } else {
            System.out.println("Неверный выбор! Создан пистолет по умолчанию.");
            gun = new Gun();
        }

        System.out.println(gun.toString());

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1 - Выстрелить");
            System.out.println("2 - Проверить патроны");
            System.out.println("3 - Перезарядить");
            System.out.println("0 - Завершить");
            System.out.print("Ваш выбор: ");

            int action = SCANNER.nextInt();
            SCANNER.nextLine();

            switch (action) {
                case 1:
                    gun.fire();
                    break;
                case 2:
                    System.out.println("Осталось патронов: " + gun.getNumberOfCartridges());
                    break;
                case 3:
                    System.out.print("Введите новое количество патронов: ");
                    int newCartridges = SCANNER.nextInt();
                    SCANNER.nextLine();
                    gun.setNumberOfCartridges(newCartridges);
                    System.out.println("Перезаряжено! Патронов: " + gun.getNumberOfCartridges());
                    break;
                case 0:
                    System.out.println("Завершение работы с пистолетом.");
                    return;
                default:
                    System.out.println("Неверный выбор!");
            }
        }
    }

    private String InputName() {
        while (true) {
            System.out.print("Введите имя: ");
            String input = SCANNER.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Имя не может быть пустым");
                continue;
            }

            input = input.trim();

            if (!input.matches("[a-zA-Zа-яА-Я]+")) {
                System.out.println("Имя должно содержать только буквы!");
                continue;
            }
            return input;
        }
    }

    private String InputLastName() {
        while (true) {
            System.out.print("Введите фамилию: ");
            String input = SCANNER.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Фамилия не может быть пустой!");
                continue;
            }

            input = input.trim();

            if (!input.matches("[a-zA-Zа-яА-Я]+")) {
                System.out.println("Фамилия должна содержать только буквы!");
                continue;
            }

            return input;
        }
    }

    private String InputPatronymic() {
        while (true) {
            System.out.print("Введите отчество: ");
            String input = SCANNER.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Отчество не может быть пустым!");
                continue;
            }

            input = input.trim();

            if (!input.matches("[a-zA-Zа-яА-Я]+")) {
                System.out.println("Отчество должно содержать только буквы!");
                continue;
            }

            return input;
        }
    }

    private double InputHeight() {
        while (true) {
            System.out.print("Введите рост (в см): ");

            if (SCANNER.hasNextDouble()) {
                double height = SCANNER.nextDouble();
                SCANNER.nextLine();

                if (height <= 0) {
                    System.out.println("Рост должен быть положительным числом!");
                    continue;
                }

                return height;
            } else {
                SCANNER.next();
                System.out.println("Ошибка! Введите числовое значение для роста.");
            }
        }
    }

    private String InputDepartment() {
        while (true) {
            System.out.print("Введите наименование департамента: ");
            String input = SCANNER.nextLine();

            if (input.trim().isEmpty()) {
                System.out.println("Наименование не может быть пустым");
                continue;
            }

            input = input.trim();

            if (!input.matches("[a-zA-Zа-яА-Я]+")) {
                System.out.println("Наименование должно содержать только буквы!");
                continue;
            }
            return input;
        }
    }
}
