/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию.
2. Поля переименованы: lastname -> lastName, firstname -> firstName, surname -> patronymic.
3. Геттеры перенесены после конструкторов.
4. Метод toString1 переименован в ToStringAlternative.
5. Убраны излишние комментарии.
*/
package ru.safoev.fix;

/**
 * Представляет имя человека, состоящее из фамилии, имени и отчества.
 * Гарантирует, что хотя бы одно поле не null и не пустое.
 * Объект неизменяем (immutable).
 */
public class Name {
    /** Фамилия */
    private final String lastName;
    /** Имя */
    private final String firstName;
    /** Отчество */
    private final String patronymic;

    /**
     * Запрещён — выбрасывает исключение. Используйте конструкторы с параметрами.
     * @throws IllegalArgumentException всегда
     */
    public Name() {
        throw new IllegalArgumentException("Как минимум одно поле должно быть не null и не пустым");
    }

    /**
     * Создаёт имя только с личным именем.
     * @param firstName личное имя
     * @throws IllegalArgumentException если firstName null или пусто
     */
    public Name(String firstName) {
        validateAtLeastOneField(firstName, null, null);
        this.firstName = firstName;
        this.lastName = null;
        this.patronymic = null;
    }

    /**
     * Создаёт имя с фамилией и личным именем.
     * @param lastName фамилия
     * @param firstName личное имя
     * @throws IllegalArgumentException если все поля null или пусты
     */
    public Name(String lastName, String firstName) {
        validateAtLeastOneField(firstName, lastName, null);
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = null;
    }

    /**
     * Создаёт полное имя с фамилией, личным именем и отчеством.
     * @param lastName фамилия
     * @param firstName личное имя
     * @param patronymic отчество
     * @throws IllegalArgumentException если все поля null или пусты
     */
    public Name(String lastName, String firstName, String patronymic) {
        validateAtLeastOneField(firstName, lastName, patronymic);
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    /**
     * Возвращает фамилию.
     * @return фамилия или null
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Возвращает личное имя.
     * @return имя или null
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Возвращает отчество.
     * @return отчество или null
     */
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * Форматирует имя в порядке: Фамилия Имя Отчество (пропуская null/пустые).
     * @return строковое представление
     */
    @Override
    public String toString() {
        String result = "";
        if (lastName != null && !lastName.isEmpty()) {
            result = lastName;
        }
        if (firstName != null && !firstName.isEmpty()) {
            if (result.isEmpty()) {
                result = firstName;
            } else {
                result += " " + firstName;
            }
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            if (result.isEmpty()) {
                result = patronymic;
            } else {
                result += " " + patronymic;
            }
        }
        return result;
    }

    /**
     * Альтернативное форматирование в порядке: Имя Отчество Фамилия.
     * @return альтернативное строковое представление
     */
    public String ToStringAlternative() {
        String result = "";
        if (firstName != null && !firstName.isEmpty()) {
            result = firstName;
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            if (result.isEmpty()) {
                result = patronymic;
            } else {
                result += " " + patronymic;
            }
        }
        if (lastName != null && !lastName.isEmpty()) {
            if (result.isEmpty()) {
                result = lastName;
            } else {
                result += " " + lastName;
            }
        }
        return result;
    }

    /**
     * Проверяет, что хотя бы одно поле не null и не пусто.
     * @param firstName личное имя
     * @param lastName фамилия
     * @param patronymic отчество
     * @throws IllegalArgumentException если все поля null или пусты
     */
    private void validateAtLeastOneField(String firstName, String lastName, String patronymic) {
        boolean hasValidField = false;
        if (firstName != null && !firstName.trim().isEmpty()) hasValidField = true;
        if (lastName != null && !lastName.trim().isEmpty()) hasValidField = true;
        if (patronymic != null && !patronymic.trim().isEmpty()) hasValidField = true;
        if (!hasValidField) {
            throw new IllegalArgumentException("Как минимум одно поле должно быть не null и не пустым");
        }
    }
}