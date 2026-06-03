public class Gun {
    // FIXME: отступ - 2 пробела, нужна табуляция (п.1)
    // Поля
    private int numberOfCartridges;

    // Геттеры и сеттеры - FIXME: должны быть после конструкторов (п.12)
    public int getNumberOfCartridges() {
        return this.numberOfCartridges;
    }

    public void setNumberOfCartridges(int numberOfCartridges) {
        if(numberOfCartridges < 0) {  // FIXME: нет пробела после if (п.3)
            System.out.println("Количество патрон не может быть отрицательным! Установлено значение по умолчанию - 5! ");
            this.numberOfCartridges = 5;
        } else {
            this.numberOfCartridges = numberOfCartridges;
        }
    }

    // Конструкторы
    public Gun() {
        this.numberOfCartridges = 5;
    }

    public Gun(int numberOfCartridges) {
        setNumberOfCartridges(numberOfCartridges);
    }

    // Метод to_string - FIXME: комментарий излишен (п.21)
    @Override
    public String toString() {
        return "Вы создали пистолет с " + this.numberOfCartridges + " патронами";
    }

    // Метод для выстрела - FIXME: комментарий излишен
    public void fire() {
        if(this.numberOfCartridges > 0) {  // FIXME: нет пробела после if (п.3)
            this.numberOfCartridges -= 1;
            System.out.println("Бах!");
        } else {
            System.out.println("Клац!");
        }
    }
}