/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию.
2. Поле name1 переименовано в departmentName.
3. В конструкторе по умолчанию employees = new ArrayList<>().
4. Порядок: поля → конструкторы → геттеры/сеттеры → методы.
*/
package ru.safoev.fix;

import java.util.ArrayList;
import java.util.List;

/**
 * Представляет отдел организации, содержащий сотрудников и руководителя.
 */
public class Department {
    /** Название отдела */
    private String departmentName;
    /** Руководитель отдела */
    private Employee manager;
    /** Список сотрудников отдела */
    private List<Employee> employees;

    /**
     * Создаёт пустой отдел без названия, руководителя и сотрудников.
     */
    public Department() {
        this.departmentName = null;
        this.manager = null;
        this.employees = new ArrayList<>();
    }

    /**
     * Создаёт отдел с указанным названием.
     * @param departmentName название отдела
     */
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.manager = null;
        this.employees = new ArrayList<>();
    }

    /**
     * Возвращает название отдела.
     * @return название отдела
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Возвращает руководителя отдела.
     * @return руководитель или null
     */
    public Employee getManager() {
        return manager;
    }

    /**
     * Устанавливает руководителя отдела.
     * @param manager сотрудник-руководитель
     */
    public void setManager(Employee manager) {
        this.manager = manager;
    }

    /**
     * Добавляет сотрудника в отдел, если он ещё не добавлен.
     * @param employee сотрудник для добавления
     */
    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    /**
     * Возвращает копию списка сотрудников отдела.
     * @return список сотрудников
     */
    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    /**
     * Возвращает название отдела.
     * @return название отдела
     */
    @Override
    public String toString() {
        return departmentName;
    }
}