package week3OOP.employee;

import java.util.ArrayList;
import java.util.List;

public class Company {

    public static void main(String[] args) {

        Employee pracownik1 = new Employee("Jan", "Kowalski" , 1992, 3, 1000);
        Employee pracownik2 = new Employee("Bob", "Dukket" , 1989, 5, 2500);
        Employee pracownik3 = new Employee("Tom", "Bread" , 1990, 2, 4500);

        pracownik1.setCompany("Astra");
        pracownik2.setCompany("Signum");
        pracownik3.setCompany("Konsberg");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(pracownik1);
        employeeList.add(pracownik2);
        employeeList.add(pracownik3);

        Employee.showInfo(employeeList);
        Employee.sumSalary(employeeList);
    }
}
