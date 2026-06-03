package fix;

/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию (п.1)
2. Добавлены пробелы после if (п.3)
3. Порядок методов: конструкторы → геттеры/сеттеры → fire → toString (п.12)
4. numberOfCartridges-- вместо numberOfCartridges -= 1
5. Убраны излишние комментарии (п.21)
*/

public class Gun {
    private int numberOfCartridges;

    public Gun() {
        this.numberOfCartridges = 5;
    }

    public Gun(int numberOfCartridges) {
        setNumberOfCartridges(numberOfCartridges);
    }

    public int getNumberOfCartridges() {
        return this.numberOfCartridges;
    }

    public void setNumberOfCartridges(int numberOfCartridges) {
        if (numberOfCartridges < 0) {
            System.out.println("Количество патрон не может быть отрицательным! Установлено значение по умолчанию - 5! ");
            this.numberOfCartridges = 5;
        } else {
            this.numberOfCartridges = numberOfCartridges;
        }
    }

    public void fire() {
        if (this.numberOfCartridges > 0) {
            this.numberOfCartridges--;
            System.out.println("Бах!");
        } else {
            System.out.println("Клац!");
        }
    }

    @Override
    public String toString() {
        return "Вы создали пистолет с " + this.numberOfCartridges + " патронами";
    }
}