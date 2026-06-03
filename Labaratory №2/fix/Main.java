package fix;

/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию (п.1)
2. Удалён неиспользуемый импорт java.util.List (п.17)
3. Исправлен вызов метода menu() (метод переименован в Menu в классе MenuAndValidator)
*/

public class Main {
    public static void main(String[] args) {
        MenuAndValidator menu = new MenuAndValidator();
        menu.Menu();
    }
}
