import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();

        Employee emp1 = new Employee(1, "88888", "Алексей", 5);
        Employee emp2 = new Employee(2, "77777", "Мария", 3);
        Employee emp3 = new Employee(3, "12345", "Артём", 4);
        Employee emp4 = new Employee(4, "55555", "Сергей", 7);
        Employee emp5 = new Employee(5, "44444", "Иван", 2);

        directory.addEmployee(emp1);
        directory.addEmployee(emp2);
        directory.addEmployee(emp3);
        directory.addEmployee(emp4);
        directory.addEmployee(emp5);

        System.out.println("Сотрудники с опытом работы 7 лет:");
        List<Employee> employeesWithExperience5 = directory.findEmployeeByExperience(7);
        for(Employee employee : employeesWithExperience5) {
            System.out.println(employee.toString());
        }

        System.out.println("Номер телефона Артёма: " + directory.getPhoneNumberByName("Артём"));

        Employee employeeById = directory.findEmployeeById(1);
        if(employeeById != null) {
            System.out.println("Найден сотрудник: " + employeeById.toString());
        } else {
            System.out.println("Сотрудник не найден");
        }

        System.out.println("Вся информация о сотрудниках:");
        directory.displayAllEmployees();
    }
}