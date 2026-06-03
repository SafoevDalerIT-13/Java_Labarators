import java.util.ArrayList;
import java.util.List;

public class Department {

    // FIXME: отступ - 2 пробела, нужна табуляция (п.1)
    // Поля
    private String name1;  // FIXME: имя неинформативное (п.9), лучше departmentName
    private Employee manager;
    private List<Employee> employees;

    //Геттеры и сеттеры - FIXME: нужен пробел после // (п.21), должны быть после конструкторов (п.12)
    public String getName1() {
        return this.name1;
    }

    public Employee getManager() {
        return this.manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    //Конструктор - FIXME: нужен пробел после //
    public Department() {
        this.name1 = null;
        this.manager = null;
        this.employees = null;  // FIXME: лучше new ArrayList<>(), а не null (п.13)
    }

    public Department(String name1) {
        this.name1 = name1;
        this.manager = null;
        this.employees = new ArrayList<>();
    }

    //Метод to_string - FIXME: нужен пробел после //
    @Override
    public String toString() {
        return this.name1;
    }

    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);  // FIXME: хорошо, защитная копия (п.14)
    }

}