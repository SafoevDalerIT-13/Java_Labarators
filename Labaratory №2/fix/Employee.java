package fix;

/*
ИСПРАВЛЕНИЯ:
1. Отступы заменены на табуляцию (п.1)
2. Добавлена пустая строка между методами getName и setName (читаемость)
3. Порядок методов: конструкторы → геттеры → getAllDepartmentEmployees → toString (п.12)
4. Убраны излишние комментарии (п.21)
*/

import java.util.List;

public class Employee {
    private String name;
    private Department department;

    public Employee() {
        this.name = null;
        this.department = null;
    }

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
        if (department != null) {
            department.addEmployee(this);
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getAllDepartmentEmployees() {
        return department.getEmployees();
    }

    @Override
    public String toString() {
        String managerName = (department != null && department.getManager() != null)
                ? department.getManager().getName() : "не назначен";
        String departmentName = (department != null) ? department.getDepartmentName() : "не указан";

        return this.name + " работает в отделе " + departmentName
                + ", начальник которого " + managerName;
    }
}
