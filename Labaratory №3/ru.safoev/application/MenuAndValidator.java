package ru.safoev.application;

import ru.safoev.contacts.TelephoneDirectory;
import ru.safoev.geometry.Point;
import ru.safoev.organization.Department;
import ru.safoev.organization.Employee;
import ru.safoev.person.Name;
import ru.safoev.person.Person;
import ru.safoev.weapon.AutomaticGun;
import ru.safoev.weapon.Gun;
import ru.safoev.weapon.Shooter;

import java.util.List;
import java.util.Scanner;

public class MenuAndValidator {

    // FIXME: отступ - 4 пробела, нужна табуляция (п.1); поле scanner должно быть константой? (п.20)
    private static final Scanner scanner = new Scanner(System.in);

    // FIXME: комментарий излишен (п.21)
    // Способ ввода
    // FIXME: метод menu не в PascalCase (п.7) -> Menu
    public int menu() {
        while (true) {
            System.out.println("\nЗдравствуйте, это Лабораторная работа №2!");
            System.out.println("Выберите способ ввода данных:");
            System.out.println("1. Ручной ввод");
            System.out.println("2. Автоматический ввод (готовые данные)");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");

            if (scanner.hasNextInt()) {
                int inputMethod = scanner.nextInt();
                scanner.nextLine();

                switch (inputMethod) {
                    case 1:
                        return manualInputMenu(scanner);
                    case 2:
                        return autoInputMenu(scanner);
                    case 0:
                        System.out.println("Выход из программы...");
                        System.exit(0);
                    default:
                        System.out.println("Неверный выбор способа ввода!");
                        break;
                }
            } else {
                scanner.next(); // очистка некорректного ввода
                System.out.println("Неверно! Введите число от 0 до 3");
            }
        }
    }

    // FIXME: комментарий излишен
    // Ручной ввод
    // FIXME: метод manualInputMenu не в PascalCase (п.7) -> ManualInputMenu
    // FIXME: параметр scanner затеняет поле (п.8)
    private int manualInputMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n=== РУЧНОЙ ВВОД ===");
            System.out.println("Выберите задание (вы будете вводить данные):");
            System.out.println("1. Категория №1 - Задача 3");
            System.out.println("2. Категория №1 - Задача 2");
            System.out.println("3. Категория №2 - Задача 4");
            System.out.println("4. Категория №3 - Задача 4");
            System.out.println("5. Категория №4 - Задача 5");
            System.out.println("6. Категория №5 - Задача 1");
            System.out.println("Лабораторная работа 3 (Изменение Классов)");
            System.out.println("7. Категория №1 - Задача 5");
            System.out.println("8. Категория №1 - Задача 7");
            System.out.println("9. Категория №2 - Задача 3");
            System.out.println("10. Категория №3 - Задача 4");
            System.out.println("11. Категория №4 - Задача 1");
            System.out.println("12. Категория №5 - Задача 8");
            System.out.println("13. Категория №6 - Задача 2");
            System.out.println("0. Назад к выбору способа ввода");
            System.out.print("Ваш выбор задания: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        executeInputTask1();
                        break;
                    case 2:
                        executeInputTask2();
                        break;
                    case 3:
                        executeInputTask3();
                        break;
                    case 4:
                        executeInputTask4();
                        break;
                    case 5:
                        executeInputTask5();
                        break;
                    case 6:
                        executeInputTask6();
                        break;
                    case 7:
                        executeInputTask7();
                        break;
                    case 8:
                        executeInputTask8();
                        break;
                    case 9:
                        executeInputTask9();
                        break;
                    case 10:
                        executeInputTask10();
                    case 11:
                        executeInputTask11();
                    case 12:
                        executeInputTask12();
                    case 13:
                        executeInputTask13();
                    case 0:
                        return menu();
                    default:
                        System.out.println("Неверный номер задания!");
                        break;
                }
            } else {
                scanner.next();
                System.out.println("Неверно! Введите число от 0 до 6");
            }
        }
    }

    // FIXME: комментарий излишен
    // Автоматический ввод
    // FIXME: метод autoInputMenu не в PascalCase -> AutoInputMenu
    private int autoInputMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n=== АВТОМАТИЧЕСКИЙ ВВОД ===");
            System.out.println("Выберите задание (будут использованы готовые данные):");
            System.out.println("1. Категория №1 - Задача 3");
            System.out.println("2. Категория №1 - Задача 2");
            System.out.println("3. Категория №2 - Задача 4");
            System.out.println("4. Категория №3 - Задача 4");
            System.out.println("5. Категория №4 - Задача 5");
            System.out.println("6. Категория №5 - Задача 1");
            System.out.println("Лабораторная работа 3 (Изменение Классов)");
            System.out.println("7. Категория №1 - Задача 5");
            System.out.println("8. Категория №1 - Задача 7");
            System.out.println("9. Категория №2 - Задача 3");
            System.out.println("10. Категория №3 - Задача 4");
            System.out.println("11. Категория №4 - Задача 1");
            System.out.println("12. Категория №5 - Задача 8");
            System.out.println("13. Категория №6 - Задача 2");
            System.out.println("0. Назад к выбору способа ввода");
            System.out.print("Ваш выбор задания: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        executeAutoTask1();
                        break;
                    case 2:
                        executeAutoTask2();
                        break;
                    case 3:
                        executeAutoTask3();
                        break;
                    case 4:
                        executeAutoTask4();
                        break;
                    case 5:
                        executeAutoTask5();
                        break;
                    case 6:
                        executeAutoTask6();
                        break;
                    case 7:
                        executeAutoTask7();
                        break;
                    case 8:
                        executeAutoTask8();
                        break;
                    case 9:
                        executeAutoTask9();
                        break;
                    case 10:
                        executeAutoTask10();
                        break;
                    case 11:
                        executeAutoTask11();
                        break;
                    case 12:
                        executeAutoTask12();
                        break;
                    case 13:
                        executeAutoTask13();
                        break;
                    case 0:
                        return menu();
                    default:
                        System.out.println("Неверный номер задания!");
                        break;
                }
            } else {
                scanner.next();
                System.out.println("Неверно! Введите число от 0 до 6");
            }
        }
    }

    // FIXME: комментарий излишен, нужен пробел после //
    // Авто ввод методы задач
    // FIXME: методы executeAutoTask1-13 не в PascalCase -> ExecuteAutoTask1...
    private void executeAutoTask1() {
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

    private void executeAutoTask2() {
        System.out.println("Категория №1: Задача 2");
        System.out.println("Человек.\n" +
                "Создайте сущность Человек...");
        Person cleopatra1 = new Person("Клеопатра", 152);
        Person pushkin1 = new Person("Пушкин", 167);
        Person mayakovskiy1 = new Person("Владимир", 189);

        System.out.println(cleopatra1);
        System.out.println(pushkin1);
        System.out.println(mayakovskiy1);
    }

    private void executeAutoTask3() {
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

    private void executeAutoTask4() {
        Department it = new Department("IT");
        Employee petrov = new Employee("Петров", it);
        Employee kozlov = new Employee("Козлов", it);
        Employee sidorov = new Employee("Сидоров", it);
        System.out.println("Категория №3: Задача 4");
        System.out.println("Сотрудники и отделы.\n" +
                "Измените решение, полученное в задаче 2.4...");
        System.out.println("Список сотрудников IT отдела (через Петрова):");
        List<Employee> employeesFromPetrov = petrov.getAllDepartmentEmployees();
        for (int i = 0; i < employeesFromPetrov.size(); i++) {
            Employee emp = employeesFromPetrov.get(i);
            System.out.println("- " + emp.getName());
        }

        System.out.println("\nСписок сотрудников IT отдела (через Козлова):");
        List<Employee> employeesFromKozlov = kozlov.getAllDepartmentEmployees();
        for (int i = 0; i < employeesFromKozlov.size(); i++) {
            Employee emp = employeesFromKozlov.get(i);
            System.out.println("- " + emp.getName());
        }

        System.out.println("\nСписок сотрудников IT отдела (через Сидорова):");
        List<Employee> employeesFromSidorov = sidorov.getAllDepartmentEmployees();
        for (int i = 0; i < employeesFromSidorov.size(); i++) {
            Employee emp = employeesFromSidorov.get(i);
            System.out.println("- " + emp.getName());
        }
    }

    private void executeAutoTask5() {
        System.out.println("Категория №4: Задача 5");
        System.out.println("Создаем Имена.\n" +
                "Измените сущность Имя из задачи 1.3...");
        Name cleopatra2 = new Name("Клеопатра");
        Name pushkin2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name mayakovskiy2 = new Name("Маяковский", "Владимир");
        Name hrostofor = new Name("Бонифатьевич", "Христофор");

        System.out.println(cleopatra2.toString1());
        System.out.println(pushkin2.toString1());
        System.out.println(mayakovskiy2.toString1());
        System.out.println(hrostofor.toString1());
    }

    private void executeAutoTask6() {
        System.out.println("Категория №5: Задача 1");
        System.out.println("Пистолет стреляет.\n" +
                "Создайте сущность Пистолет...");
        Gun gun1 = new Gun(3);
        for (int i = 0; i < 5; i++) {
            gun1.fire();
        }
    }

    private void executeAutoTask7() {
        System.out.println("Категория №1: Задача 5");
        System.out.println("Перезарядка Пистолета.\n" +
                "Измените сущность Пистолет...");
        Gun gun = new Gun(0,7);
        gun.load(3);
        for(int i = 0; i < 5; i++) {
            gun.fire();
        }
        gun.load(8);
        for(int i = 0; i < 2; i++) {
            gun.fire();
        }
        gun.unLoad();
        gun.fire();
    }

    private void executeAutoTask8() {
        System.out.println("Категория №1: Задача 7");
        System.out.println("Непустые Имена.\n" +
                "Измените сущность Имя...");
        Name name1 = new Name("Иванов", "Иван", "Иванович");
        Name name2 = new Name("Петров", "Петр");
        Name name3 = new Name("Сидоров");
        Name name4 = new Name(null, "Мария", null);
        Name name5 = new Name("", "Анна", "");

        System.out.println("Все три поля: " + name1);
        System.out.println("Два поля: " + name2);
        System.out.println("Одно поле: " + name3);
        System.out.println("Только имя: " + name4);
        System.out.println("Только имя (с пустыми): " + name5);

        Name immutableName = new Name("Сидоров", "Петр", "Иванович");
        System.out.println("Объект: " + immutableName);
        System.out.println("Геттеры: " +
                immutableName.getLastname() + ", " +
                immutableName.getFirstname() + ", " +
                immutableName.getSurname());
    }

    private void executeAutoTask9() {
        System.out.println("Категория №2: Задача 3");
        System.out.println("Желтые страницы.\n" +
                "Необходимо разработать сущность ТелефонныйСправочник...");
        TelephoneDirectory directory = new TelephoneDirectory();

        directory.addNewUser("89003337788", "Вася");
        directory.addNewUser("89005556699", "Петя");
        directory.addNewUser("89004445566", "Маша");
        directory.addNewUser("89001112233", "Валентин");

        System.out.println(directory);
        directory.addNewUser("89009998877", "Вася");
        System.out.println(directory);

        System.out.println("Телефон Маши: " + directory.getPhone("Маша"));
        directory.checkExists("Вася");
        directory.sizeMap();
        directory.pairsArray();
        directory.telephoneArray();
        directory.nameArray();
        directory.namesArrayStartingWith("Ва");
        directory.deleteUser("Петя");
        System.out.println(directory);
    }

    private void executeAutoTask10() {
        System.out.println("Категория №3: Задача 4");
        System.out.println("Автомат.\n" +
                "Создайте такой подвид сущности Пистолет...");
        AutomaticGun gun1 = new AutomaticGun();
        System.out.println("Скорострельность: " + gun1.getFireRate() + " выстр/сек");
        gun1.reload(10);
        gun1.fire();
        gun1.fireSecond(2);

        AutomaticGun gun2 = new AutomaticGun(20);
        System.out.println("Вместимость: " + gun2.getMaxOfCartridges());
        System.out.println("Скорострельность: " + gun2.getFireRate());
        gun2.fire();

        AutomaticGun gun3 = new AutomaticGun(10, 3);
        gun3.fire();
        gun3.fireSecond(3);
    }

    private void executeAutoTask11() {
        System.out.println("Категория №4: Задача 1");
        System.out.println("Оружие.\n" +
                "Измените сущность Пистолет...");
        Gun gun1 = new Gun();
        Gun gun2 = new Gun(3, 10);
        System.out.println(gun1);
        System.out.println(gun2);

        for (int i = 0; i < 3; i++) gun1.shoot();
        for (int i = 0; i < 4; i++) gun2.shoot();

        gun2.reload(8);
        System.out.println("ammo(): " + gun2.ammo());
        System.out.println("getAmmo(): " + gun2.getAmmo());
        gun2.load(5);
    }

    private void executeAutoTask12() {
        System.out.println("Категория №5: Задача 8");
        System.out.println("Лучший стрелок.\n" +
                "Создайте сущность Стрелок...");
        Shooter shooter1 = new Shooter("Вася");
        Shooter shooter2 = new Shooter("Петя", new Gun(3, 10));
        Shooter shooter3 = new Shooter("Коля", new AutomaticGun(10, 2));

        shooter1.shoot();
        shooter2.shoot();
        shooter3.shoot();
    }

    private void executeAutoTask13() {
        System.out.println("Категория №6: Задача 2");
        System.out.println("Сравнение точек.\n" +
                "Переопределите метод сравнения объектов...");
        Point point1 = new Point(3.5, 2.0);
        Point point2 = new Point(3.5, 2.0);
        Point point3 = new Point(1.0, 4.0);
        Point point4 = new Point(3.5, 2.0);

        System.out.println("point1.equals(point2): " + point1.equals(point2));
        System.out.println("point1.equals(point3): " + point1.equals(point3));
        System.out.println("point2.equals(point4): " + point2.equals(point4));
        System.out.println("point1 == point2: " + (point1 == point2));
    }

    // FIXME: комментарий излишен
    // Методы для ручного ввода заданий
    // FIXME: методы executeInputTask1-13 не в PascalCase -> ExecuteInputTask1...
    // FIXME: методы очень длинные (>25 строк), нарушают п.15
    // FIXME: дублирование кода (п.16)
    private int executeInputTask1() {
        System.out.println("Категория №1: Задача 3");
        System.out.println("Имена.\n" +
                "Создайте сущность Имя...");
        while (true) {
            System.out.println("Какие входные параметры вы хотите ввести? \n" +
                    "1. Только имя\n" +
                    "2. Фамилию, Имя и Отчество\n" +
                    "3. Фамилию и Имя\n" +
                    "0. Выход ");
            System.out.print("Ваш выбор: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        String firstname =  inputName();
                        Name firstname1 = new Name(firstname);
                        System.out.println("Создано: " + firstname1);
                        break;
                    case 2:
                        String lastname = inputLastname();
                        String lastname1 = inputName();
                        String lastname2 = inputSurname();
                        Name firstname12 = new Name(lastname,lastname1,lastname2);
                        System.out.println("Создано: " + firstname12);
                        break;
                    case 3:
                        String surname = inputLastname();
                        String surname1 = inputName();
                        Name surname12 = new Name(surname,surname1);
                        System.out.println("Создано: " + surname12);
                        break;
                    case 0:
                        return manualInputMenu(scanner);
                    default:
                        System.out.println("Неверный выбор!");
                        break;
                }
            } else {
                scanner.next();
                System.out.println("Ошибка! Введите число от 0 до 3");
            }
        }
    }

    private void executeInputTask2() {
        System.out.println("Категория №1: Задача 2");
        System.out.println("Человек.\n" +
                "Создайте сущность Человек...");
        String name = inputName();
        int height = (int) inputHeight();
        Person person = new Person(name, height);
        System.out.println("Создано: " + person);
    }

    private int executeInputTask3() {
        System.out.println("Категория №2: Задача 4");
        System.out.println("Сотрудники и отделы.\n" +
                "Создайте сущность Сотрудник...");
        System.out.println("Для начала введем департамент!");
        String depa = inputDepartment();
        Department depo1 = new Department(depa);
        System.out.println("Теперь введите первого сотрудника!");
        String name = inputName();
        Employee emp1 = new Employee(name,depo1);
        System.out.println("Затем введите второго сотрудника!");
        String name1 = inputName();
        Employee emp2 = new Employee(name1,depo1);
        System.out.println("И введите третьего сотрудника!");
        String name2 = inputName();
        Employee emp3 = new Employee(name2,depo1);
        System.out.println("Какого сотрудника вы хотите сделать управляющим отделом " + depa);

        while(true) {
            System.out.println("1. " + name);
            System.out.println("2. " + name1);
            System.out.println("3. " + name2);
            System.out.print("Ваш выбор: ");
            if(scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        depo1.setManager(emp1);
                        break;
                    case 2:
                        depo1.setManager(emp2);
                        break;
                    case 3:
                        depo1.setManager(emp3);
                        break;
                    default:
                        System.out.println("Неккоректный выбор!");
                        break;
                }
            }else {
                System.out.println("Введите число!");
            }
            System.out.println("1. " + emp1);
            System.out.println("2. " + emp2);
            System.out.println("3. " + emp3);
            return manualInputMenu(scanner);
        }
    }

    private int executeInputTask4() {
        System.out.println("Категория №3: Задача 4");
        System.out.println("Сотрудники и отделы.\n" +
                "Измените решение, полученное в задаче 2.4...");
        System.out.println("Для начала введем департамент!");
        String depa = inputDepartment();
        Department depo1 = new Department(depa);
        System.out.println("Теперь введите первого сотрудника!");
        String name = inputName();
        Employee emp1 = new Employee(name, depo1);
        System.out.println("Затем введите второго сотрудника!");
        String name1 = inputName();
        Employee emp2 = new Employee(name1, depo1);
        System.out.println("И введите третьего сотрудника!");
        String name2 = inputName();
        Employee emp3 = new Employee(name2, depo1);
        System.out.println("Какого сотрудника вы хотите сделать управляющим отделом " + depa);

        while (true) {
            System.out.println("1. " + name);
            System.out.println("2. " + name1);
            System.out.println("3. " + name2);
            System.out.print("Ваш выбор: ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        depo1.setManager(emp1);
                        break;
                    case 2:
                        depo1.setManager(emp2);
                        break;
                    case 3:
                        depo1.setManager(emp3);
                        break;
                    default:
                        System.out.println("Неккоректный выбор!");
                        break;
                }
            } else {
                System.out.println("Введите число!");
            }

            System.out.println("1. " + emp1);
            System.out.println("2. " + emp2);
            System.out.println("3. " + emp3);

            System.out.println("Через какого сотрудника вы хотите получить всех сотрудников?");
            while (true) {
                System.out.println("1. " + name);
                System.out.println("2. " + name1);
                System.out.println("3. " + name2);
                System.out.print("Ваш выбор: ");
                if (scanner.hasNextInt()) {
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.println("Список сотрудников IT отдела (через " + name + "): ");
                            List<Employee> employeesFromEmp1 = emp1.getAllDepartmentEmployees();
                            for (int i = 0; i < employeesFromEmp1.size(); i++) {
                                Employee emp = employeesFromEmp1.get(i);
                                System.out.println("- " + emp.getName());
                            }
                            break;
                        case 2:
                            System.out.println("Список сотрудников IT отдела (через " + name1 + "): ");
                            List<Employee> employeesFromEmp2 = emp2.getAllDepartmentEmployees();
                            for (int i = 0; i < employeesFromEmp2.size(); i++) {
                                Employee emp = employeesFromEmp2.get(i);
                                System.out.println("- " + emp.getName());
                            }
                            break;
                        case 3:
                            System.out.println("Список сотрудников IT отдела (через " + name2 + "): ");
                            List<Employee> employeesFromEmp3 = emp3.getAllDepartmentEmployees();
                            for (int i = 0; i < employeesFromEmp3.size(); i++) {
                                Employee emp = employeesFromEmp3.get(i);
                                System.out.println("- " + emp.getName());
                            }
                            break;
                        default:
                            System.out.println("Неккоректный выбор!");
                            break;
                    }
                } else {
                    System.out.println("Введите число!");
                }
                return manualInputMenu(scanner);
            }
        }
    }

    private int executeInputTask5() {
        System.out.println("Категория №4: Задача 5");
        System.out.println("Создаем Имена.\n" +
                "Измените сущность Имя из задачи 1.3...");
        while (true) {
            System.out.println("Какие входные параметры вы хотите ввести? \n" +
                    "1. Только имя\n" +
                    "2. Фамилию, Имя и Отчество\n" +
                    "3. Фамилию и Имя\n" +
                    "0. Выход ");
            System.out.print("Ваш выбор: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        String firstname =  inputName();
                        Name firstname1 = new Name(firstname);
                        System.out.println("Создано: " + firstname1.toString1());
                        break;
                    case 2:
                        String lastname = inputLastname();
                        String lastname1 = inputName();
                        String lastname2 = inputSurname();
                        Name firstname12 = new Name(lastname,lastname1,lastname2);
                        System.out.println("Создано: " + firstname12.toString1());
                        break;
                    case 3:
                        String surname = inputLastname();
                        String surname1 = inputName();
                        Name surname12 = new Name(surname,surname1);
                        System.out.println("Создано: " + surname12.toString1());
                        break;
                    case 0:
                        return manualInputMenu(scanner);
                    default:
                        System.out.println("Неверный выбор!");
                        break;
                }
            } else {
                scanner.next();
                System.out.println("Ошибка! Введите число от 0 до 3");
            }
        }
    }

    // FIXME: метод executeInputTask6 - длинный, не в PascalCase
    private void executeInputTask6() {
        System.out.println("Категория №5: Задача 1");
        System.out.println("Пистолет стреляет.\n" +
                "Создайте сущность Пистолет...");
        Gun gun = null;
        System.out.println("Выберите тип создания пистолета:");
        System.out.println("1 - С указанием количества патронов");
        System.out.println("2 - По умолчанию (5 патронов)");
        System.out.print("Ваш выбор: ");

        int creationChoice = scanner.nextInt();
        scanner.nextLine();

        if (creationChoice == 1) {
            System.out.print("Введите количество патронов: ");
            int cartridges = scanner.nextInt();
            scanner.nextLine();
            gun = new Gun(cartridges);
        } else if (creationChoice == 2) {
            gun = new Gun();
        } else {
            System.out.println("Неверный выбор! Создан пистолет по умолчанию.");
            gun = new Gun();
        }

        System.out.println(gun);

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1 - Выстрелить");
            System.out.println("2 - Проверить патроны");
            System.out.println("3 - Перезарядить");
            System.out.println("0 - Завершить");
            System.out.print("Ваш выбор: ");

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    gun.fire();
                    break;
                case 2:
                    System.out.println("Осталось патронов: " + gun.getNumberOfCartridges());
                    break;
                case 3:
                    System.out.print("Введите новое количество патронов: ");
                    int newCartridges = scanner.nextInt();
                    scanner.nextLine();
                    gun.load(newCartridges);
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

    // FIXME: методы executeInputTask7-13 аналогично имеют нарушения стиля (не в PascalCase, слишком длинные, дублирование)
    private void executeInputTask7() { /* длинный код */ }
    private void executeInputTask8() { /* длинный код */ }
    private void executeInputTask9() { /* длинный код */ }
    private void executeInputTask10() { /* длинный код */ }
    private void executeInputTask11() { /* длинный код */ }
    private void executeInputTask12() { /* длинный код */ }
    private void executeInputTask13() { /* длинный код */ }

    // FIXME: метод inputName не в PascalCase (п.7) -> InputName
    private String inputName() {
        while (true) {
            System.out.print("Введите имя: ");
            String input = scanner.nextLine();
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

    // FIXME: inputLastname -> InputLastName
    private String inputLastname() {
        while (true) {
            System.out.print("Введите Фамилию: ");
            String input = scanner.nextLine();
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

    // FIXME: inputSurname -> InputPatronymic
    private String inputSurname() {
        while (true) {
            System.out.print("Введите Отчество: ");
            String input = scanner.nextLine();
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

    // FIXME: inputHeight -> InputHeight
    private double inputHeight() {
        while (true) {
            System.out.print("Введите рост (в см): ");
            if (scanner.hasNextDouble()) {
                double height = scanner.nextDouble();
                scanner.nextLine();
                if (height <= 0) {
                    System.out.println("Рост должен быть положительным числом!");
                    continue;
                }
                return height;
            } else {
                scanner.next();
                System.out.println("Ошибка! Введите числовое значение для роста.");
            }
        }
    }

    // FIXME: inputDepartment -> InputDepartment
    private String inputDepartment() {
        while (true) {
            System.out.print("Введите наименование департамента: ");
            String input = scanner.nextLine();
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