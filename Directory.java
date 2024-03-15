import java.util.ArrayList;
import java.util.List;

/**
 * Класс справочник сотрудников
 */
public class Directory {

    private List<Employee> employees;

    public Directory() {
        this.employees = new ArrayList<>();
    }

    /**
     * Метод для поиска сотрудников по стажу
     * @param experience стаж сотрудника
     * @return список сотрудников с указанным стажем
     */
    public List<Employee> findEmployeeByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                result.add(employee);
            }
        }
        return result;
    }

    /**
     * Метод для получения номера телефона сотрудника по имени
     * @param name имя сотрудника
     * @return номер телефона сотрудника
     */
    public String getPhoneNumberByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee.getPhoneNumber();
            }
        }
        return null;
    }

    /**
     * Метод для поиска сотрудника по табельному номеру
     * @param employeeId табельный номер сотрудника
     * @return найденный сотрудник или null, если не найден
     */
    public Employee findEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    /**
     * Метод для добавления нового сотрудника в справочник
     * @param employee новый сотрудник
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    /**
     * Метод для вывода информации о всех сотрудниках
     */
    public void displayAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}