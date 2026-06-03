package fix;

/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию (п.1)
2. Поля переименованы: lastname → lastName, firstname → firstName, surname → patronymic (п.8, п.9)
3. Метод toString1 переименован в toStringAlternative (п.7 - PascalCase)
4. Порядок методов: конструкторы → геттеры/сеттеры → toString → toStringAlternative (п.12)
5. Убраны излишние комментарии (п.21)
*/

public class Name {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Name() {
        this.lastName = null;
        this.firstName = null;
        this.patronymic = null;
    }

    public Name(String firstName) {
        this.firstName = firstName;
    }

    public Name(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Name(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        String result = "";

        if (this.lastName != null && !this.lastName.isEmpty()) {
            result = this.lastName;
        }

        if (this.firstName != null && !this.firstName.isEmpty()) {
            if (result.isEmpty()) {
                result = this.firstName;
            } else {
                result += " " + this.firstName;
            }
        }

        if (this.patronymic != null && !this.patronymic.isEmpty()) {
            if (result.isEmpty()) {
                result = this.patronymic;
            } else {
                result += " " + this.patronymic;
            }
        }

        return result;
    }

    public String toStringAlternative() {
        String result = "";

        if (this.firstName != null && !this.firstName.isEmpty()) {
            result = this.firstName;
        }

        if (this.patronymic != null && !this.patronymic.isEmpty()) {
            if (result.isEmpty()) {
                result = this.patronymic;
            } else {
                result += " " + this.patronymic;
            }
        }

        if (this.lastName != null && !this.lastName.isEmpty()) {
            if (result.isEmpty()) {
                result = this.lastName;
            } else {
                result += " " + this.lastName;
            }
        }

        return result;
    }
}