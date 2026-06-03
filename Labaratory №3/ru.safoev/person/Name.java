package ru.safoev.person;

public class Name {

    // FIXME: отступ - 4 пробела (п.1)
    // FIXME: поля не в camelCase (п.8): lastname -> lastName, firstname -> firstName, surname -> patronymic
    private final String lastname;
    private final String firstname;
    private final String surname;

    // FIXME: геттеры должны быть после конструкторов (п.12)
    public String getLastname() {
        return this.lastname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getSurname() {
        return this.surname;
    }

    // Конструкторы
    public Name() {
        throw new IllegalArgumentException("Как минимум одно поле должно быть не null и не пустым");
    }

    public Name(String firstname) {
        validateAtLeastOneField(firstname, null, null);
        this.firstname = firstname;
        this.lastname = null;
        this.surname = null;
    }

    public Name(String lastname, String firstname) {
        validateAtLeastOneField(firstname, lastname, null);
        this.lastname = lastname;
        this.firstname = firstname;
        this.surname = null;
    }

    public Name(String lastname, String firstname, String surname) {
        validateAtLeastOneField(firstname, lastname, surname);
        this.lastname = lastname;
        this.firstname = firstname;
        this.surname = surname;
    }

    @Override
    public String toString() {
        String result = "";
        if (this.lastname != null && !this.lastname.isEmpty()) {
            result = this.lastname;
        }
        if (this.firstname != null && !this.firstname.isEmpty()) {
            if (result.isEmpty()) {
                result = this.firstname;
            } else {
                result += " " + this.firstname;
            }
        }
        if (this.surname != null && !this.surname.isEmpty()) {
            if (result.isEmpty()) {
                result = this.surname;
            } else {
                result += " " + this.surname;
            }
        }
        return result;
    }

    // FIXME: метод toString1 - не в PascalCase (п.7), должно быть ToStringAlternative
    public String toString1() {
        String result = "";
        if (this.firstname != null && !this.firstname.isEmpty()) {
            result = this.firstname;
        }
        if (this.surname != null && !this.surname.isEmpty()) {
            if (result.isEmpty()) {
                result = this.surname;
            } else {
                result += " " + this.surname;
            }
        }
        if (this.lastname != null && !this.lastname.isEmpty()) {
            if (result.isEmpty()) {
                result = this.lastname;
            } else {
                result += " " + this.lastname;
            }
        }
        return result;
    }

    private void validateAtLeastOneField(String firstname, String lastname, String surname) {
        boolean hasValidField = false;
        if (firstname != null && !firstname.trim().isEmpty()) hasValidField = true;
        if (lastname != null && !lastname.trim().isEmpty()) hasValidField = true;
        if (surname != null && !surname.trim().isEmpty()) hasValidField = true;
        if (!hasValidField) {
            throw new IllegalArgumentException("Как минимум одно поле должно быть не null и не пустым");
        }
    }
}