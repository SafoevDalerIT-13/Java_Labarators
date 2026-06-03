/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию.
2. Порядок: поля → конструкторы → геттеры/сеттеры → методы.
3. Использован getDepartmentName() вместо getName1().
*/
package ru.safoev.fix;

import java.util.List;

/**
 * Представляет сотрудника организации, привязанного к отделу.
 */
public class Employee {
    /** Имя сотрудника */
    private String name;
    /** Отдел, в котором работает сотрудник */
    private Department department;

    /**
     * Создаёт сотрудника без имени и отдела.
     */
    public Employee() {
        this.name = null;
        this.department = null;
    }

    /**
     * Создаёт сотрудника с именем и отделом.
     * Автоматически добавляет сотрудника в список отдела.
     * @param name имя сотрудника
     * @param department отдел
     */
    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
        if (department != null) {
            department.addEmployee(this);
        }
    }

    /**
     * Возвращает имя сотрудника.
     * @return имя
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает имя сотрудника.
     * @param name новое имя
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает список всех сотрудников отдела.
     * @return список сотрудников отдела
     */
    public List<Employee> getAllDepartmentEmployees() {
        return department.getEmployees();
    }

    /**
     * Возвращает строковое представление: имя, отдел и руководитель.
     * @return строковое представление сотрудника
     */
    @Override
    public String toString() {
        String managerName = (department != null && department.getManager() != null)
                ? department.getManager().getName() : "не назначен";
        String departmentName = (department != null) ? department.getDepartmentName() : "не указан";
        return name + " работает в отделе " + departmentName + ", начальник которого " + managerName;
    }
}