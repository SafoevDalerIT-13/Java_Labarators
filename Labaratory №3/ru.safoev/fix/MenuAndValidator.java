/*
ИСПРАВЛЕНИЯ:
1. Все методы переименованы в PascalCase.
2. Отступы заменены на табуляцию.
3. Убраны излишние комментарии.
4. Поле scanner переименовано в SCANNER (константа).
5. Вспомогательные методы ввода переименованы в InputName, InputLastName, InputPatronymic, InputHeight, InputDepartment.
6. Исправлены вызовы методов в соответствии с новыми именами.
*/
package ru.safoev.fix;

import java.util.List;
import java.util.Scanner;

/**
 * Представляет консольное меню для выбора заданий и ввода данных.
 * Содержит методы для ручного и автоматического ввода.
 */
public class MenuAndValidator {
    /** Сканер для чтения ввода пользователя */
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Главное меню выбора способа ввода.
     * @return 0 при выходе
     */
    public int Menu() {
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
                        return ManualInputMenu();
                    case 2:
                        return AutoInputMenu();
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

    /**
     * Меню ручного ввода данных для выбора задания.
     * @return код выбранного пункта
     */
    private int ManualInputMenu() {
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
                    case 7:
                        ExecuteInputTask7();
                        break;
                    case 8:
                        ExecuteInputTask8();
                        break;
                    case 9:
                        ExecuteInputTask9();
                        break;
                    case 10:
                        ExecuteInputTask10();
                        break;
                    case 11:
                        ExecuteInputTask11();
                        break;
                    case 12:
                        ExecuteInputTask12();
                        break;
                    case 13:
                        ExecuteInputTask13();
                        break;
                    case 0:
                        return Menu();
                    default:
                        System.out.println("Неверный номер задания!");
                        break;
                }
            } else {
                SCANNER.next();
                System.out.println("Неверно! Введите число от 0 до 13");
            }
        }
    }

    /**
     * Меню автоматического ввода (готовые данные) для выбора задания.
     * @return код выбранного пункта
     */
    private int AutoInputMenu() {
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
                    case 7:
                        ExecuteAutoTask7();
                        break;
                    case 8:
                        ExecuteAutoTask8();
                        break;
                    case 9:
                        ExecuteAutoTask9();
                        break;
                    case 10:
                        ExecuteAutoTask10();
                        break;
                    case 11:
                        ExecuteAutoTask11();
                        break;
                    case 12:
                        ExecuteAutoTask12();
                        break;
                    case 13:
                        ExecuteAutoTask13();
                        break;
                    case 0:
                        return Menu();
                    default:
                        System.out.println("Неверный номер задания!");
                        break;
                }
            } else {
                SCANNER.next();
                System.out.println("Неверно! Введите число от 0 до 13");
            }
        }
    }

    // ---------------------- Автоматические задачи ----------------------
    private void ExecuteAutoTask1() {
        System.out.println("Категория №1: Задача 3");
        System.out.println("Имена.\n" +
                "Создайте сущность Имя, которая описывается тремя параметрами: Фамилия, Личное имя,\n" +
                "Отчество. Имя может быть приведено к строковому виду, включающему традиционное\n" +
                "представление всех трех параметров: Фамилия Имя Отчество (например “Иванов Иван\n" +
                "Иванович”). Необходимо предусмотреть возможность того, что какой-либо из параметров может\n" +
                "быть не задан, и в этом случае он не учитывается при приведении к текстовому виду.\n" +
                "Необходимо создать следующие имена:\n" +
                "     - Клеопатра\n" +
                "     - Пушкин Александр Сергеевич\n" +
                "     - Маяковский Владимир\n" +
                "Обратите внимание, что при выводе на экран, не заданные параметры никак не участвуют в\n" +
                "образовании строки. \n\nРешение: ");
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
                "Создайте сущность Человек, которая описывается:\n" +
                "- Имя: строка\n" +
                "- Рост: целое число\n" +
                "Может возвращать текстовое представление вида “ru.safoev.person.Name, рост: height”, где ru.safoev.person.Name и height это\n" +
                "переменная с именем и ростом.\n" +
                "Необходимо создать и вывести на экран следующих людей:\n" +
                "- Человек с именем “Клеопатра” и ростом 152\n" +
                "- Человек с именем “Пушкин ” и ростом 167\n" +
                "- Человек с именем “Владимир ” и ростом 189\n");
        Person cleopatra1 = new Person("Клеопатра", 152);
        Person pushkin1 = new Person("Пушкин", 167);
        Person mayakovskiy1 = new Person("Владимир", 189);
        System.out.println(cleopatra1);
        System.out.println(pushkin1);
        System.out.println(mayakovskiy1);
    }

    private void ExecuteAutoTask3() {
        System.out.println("Категория №2: Задача 4");
        System.out.println("Сотрудники и отделы.\n" +
                "Создайте сущность Сотрудник, которая описывается именем (в строковой форме) и отделом, в\n" +
                "котором сотрудник работает, причем у каждого отдела есть название и начальник, который\n" +
                "также является Сотрудником. Сотрудник может быть приведен к текстовой форме вида: “Имя\n" +
                "работает в отделе Название, начальник которого Имя”. В случае если сотрудник является\n" +
                "руководителем отдела, то текстовая форма должна быть “Имя начальник отдела Название”.\n" +
                "Необходимо выполнить следующие задачи:\n" +
                "1. Создать Сотрудников Петрова, Козлова, Сидорова работающих в отделе IT.\n" +
                "2. Сделать Козлова начальником IT отдела.\n" +
                "3. Вывести на экран текстовое представление всех трех Сотрудников (у всех троих должен\n" +
                "оказаться один и тот же отдел и начальник).\n");
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
                "Измените решение, полученное в задаче 2.4 таким образом, чтобы имея ссылку на сотрудника,\n" +
                "можно было бы узнать список всех сотрудников этого отдела.\n");
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

    private void ExecuteAutoTask5() {
        System.out.println("Категория №4: Задача 5");
        System.out.println("Создаем Имена.\n" +
                "Измените сущность Имя из задачи 1.3. Новые требования включают:\n" +
                "- Имя можно создать указав только Личное имя\n" +
                "- Имя можно создать указав Личное имя и Фамилию.\n" +
                "- Имя можно создать указав все три параметра: Личное имя, Фамилию, Отчество.\n" +
                "Необходимо создать следующие имена:\n" +
                "1. Клеопатра\n" +
                "2. Александр Сергеевич Пушкин\n" +
                "3. Владимир Маяковский\n" +
                "4. Христофор Бонифатьевич (здесь Христофор это имя, а Бонифатьевич - фамилия) ");
        Name cleopatra2 = new Name("Клеопатра");
        Name pushkin2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name mayakovskiy2 = new Name("Маяковский", "Владимир");
        Name hrostofor = new Name("Бонифатьевич", "Христофор");
        System.out.println(cleopatra2.ToStringAlternative());
        System.out.println(pushkin2.ToStringAlternative());
        System.out.println(mayakovskiy2.ToStringAlternative());
        System.out.println(hrostofor.ToStringAlternative());
    }

    private void ExecuteAutoTask6() {
        System.out.println("Категория №5: Задача 1");
        System.out.println("Пистолет стреляет.\n" +
                "Создайте сущность Пистолет, которая описывается следующим образом:\n" +
                "- Имеет Количество патронов (целое число)\n" +
                "- Может быть создан с указанием начального количества патронов\n" +
                "- Может быть создан без указания начального количества патронов, в этом случае он\n" +
                "изначально заряжен пятью патронами.\n" +
                "- Может Стрелять, что приводит к выводу на экран текста “Бах!” в том случае, если\n" +
                "количество патронов больше нуля, иначе делает “Клац!”. После каждого выстрела (когда\n" +
                "вывелся “Бах!”) количество патронов уменьшается на один.\n" +
                "Создайте пистолет с тремя патронами и выстрелите из него пять раз. ");
        Gun gun1 = new Gun(3);
        for (int i = 0; i < 5; i++) {
            gun1.fire();
        }
    }

    private void ExecuteAutoTask7() {
        System.out.println("Категория №1: Задача 5");
        System.out.println("Перезарядка Пистолета.\n" +
                "Измените сущность Пистолет из задачи 1.5.1. Модификация предполагает внесение следующих\n" +
                "дополнительных требований:\n" +
                "• Имеет максимальное количество патронов. Максимальное количество устанавливается во\n" +
                "время создания пистолета и не может быть изменено позднее. У пистолета можно узнать,\n" +
                "какое максимальное количество он вмещает.\n" +
                "• Может быть перезаряжен. Для перезарядки необходимо передать пистолету число,\n" +
                "которое будет означать количество заряжаемых патронов. Если передано отрицательное\n" +
                "число, необходимо выбросить ошибку, объясняющую, что отрицательного числа\n" +
                "патронов быть не может. Если передано слишком большое число патронов – необходимо\n" +
                "лишние вернуть.\n" +
                "• Может быть разряжен. Это приводит к обнулению патронов в пистолете и возврате\n" +
                "нужного числа пользователю.\n" +
                "• Можно узнать сколько сейчас заряжено патронов.\n" +
                "• Можно узнать заряжен он или разряжен.\n" +
                "Создайте пистолет вместимостью 7, зарядите три патрона, выстрелите из него пять раз, затем\n" +
                "зарядите в него 8 патронов, выстрелите еще 2 раза, разрядите его, сделайте контрольный\n" +
                "выстрел.\n" +
                "Если все выполнено верно, то должно быть выведено: Бах! Бах! Бах! Клац! Клац! Бах! Бах! Клац!");
        Gun gun = new Gun(0, 7);
        gun.load(3);
        for (int i = 0; i < 5; i++) gun.fire();
        gun.load(8);
        for (int i = 0; i < 2; i++) gun.fire();
        gun.unLoad();
        gun.fire();
    }

    private void ExecuteAutoTask8() {
        System.out.println("Категория №1: Задача 7");
        System.out.println("Непустые Имена.\n" +
                "Измените сущность Имя из задачи 1.4.5. Гарантируйте, что:\n" +
                "• Как минимум один параметр будет иметь не null значение и не пустую строку.\n" +
                "• Имя неизменяемо.\n" +
                "Продемонстрируйте работоспособность решения на примерах.");
        System.out.println("1. КОРРЕКТНЫЕ ОБЪЕКТЫ:");
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
        System.out.println("\n2. НЕИЗМЕНЯЕМОСТЬ:");
        Name immutableName = new Name("Сидоров", "Петр", "Иванович");
        System.out.println("Объект: " + immutableName);
        System.out.println("Геттеры: " + immutableName.getLastName() + ", " + immutableName.getFirstName() + ", " + immutableName.getPatronymic());
        System.out.println("Поля final, сеттеров нет");
        System.out.println("\n3. ФОРМАТЫ ВЫВОДА:");
        System.out.println(new Name("Иванов", "Иван", "Иванович"));
        System.out.println(new Name("Петрова", "Мария"));
        System.out.println(new Name("Сергей"));
        System.out.println(new Name("Кузнецов", null, null));
        System.out.println(new Name(null, null, "Павлович"));
    }

    private void ExecuteAutoTask9() {
        System.out.println("Категория №2: Задача 3");
        System.out.println("Желтые страницы.\n" +
                "Необходимо разработать сущность ТелефонныйСправочник...");
        TelephoneDirectory directory = new TelephoneDirectory();
        directory.AddNewUser("89003337788", "Вася");
        directory.AddNewUser("89005556699", "Петя");
        directory.AddNewUser("89004445566", "Маша");
        directory.AddNewUser("89001112233", "Валентин");
        System.out.println(directory);
        directory.AddNewUser("89009998877", "Вася");
        System.out.println(directory);
        System.out.println("Телефон Маши: " + directory.GetPhone("Маша"));
        directory.CheckExists("Вася");
        directory.SizeMap();
        directory.PairsArray();
        directory.TelephoneArray();
        directory.NameArray();
        directory.NamesArrayStartingWith("Ва");
        directory.DeleteUser("Петя");
        System.out.println(directory);
    }

    private void ExecuteAutoTask10() {
        System.out.println("Категория №3: Задача 4");
        System.out.println("Автомат. Создайте такой подвид сущности Пистолет...");
        AutomaticGun gun1 = new AutomaticGun();
        System.out.println("Скорострельность: " + gun1.getFireRate() + " выстр/сек");
        System.out.println("Вместимость: " + gun1.getMaxOfCartridges());
        gun1.reload(10);
        System.out.println("\nОдиночный огонь (" + gun1.getFireRate() + " выстрелов):");
        gun1.fire();
        System.out.println("\nСтрельба 2 секунды (" + (2 * gun1.getFireRate()) + " выстрелов):");
        gun1.FireSecond(2);
        System.out.println();
        AutomaticGun gun2 = new AutomaticGun(20);
        System.out.println("Вместимость: " + gun2.getMaxOfCartridges());
        System.out.println("Скорострельность (половина обоймы): " + gun2.getFireRate() + " выстр/сек");
        System.out.println("\nОдиночный огонь (" + gun2.getFireRate() + " выстрелов):");
        gun2.fire();
        System.out.println();
        AutomaticGun gun3 = new AutomaticGun(10, 3);
        System.out.println("Вместимость: " + gun3.getMaxOfCartridges());
        System.out.println("Скорострельность: " + gun3.getFireRate() + " выстр/сек");
        System.out.println("\nОдиночный огонь (" + gun3.getFireRate() + " выстрелов):");
        gun3.fire();
        System.out.println("\nСтрельба 3 секунды (" + (3 * gun3.getFireRate()) + " выстрелов):");
        gun3.FireSecond(3);
        System.out.println();
    }

    private void ExecuteAutoTask11() {
        System.out.println("Категория №4: Задача 1");
        System.out.println("Оружие.\n" +
                "Измените сущность Пистолет, полученную в задаче 2.1.5 таким образом, чтобы она наследовалась\n" +
                "от класса ru.safoev.weapon.Weapon описанного на рисунке");
        System.out.println("Создал класс ru.safoev.weapon.Weapon и применил наследование к ru.safoev.weapon.Gun! (Читать сам код!)");
        Gun gun1 = new Gun();
        Gun gun2 = new Gun(3, 10);
        System.out.println("Пистолет 1: " + gun1);
        System.out.println("Пистолет 2: " + gun2);
        System.out.println("\nПистолет 1 (5 патронов):");
        for (int i = 0; i < 3; i++) gun1.shoot();
        System.out.println("Пистолет 2 (3 патрона):");
        for (int i = 0; i < 4; i++) gun2.shoot();
        gun2.reload(8);
        System.out.println("ammo(): " + gun2.ammo());
        System.out.println("getAmmo(): " + gun2.getAmmo());
        System.out.println("После getAmmo: " + gun2.ammo());
        gun2.load(5);
        System.out.println("После load(5): " + gun2.ammo());
    }

    private void ExecuteAutoTask12() {
        System.out.println("Категория №5: Задача 8");
        System.out.println("Лучший стрелок.\n" +
                "Создайте сущность Стрелок, которая описывается:\n" +
                "• Имя, строка\n" +
                "• Оружие, из задачи 2.4.1.\n" +
                "• При создании объекта необходимо указать ему имя\n" +
                "• Имя и оружие можно поменять и получить в любой момент без ограничения.\n" +
                "Основная способность Стрелка - умение стрелять. Если оружие есть, то выстрел происходит по\n" +
                "правилам оружия, если его нет – то выводится текст “не могу участвовать в перестрелке”.\n" +
                "Создайте трех стрелков: одного без оружия, одного с пистолетом и одного с автоматом, и пусть\n" +
                "каждый из них выстрелит.");
        Shooter shooter1 = new Shooter("Вася");
        Shooter shooter2 = new Shooter("Петя", new Gun(3));
        Shooter shooter3 = new Shooter("Коля", new AutomaticGun(10, 2));
        shooter1.shoot();
        shooter2.shoot();
        shooter3.shoot();
    }

    private void ExecuteAutoTask13() {
        System.out.println("Категория №6: Задача 2");
        System.out.println("Сравнение точек.\n" +
                "Измените сущность Точка из задачи 1.4.1. Переопределите метод сравнения объектов по\n" +
                "состоянию таким образом, чтобы две точки считались одинаковыми тогда, когда они\n" +
                "расположены в одинаковых координатах.");
        Point point1 = new Point(3.5, 2.0);
        Point point2 = new Point(3.5, 2.0);
        Point point3 = new Point(1.0, 4.0);
        Point point4 = new Point(3.5, 2.0);
        System.out.println("Точка 1: " + point1);
        System.out.println("Точка 2: " + point2);
        System.out.println("Точка 3: " + point3);
        System.out.println();
        System.out.println("point1.equals(point2): " + point1.equals(point2));
        System.out.println("point1.equals(point3): " + point1.equals(point3));
        System.out.println("point2.equals(point4): " + point2.equals(point4));
        System.out.println("point1 == point2: " + (point1 == point2));
    }

    // ---------------------- Методы для ручного ввода ----------------------
    private void ExecuteInputTask1() {
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
            if (SCANNER.hasNextInt()) {
                int choice = SCANNER.nextInt();
                SCANNER.nextLine();
                switch (choice) {
                    case 1:
                        String firstname = InputName();
                        Name firstname1 = new Name(firstname);
                        System.out.println("Создано: " + firstname1);
                        break;
                    case 2:
                        String lastname = InputLastName();
                        String lastname1 = InputName();
                        String lastname2 = InputPatronymic();
                        Name firstname12 = new Name(lastname, lastname1, lastname2);
                        System.out.println("Создано: " + firstname12);
                        break;
                    case 3:
                        String surname = InputLastName();
                        String surname1 = InputName();
                        Name surname12 = new Name(surname, surname1);
                        System.out.println("Создано: " + surname12);
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
        System.out.println("Человек.\n" +
                "Создайте сущность Человек...");
        String name = InputName();
        int height = (int) InputHeight();
        Person person = new Person(name, height);
        System.out.println("Создано: " + person);
    }

    private void ExecuteInputTask3() {
        System.out.println("Категория №2: Задача 4");
        System.out.println("Сотрудники и отделы.\n" +
                "Создайте сущность Сотрудник...");
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
        System.out.println("Какого сотрудника вы хотите сделать управляющим отделом " + deptName);
        while (true) {
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
            } else {
                System.out.println("Введите число!");
            }
            System.out.println("1. " + emp1);
            System.out.println("2. " + emp2);
            System.out.println("3. " + emp3);
            return;
        }
    }

    private void ExecuteInputTask4() {
        System.out.println("Категория №3: Задача 4");
        System.out.println("Сотрудники и отделы.\n" +
                "Измените решение, полученное в задаче 2.4 таким образом...");
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
        System.out.println("Какого сотрудника вы хотите сделать управляющим отделом " + deptName);
        while (true) {
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
            } else {
                System.out.println("Введите число!");
            }
            System.out.println("1. " + emp1);
            System.out.println("2. " + emp2);
            System.out.println("3. " + emp3);
            System.out.println("Через какого сотрудника вы хотите получить всех сотрудников?");
            while (true) {
                System.out.println("1. " + name1);
                System.out.println("2. " + name2);
                System.out.println("3. " + name3);
                System.out.print("Ваш выбор: ");
                if (SCANNER.hasNextInt()) {
                    int choice2 = SCANNER.nextInt();
                    SCANNER.nextLine();
                    switch (choice2) {
                        case 1:
                            System.out.println("Список сотрудников отдела (через " + name1 + "): ");
                            for (Employee e : emp1.getAllDepartmentEmployees()) {
                                System.out.println("- " + e.getName());
                            }
                            break;
                        case 2:
                            System.out.println("Список сотрудников отдела (через " + name2 + "): ");
                            for (Employee e : emp2.getAllDepartmentEmployees()) {
                                System.out.println("- " + e.getName());
                            }
                            break;
                        case 3:
                            System.out.println("Список сотрудников отдела (через " + name3 + "): ");
                            for (Employee e : emp3.getAllDepartmentEmployees()) {
                                System.out.println("- " + e.getName());
                            }
                            break;
                        default:
                            System.out.println("Некорректный выбор!");
                    }
                } else {
                    System.out.println("Введите число!");
                }
                return;
            }
        }
    }

    private void ExecuteInputTask5() {
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
            if (SCANNER.hasNextInt()) {
                int choice = SCANNER.nextInt();
                SCANNER.nextLine();
                switch (choice) {
                    case 1:
                        String firstname = InputName();
                        Name firstname1 = new Name(firstname);
                        System.out.println("Создано: " + firstname1.ToStringAlternative());
                        break;
                    case 2:
                        String lastname = InputLastName();
                        String lastname1 = InputName();
                        String lastname2 = InputPatronymic();
                        Name firstname12 = new Name(lastname, lastname1, lastname2);
                        System.out.println("Создано: " + firstname12.ToStringAlternative());
                        break;
                    case 3:
                        String surname = InputLastName();
                        String surname1 = InputName();
                        Name surname12 = new Name(surname, surname1);
                        System.out.println("Создано: " + surname12.ToStringAlternative());
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
        System.out.println("Пистолет стреляет.\n" +
                "Создайте сущность Пистолет...");
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
        System.out.println(gun);
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

    private void ExecuteInputTask7() {
        System.out.println("Категория №1: Задача 5");
        System.out.println("Перезарядка Пистолета.\n" +
                "Измените сущность Пистолет из задачи 1.5.1...");
        System.out.println("=== УПРАВЛЕНИЕ ПИСТОЛЕТОМ ===");
        Gun gun = null;
        while (true) {
            System.out.println("\n1. Создать пистолет");
            System.out.println("2. Перезарядить");
            System.out.println("3. Разрядить");
            System.out.println("4. Выстрелить");
            System.out.println("5. Информация");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            if (!SCANNER.hasNextInt()) {
                System.out.println("Ошибка: введите число от 0 до 5!");
                SCANNER.next();
                continue;
            }
            int choice = SCANNER.nextInt();
            SCANNER.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Вместимость пистолета: ");
                    if (!SCANNER.hasNextInt()) {
                        System.out.println("Ошибка: введите число!");
                        SCANNER.next();
                        break;
                    }
                    int maxAmmo = SCANNER.nextInt();
                    SCANNER.nextLine();
                    if (maxAmmo <= 0) {
                        System.out.println("Ошибка: вместимость должна быть положительной!");
                        break;
                    }
                    System.out.print("Зарядить патроны при создании? (1-да, 0-нет): ");
                    if (!SCANNER.hasNextInt()) {
                        System.out.println("Ошибка: введите 1 или 0!");
                        SCANNER.next();
                        break;
                    }
                    int loadChoice = SCANNER.nextInt();
                    SCANNER.nextLine();
                    if (loadChoice == 1) {
                        System.out.print("Сколько патронов зарядить: ");
                        if (!SCANNER.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            SCANNER.next();
                            break;
                        }
                        int initialAmmo = SCANNER.nextInt();
                        SCANNER.nextLine();
                        if (initialAmmo < 0) {
                            System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                            break;
                        }
                        if (initialAmmo > maxAmmo) {
                            System.out.println("Ошибка: количество патронов не может быть больше вместимости!");
                            break;
                        }
                        gun = new Gun(initialAmmo, maxAmmo);
                        System.out.println("Пистолет создан с " + initialAmmo + " патронами!");
                    } else {
                        gun = new Gun(0, maxAmmo);
                        System.out.println("Пистолет создан без патронов!");
                    }
                    break;
                case 2:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    System.out.print("Сколько патронов зарядить: ");
                    if (!SCANNER.hasNextInt()) {
                        System.out.println("Ошибка: введите число!");
                        SCANNER.next();
                        break;
                    }
                    int ammoLoad = SCANNER.nextInt();
                    SCANNER.nextLine();
                    if (ammoLoad < 0) {
                        System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                        break;
                    }
                    try {
                        gun.reload(ammoLoad);
                    } catch (Exception e) {
                        System.out.println("Ошибка при перезарядке: " + e.getMessage());
                    }
                    break;
                case 3:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    try {
                        gun.unLoad();
                    } catch (Exception e) {
                        System.out.println("Ошибка при разрядке: " + e.getMessage());
                    }
                    break;
                case 4:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    System.out.print("Сколько раз выстрелить: ");
                    if (!SCANNER.hasNextInt()) {
                        System.out.println("Ошибка: введите число!");
                        SCANNER.next();
                        break;
                    }
                    int shots = SCANNER.nextInt();
                    SCANNER.nextLine();
                    if (shots <= 0) {
                        System.out.println("Ошибка: количество выстрелов должно быть положительным!");
                        break;
                    }
                    try {
                        System.out.println("Стрельба...");
                        for (int i = 0; i < shots; i++) {
                            System.out.print("Выстрел " + (i + 1) + ": ");
                            gun.fire();
                            if (gun.getNumberOfCartridges() == 0) {
                                System.out.println("Патроны закончились!");
                                break;
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Ошибка при выстреле: " + e.getMessage());
                    }
                    break;
                case 5:
                    if (gun == null) {
                        System.out.println("Пистолет не создан!");
                        break;
                    }
                    try {
                        gun.PrintNumberOfCartridges();
                        gun.PrintMaxOfCartridges();
                        gun.PrintChargedStatus();
                    } catch (Exception e) {
                        System.out.println("Ошибка при получении информации: " + e.getMessage());
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор! Введите число от 0 до 5");
            }
        }
    }

    private void ExecuteInputTask8() {
        System.out.println("Категория №1: Задача 7");
        System.out.println("Непустые Имена.\n" +
                "Измените сущность Имя из задачи 1.4.5...");
        while (true) {
            System.out.println("\n1. Создать имя (все три поля)");
            System.out.println("2. Создать имя (только фамилия и имя)");
            System.out.println("3. Создать имя (только фамилия)");
            System.out.println("4. Показать информацию об имени");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            if (!SCANNER.hasNextInt()) {
                System.out.println("Ошибка: введите число от 0 до 4!");
                SCANNER.next();
                continue;
            }
            int choice = SCANNER.nextInt();
            SCANNER.nextLine();
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Фамилия: ");
                        String lastname = SCANNER.nextLine();
                        System.out.print("Имя: ");
                        String firstname = SCANNER.nextLine();
                        System.out.print("Отчество: ");
                        String patronymic = SCANNER.nextLine();
                        Name name = new Name(lastname, firstname, patronymic);
                        System.out.println("Имя создано: " + name);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Фамилия: ");
                        String lastname = SCANNER.nextLine();
                        System.out.print("Имя: ");
                        String firstname = SCANNER.nextLine();
                        Name name = new Name(lastname, firstname);
                        System.out.println("Имя создано: " + name);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Фамилия: ");
                        String lastname = SCANNER.nextLine();
                        Name name = new Name(lastname);
                        System.out.println("Имя создано: " + name);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.print("Фамилия: ");
                        String lastname = SCANNER.nextLine();
                        System.out.print("Имя: ");
                        String firstname = SCANNER.nextLine();
                        System.out.print("Отчество: ");
                        String patronymic = SCANNER.nextLine();
                        Name name = new Name(lastname, firstname, patronymic);
                        System.out.println("\nИнформация об имени:");
                        System.out.println("Полное имя: " + name);
                        System.out.println("Фамилия: " + name.getLastName());
                        System.out.println("Имя: " + name.getFirstName());
                        System.out.println("Отчество: " + name.getPatronymic());
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор! Введите число от 0 до 4");
            }
        }
    }

    private void ExecuteInputTask9() {
        System.out.println("Категория №2: Задача 3");
        System.out.println("Желтые страницы.\n" +
                "Необходимо разработать сущность ТелефонныйСправочник...");
        TelephoneDirectory directory = new TelephoneDirectory();
        while (true) {
            System.out.println("\n1. Добавить контакт");
            System.out.println("2. Удалить контакт");
            System.out.println("3. Найти телефон по имени");
            System.out.println("4. Проверить наличие");
            System.out.println("5. Показать все контакты");
            System.out.println("6. Количество контактов");
            System.out.println("7. Получить все телефоны");
            System.out.println("8. Получить все имена");
            System.out.println("9. Поиск по началу имени");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            if (!SCANNER.hasNextInt()) {
                System.out.println("Ошибка: введите число от 0 до 9!");
                SCANNER.next();
                continue;
            }
            int choice = SCANNER.nextInt();
            SCANNER.nextLine();
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Введите имя: ");
                        String name = SCANNER.nextLine();
                        System.out.print("Введите телефон: ");
                        String phone = SCANNER.nextLine();
                        if (name.trim().isEmpty() || phone.trim().isEmpty()) {
                            System.out.println("Ошибка: имя и телефон не могут быть пустыми!");
                            break;
                        }
                        String oldPhone = directory.AddNewUser(phone, name);
                        if (oldPhone != null) {
                            System.out.println("Контакт обновлен! Старый телефон: " + oldPhone);
                        } else {
                            System.out.println("Контакт добавлен!");
                        }
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Введите имя для удаления: ");
                        String name = SCANNER.nextLine();
                        if (name.trim().isEmpty()) {
                            System.out.println("Ошибка: имя не может быть пустым!");
                            break;
                        }
                        directory.DeleteUser(name);
                        System.out.println("Контакт удален!");
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Введите имя для поиска: ");
                        String name = SCANNER.nextLine();
                        if (name.trim().isEmpty()) {
                            System.out.println("Ошибка: имя не может быть пустым!");
                            break;
                        }
                        String phone = directory.GetPhone(name);
                        if (phone != null) {
                            System.out.println("Телефон: " + phone);
                        } else {
                            System.out.println("Контакт не найден!");
                        }
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        System.out.print("Введите имя или телефон для проверки: ");
                        String key = SCANNER.nextLine();
                        if (key.trim().isEmpty()) {
                            System.out.println("Ошибка: введите значение для поиска!");
                            break;
                        }
                        directory.CheckExists(key);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        System.out.println(directory);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        directory.SizeMap();
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 7:
                    try {
                        directory.TelephoneArray();
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 8:
                    try {
                        directory.NameArray();
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 9:
                    try {
                        System.out.print("Введите начало имени для поиска: ");
                        String prefix = SCANNER.nextLine();
                        if (prefix.trim().isEmpty()) {
                            System.out.println("Ошибка: введите начало имени!");
                            break;
                        }
                        directory.NamesArrayStartingWith(prefix);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор! Введите число от 0 до 9");
            }
        }
    }

    private void ExecuteInputTask10() {
        System.out.println("Категория №1: Задача 10");
        System.out.println("Автомат.\n" +
                "Создайте такой подвид сущности Пистолет...");
        AutomaticGun gun = null;
        while (true) {
            System.out.println("\n1. Создать автомат (по умолчанию)");
            System.out.println("2. Создать автомат (с вместимостью)");
            System.out.println("3. Создать автомат (с вместимостью и скорострельностью)");
            System.out.println("4. Перезарядить");
            System.out.println("5. Разрядить");
            System.out.println("6. Одиночный огонь");
            System.out.println("7. Стрельба N секунд");
            System.out.println("8. Информация");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            if (!SCANNER.hasNextInt()) {
                System.out.println("Ошибка: введите число от 0 до 8!");
                SCANNER.next();
                continue;
            }
            int choice = SCANNER.nextInt();
            SCANNER.nextLine();
            switch (choice) {
                case 1:
                    try {
                        gun = new AutomaticGun();
                        System.out.println("Автомат создан по умолчанию! Вместимость: 30, Скорострельность: 30");
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Введите вместимость автомата: ");
                        if (!SCANNER.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            SCANNER.next();
                            break;
                        }
                        int maxAmmo = SCANNER.nextInt();
                        SCANNER.nextLine();
                        if (maxAmmo <= 0) {
                            System.out.println("Ошибка: вместимость должна быть положительной!");
                            break;
                        }
                        gun = new AutomaticGun(maxAmmo);
                        System.out.println("Автомат создан! Вместимость: " + maxAmmo + ", Скорострельность: " + gun.getFireRate());
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Введите вместимость автомата: ");
                        if (!SCANNER.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            SCANNER.next();
                            break;
                        }
                        int maxAmmo = SCANNER.nextInt();
                        SCANNER.nextLine();
                        if (maxAmmo <= 0) {
                            System.out.println("Ошибка: вместимость должна быть положительной!");
                            break;
                        }
                        System.out.print("Введите скорострельность: ");
                        if (!SCANNER.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            SCANNER.next();
                            break;
                        }
                        int fireRate = SCANNER.nextInt();
                        SCANNER.nextLine();
                        if (fireRate <= 0) {
                            System.out.println("Ошибка: скорострельность должна быть положительной!");
                            break;
                        }
                        gun = new AutomaticGun(maxAmmo, fireRate);
                        System.out.println("Автомат создан! Вместимость: " + maxAmmo + ", Скорострельность: " + gun.getFireRate());
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 4:
                    if (gun == null) {
                        System.out.println("Сначала создайте автомат!");
                        break;
                    }
                    System.out.print("Сколько патронов зарядить: ");
                    if (!SCANNER.hasNextInt()) {
                        System.out.println("Ошибка: введите число!");
                        SCANNER.next();
                        break;
                    }
                    int ammoLoad = SCANNER.nextInt();
                    SCANNER.nextLine();
                    if (ammoLoad < 0) {
                        System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                        break;
                    }
                    try {
                        gun.reload(ammoLoad);
                    } catch (Exception e) {
                        System.out.println("Ошибка при перезарядке: " + e.getMessage());
                    }
                    break;
                case 5:
                    if (gun == null) {
                        System.out.println("Сначала создайте автомат!");
                        break;
                    }
                    try {
                        gun.unLoad();
                    } catch (Exception e) {
                        System.out.println("Ошибка при разрядке: " + e.getMessage());
                    }
                    break;
                case 6:
                    if (gun == null) {
                        System.out.println("Сначала создайте автомат!");
                        break;
                    }
                    try {
                        System.out.println("Одиночный огонь (" + gun.getFireRate() + " выстрелов):");
                        gun.fire();
                    } catch (Exception e) {
                        System.out.println("Ошибка при стрельбе: " + e.getMessage());
                    }
                    break;
                case 7:
                    if (gun == null) {
                        System.out.println("Сначала создайте автомат!");
                        break;
                    }
                    System.out.print("Введите время стрельбы в секундах: ");
                    if (!SCANNER.hasNextInt()) {
                        System.out.println("Ошибка: введите число!");
                        SCANNER.next();
                        break;
                    }
                    int seconds = SCANNER.nextInt();
                    SCANNER.nextLine();
                    if (seconds <= 0) {
                        System.out.println("Ошибка: время должно быть положительным!");
                        break;
                    }
                    try {
                        gun.FireSecond(seconds);
                    } catch (Exception e) {
                        System.out.println("Ошибка при стрельбе: " + e.getMessage());
                    }
                    break;
                case 8:
                    if (gun == null) {
                        System.out.println("Автомат не создан!");
                        break;
                    }
                    try {
                        gun.PrintNumberOfCartridges();
                        gun.PrintMaxOfCartridges();
                        gun.PrintChargedStatus();
                        System.out.println("Скорострельность: " + gun.getFireRate() + " выстр/сек");
                    } catch (Exception e) {
                        System.out.println("Ошибка при получении информации: " + e.getMessage());
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор! Введите число от 0 до 8");
            }
        }
    }

    private void ExecuteInputTask11() {
        System.out.println("Категория №1: Задача 11");
        System.out.println("Оружие.\n" +
                "Измените сущность Пистолет таким образом, чтобы она наследовалась от класса Weapon");
        Gun gun = null;
        while (true) {
            System.out.println("\n1. Создать пистолет (по умолчанию)");
            System.out.println("2. Создать пистолет (с патронами)");
            System.out.println("3. Создать пистолет (с патронами и вместимостью)");
            System.out.println("4. Методы Weapon - ammo()");
            System.out.println("5. Методы Weapon - getAmmo()");
            System.out.println("6. Методы Weapon - load()");
            System.out.println("7. Метод Gun - shoot()");
            System.out.println("8. Метод Gun - reload()");
            System.out.println("9. Метод Gun - unLoad()");
            System.out.println("10. Информация о пистолете");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            if (!SCANNER.hasNextInt()) {
                System.out.println("Ошибка: введите число от 0 до 10!");
                SCANNER.next();
                continue;
            }
            int choice = SCANNER.nextInt();
            SCANNER.nextLine();
            switch (choice) {
                case 1:
                    try {
                        gun = new Gun();
                        System.out.println("Пистолет создан по умолчанию! " + gun);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Введите количество патронов: ");
                        if (!SCANNER.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            SCANNER.next();
                            break;
                        }
                        int ammo = SCANNER.nextInt();
                        SCANNER.nextLine();
                        if (ammo < 0) {
                            System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                            break;
                        }
                        gun = new Gun(ammo);
                        System.out.println("Пистолет создан! " + gun);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Введите количество патронов: ");
                        if (!SCANNER.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            SCANNER.next();
                            break;
                        }
                        int ammo = SCANNER.nextInt();
                        SCANNER.nextLine();
                        if (ammo < 0) {
                            System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                            break;
                        }
                        System.out.print("Введите вместимость: ");
                        if (!SCANNER.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            SCANNER.next();
                            break;
                        }
                        int maxAmmo = SCANNER.nextInt();
                        SCANNER.nextLine();
                        if (maxAmmo <= 0) {
                            System.out.println("Ошибка: вместимость должна быть положительной!");
                            break;
                        }
                        gun = new Gun(ammo, maxAmmo);
                        System.out.println("Пистолет создан! " + gun);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 4:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    System.out.println("ammo() = " + gun.ammo());
                    break;
                case 5:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    boolean result = gun.getAmmo();
                    System.out.println("getAmmo() = " + result + ", теперь патронов: " + gun.ammo());
                    break;
                case 6:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    System.out.print("Введите новое количество патронов: ");
                    if (!SCANNER.hasNextInt()) {
                        System.out.println("Ошибка: введите число!");
                        SCANNER.next();
                        break;
                    }
                    int newAmmo = SCANNER.nextInt();
                    SCANNER.nextLine();
                    int oldAmmo = gun.load(newAmmo);
                    System.out.println("load вернул: " + oldAmmo + ", теперь патронов: " + gun.ammo());
                    break;
                case 7:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    gun.shoot();
                    break;
                case 8:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    System.out.print("Введите количество патронов для перезарядки: ");
                    if (!SCANNER.hasNextInt()) {
                        System.out.println("Ошибка: введите число!");
                        SCANNER.next();
                        break;
                    }
                    int reloadAmmo = SCANNER.nextInt();
                    SCANNER.nextLine();
                    int extra = gun.reload(reloadAmmo);
                    System.out.println("Лишние патроны: " + extra);
                    break;
                case 9:
                    if (gun == null) {
                        System.out.println("Сначала создайте пистолет!");
                        break;
                    }
                    int returned = gun.unLoad();
                    System.out.println("Возвращено патронов: " + returned);
                    break;
                case 10:
                    if (gun == null) {
                        System.out.println("Пистолет не создан!");
                        break;
                    }
                    System.out.println(gun);
                    gun.PrintNumberOfCartridges();
                    gun.PrintMaxOfCartridges();
                    gun.PrintChargedStatus();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор! Введите число от 0 до 10");
            }
        }
    }

    private void ExecuteInputTask12() {
        System.out.println("Категория №1: Задача 12");
        System.out.println("Лучший стрелок.\n" +
                "Создайте сущность Стрелок...");
        Shooter shooter = null;
        while (true) {
            System.out.println("\n1. Создать стрелка (без оружия)");
            System.out.println("2. Создать стрелка (с пистолетом)");
            System.out.println("3. Создать стрелка (с автоматом)");
            System.out.println("4. Изменить имя стрелка");
            System.out.println("5. Изменить оружие стрелка");
            System.out.println("6. Получить информацию о стрелке");
            System.out.println("7. Стрелок стреляет");
            System.out.println("8. Демонстрация трех стрелков");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            if (!SCANNER.hasNextInt()) {
                System.out.println("Ошибка: введите число от 0 до 8!");
                SCANNER.next();
                continue;
            }
            int choice = SCANNER.nextInt();
            SCANNER.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Введите имя стрелка: ");
                    String name = SCANNER.nextLine();
                    if (name.trim().isEmpty()) {
                        System.out.println("Ошибка: имя не может быть пустым!");
                        break;
                    }
                    shooter = new Shooter(name);
                    System.out.println("Стрелок создан: " + shooter);
                    break;
                case 2:
                    try {
                        System.out.print("Введите имя стрелка: ");
                        String name2 = SCANNER.nextLine();
                        if (name2.trim().isEmpty()) {
                            System.out.println("Ошибка: имя не может быть пустым!");
                            break;
                        }
                        System.out.print("Введите вместимость пистолета: ");
                        if (!SCANNER.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            SCANNER.next();
                            break;
                        }
                        int capacity = SCANNER.nextInt();
                        SCANNER.nextLine();
                        if (capacity <= 0) {
                            System.out.println("Ошибка: вместимость должна быть положительной!");
                            break;
                        }
                        Gun gun = new Gun(0, capacity);
                        System.out.print("Зарядить патроны? (1-да, 0-нет): ");
                        if (!SCANNER.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            SCANNER.next();
                            break;
                        }
                        int loadChoice = SCANNER.nextInt();
                        SCANNER.nextLine();
                        if (loadChoice == 1) {
                            System.out.print("Сколько патронов зарядить: ");
                            if (!SCANNER.hasNextInt()) {
                                System.out.println("Ошибка: введите число!");
                                SCANNER.next();
                                break;
                            }
                            int ammo = SCANNER.nextInt();
                            SCANNER.nextLine();
                            if (ammo < 0) {
                                System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                                break;
                            }
                            gun.reload(ammo);
                        }
                        shooter = new Shooter(name2, gun);
                        System.out.println("Стрелок с пистолетом создан: " + shooter);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Введите имя стрелка: ");
                        String name3 = SCANNER.nextLine();
                        if (name3.trim().isEmpty()) {
                            System.out.println("Ошибка: имя не может быть пустым!");
                            break;
                        }
                        System.out.print("Введите вместимость автомата: ");
                        if (!SCANNER.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            SCANNER.next();
                            break;
                        }
                        int capacity = SCANNER.nextInt();
                        SCANNER.nextLine();
                        if (capacity <= 0) {
                            System.out.println("Ошибка: вместимость должна быть положительной!");
                            break;
                        }
                        System.out.print("Введите скорострельность: ");
                        if (!SCANNER.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            SCANNER.next();
                            break;
                        }
                        int fireRate = SCANNER.nextInt();
                        SCANNER.nextLine();
                        if (fireRate <= 0) {
                            System.out.println("Ошибка: скорострельность должна быть положительной!");
                            break;
                        }
                        AutomaticGun autoGun = new AutomaticGun(capacity, fireRate);
                        System.out.print("Зарядить патроны? (1-да, 0-нет): ");
                        if (!SCANNER.hasNextInt()) {
                            System.out.println("Ошибка: введите число!");
                            SCANNER.next();
                            break;
                        }
                        int loadChoice2 = SCANNER.nextInt();
                        SCANNER.nextLine();
                        if (loadChoice2 == 1) {
                            System.out.print("Сколько патронов зарядить: ");
                            if (!SCANNER.hasNextInt()) {
                                System.out.println("Ошибка: введите число!");
                                SCANNER.next();
                                break;
                            }
                            int ammo = SCANNER.nextInt();
                            SCANNER.nextLine();
                            if (ammo < 0) {
                                System.out.println("Ошибка: количество патронов не может быть отрицательным!");
                                break;
                            }
                            autoGun.reload(ammo);
                        }
                        shooter = new Shooter(name3, autoGun);
                        System.out.println("Стрелок с автоматом создан: " + shooter);
                    } catch (Exception e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }
                    break;
                case 4:
                    if (shooter == null) {
                        System.out.println("Сначала создайте стрелка!");
                        break;
                    }
                    System.out.print("Введите новое имя: ");
                    String newName = SCANNER.nextLine();
                    if (newName.trim().isEmpty()) {
                        System.out.println("Ошибка: имя не может быть пустым!");
                        break;
                    }
                    shooter.setName(newName);
                    System.out.println("Имя изменено на: " + shooter.getName());
                    break;
                case 5:
                    if (shooter == null) {
                        System.out.println("Сначала создайте стрелка!");
                        break;
                    }
                    System.out.println("Выберите оружие:");
                    System.out.println("1. Без оружия");
                    System.out.println("2. Пистолет");
                    System.out.println("3. Автомат");
                    if (!SCANNER.hasNextInt()) {
                        System.out.println("Ошибка: введите число!");
                        SCANNER.next();
                        break;
                    }
                    int weaponChoice = SCANNER.nextInt();
                    SCANNER.nextLine();
                    switch (weaponChoice) {
                        case 1:
                            shooter.setWeapon(null);
                            System.out.println("Оружие удалено");
                            break;
                        case 2:
                            System.out.print("Введите вместимость пистолета: ");
                            if (!SCANNER.hasNextInt()) {
                                System.out.println("Ошибка: введите число!");
                                SCANNER.next();
                                break;
                            }
                            int capacity2 = SCANNER.nextInt();
                            SCANNER.nextLine();
                            Gun gun2 = new Gun(0, capacity2);
                            shooter.setWeapon(gun2);
                            System.out.println("Пистолет установлен");
                            break;
                        case 3:
                            System.out.print("Введите вместимость автомата: ");
                            if (!SCANNER.hasNextInt()) {
                                System.out.println("Ошибка: введите число!");
                                SCANNER.next();
                                break;
                            }
                            int autoCapacity = SCANNER.nextInt();
                            SCANNER.nextLine();
                            System.out.print("Введите скорострельность: ");
                            if (!SCANNER.hasNextInt()) {
                                System.out.println("Ошибка: введите число!");
                                SCANNER.next();
                                break;
                            }
                            int fireRate2 = SCANNER.nextInt();
                            SCANNER.nextLine();
                            AutomaticGun autoGun2 = new AutomaticGun(autoCapacity, fireRate2);
                            shooter.setWeapon(autoGun2);
                            System.out.println("Автомат установлен");
                            break;
                        default:
                            System.out.println("Неверный выбор!");
                    }
                    break;
                case 6:
                    if (shooter == null) {
                        System.out.println("Стрелок не создан!");
                        break;
                    }
                    System.out.println("Имя: " + shooter.getName());
                    System.out.println("Оружие: " + (shooter.getWeapon() != null ? shooter.getWeapon().getClass().getSimpleName() : "нет оружия"));
                    break;
                case 7:
                    if (shooter == null) {
                        System.out.println("Сначала создайте стрелка!");
                        break;
                    }
                    System.out.print("Сколько раз стрелять: ");
                    if (!SCANNER.hasNextInt()) {
                        System.out.println("Ошибка: введите число!");
                        SCANNER.next();
                        break;
                    }
                    int shots = SCANNER.nextInt();
                    SCANNER.nextLine();
                    for (int i = 0; i < shots; i++) {
                        shooter.shoot();
                    }
                    break;
                case 8:
                    System.out.println("\n=== ДЕМОНСТРАЦИЯ ТРЕХ СТРЕЛКОВ ===");
                    Shooter s1 = new Shooter("Вася");
                    Shooter s2 = new Shooter("Петя", new Gun(3, 10));
                    Shooter s3 = new Shooter("Коля", new AutomaticGun(10, 2));
                    ((Gun) s2.getWeapon()).reload(5);
                    ((AutomaticGun) s3.getWeapon()).reload(15);
                    System.out.println(s1);
                    s1.shoot();
                    System.out.println(s2);
                    s2.shoot();
                    System.out.println(s3);
                    s3.shoot();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор! Введите число от 0 до 8");
            }
        }
    }

    private void ExecuteInputTask13() {
        System.out.println("Категория №1: Задача 13");
        System.out.println("Сравнение точек.\n" +
                "Переопределите метод сравнения объектов...");
        Point point1 = null, point2 = null;
        while (true) {
            System.out.println("\n1. Создать первую точку");
            System.out.println("2. Создать вторую точку");
            System.out.println("3. Сравнить точки");
            System.out.println("4. Показать информацию о точках");
            System.out.println("5. Демонстрация сравнения");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            if (!SCANNER.hasNextInt()) {
                System.out.println("Ошибка: введите число от 0 до 5!");
                SCANNER.next();
                continue;
            }
            int choice = SCANNER.nextInt();
            SCANNER.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Введите координату X: ");
                    double x1 = SCANNER.nextDouble();
                    System.out.print("Введите координату Y: ");
                    double y1 = SCANNER.nextDouble();
                    point1 = new Point(x1, y1);
                    System.out.println("Первая точка создана: " + point1);
                    break;
                case 2:
                    System.out.print("Введите координату X: ");
                    double x2 = SCANNER.nextDouble();
                    System.out.print("Введите координату Y: ");
                    double y2 = SCANNER.nextDouble();
                    point2 = new Point(x2, y2);
                    System.out.println("Вторая точка создана: " + point2);
                    break;
                case 3:
                    if (point1 == null || point2 == null) {
                        System.out.println("Сначала создайте обе точки!");
                        break;
                    }
                    System.out.println("Точки равны: " + point1.equals(point2));
                    break;
                case 4:
                    System.out.println("Точка 1: " + (point1 != null ? point1 : "не создана"));
                    System.out.println("Точка 2: " + (point2 != null ? point2 : "не создана"));
                    break;
                case 5:
                    Point p1 = new Point(3.5, 2.0);
                    Point p2 = new Point(3.5, 2.0);
                    Point p3 = new Point(1.0, 4.0);
                    System.out.println("p1.equals(p2): " + p1.equals(p2));
                    System.out.println("p1.equals(p3): " + p1.equals(p3));
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неверный выбор!");
            }
        }
    }

    // Вспомогательные методы ввода
    /**
     * Запрашивает у пользователя ввод имени.
     * @return введённое имя
     */
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

    /**
     * Запрашивает у пользователя ввод фамилии.
     * @return введённая фамилия
     */
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

    /**
     * Запрашивает у пользователя ввод отчества.
     * @return введённое отчество
     */
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

    /**
     * Запрашивает у пользователя ввод роста.
     * @return введённый рост
     */
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

    /**
     * Запрашивает у пользователя ввод названия отдела.
     * @return введённое название отдела
     */
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