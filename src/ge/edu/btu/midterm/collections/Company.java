package ge.edu.btu.midterm.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company implements ICompany {

    private String name;

    private Map<EmployeeType, List<Employee>> employeesMap = new HashMap<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void initCompany() {
        for (EmployeeType type : EmployeeType.values()) {
            employeesMap.put(type, new ArrayList<>());
        }
    }

    @Override
    public void addEmployee(EmployeeType type, Employee employee) {
        employeesMap.get(type).add(employee);
    }

    @Override
    public Map<EmployeeType, Double> getAverageSalaries() {
        Map<EmployeeType, Double> averageSalaries = new HashMap<>();
        for (EmployeeType type : employeesMap.keySet()) {
            List<Employee> employees = employeesMap.get(type);
            double sum = 0.0;
            double average = 0.0;
            for (Employee employee : employees) {
                sum = sum + employee.getSalary();
            }
            if (!employees.isEmpty()) {
                average = sum / employees.size();
            }
            averageSalaries.put(type, average);
        }
        return averageSalaries;
    }

    @Override
    public void printInfo() {
        for (EmployeeType type : employeesMap.keySet()) {
            System.out.println(type);
            for (Employee employee : employeesMap.get(type)) {
                System.out.println(employee);
            }
        }
    }
}
