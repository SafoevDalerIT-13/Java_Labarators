import java.util.List;

public class Employee {

    // FIXME: отступ - 2 пробела, нужна табуляция (п.1)
    // Поля
    private String name;
    private Department department;

    //Геттеры и сеттеры - FIXME: нужен пробел после // (п.21), должны быть после конструкторов (п.12)
    public String getName() {
        return this.name;
    }
    public void setName(String name) {  // FIXME: нужна пустая строка между методами (читаемость)
        this.name = name;
    }

    //Конструкторы - FIXME: нужен пробел после //
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

    //Метод to_string - FIXME: нужен пробел после //
    @Override
    public String toString() {
        String managerName = (department != null && department.getManager() != null)
                ? department.getManager().getName() : "не назначен";
        String departmentName = (department != null) ? department.getName1() : "не указан";

        return this.name + " работает в отделе " + departmentName
                + ", начальник которого " + managerName;
    }

    // Метод для получение всех сотрудников по ссылке
    public List<Employee> getAllDepartmentEmployees() {
        return department.getEmployees();
    }
}