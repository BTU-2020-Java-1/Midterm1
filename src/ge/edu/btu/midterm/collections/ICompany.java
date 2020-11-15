package ge.edu.btu.midterm.collections;

import java.util.Map;

public interface ICompany {

    void initCompany();

    void addEmployee(EmployeeType type, Employee employee);

    Map<EmployeeType, Double> getAverageSalaries();

    void printInfo();
}
