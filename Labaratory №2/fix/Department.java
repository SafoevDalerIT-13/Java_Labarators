package fix;

/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию (п.1)
2. Поле name1 переименовано в departmentName (п.9 - понятное имя)
3. В конструкторе по умолчанию employees = new ArrayList<>() вместо null (п.13)
4. Порядок методов: конструкторы → геттеры/сеттеры → addEmployee → getEmployees → toString (п.12)
5. Убраны излишние комментарии (п.21)
*/

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private Employee manager;
    private List<Employee> employees;

    public Department() {
        this.departmentName = null;
        this.manager = null;
        this.employees = new ArrayList<>();
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.manager = null;
        this.employees = new ArrayList<>();
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public Employee getManager() {
        return this.manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    @Override
    public String toString() {
        return this.departmentName;
    }
}
