package ge.edu.btu.midterm.collections;

public class Runner {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Employee 1", 1000);
        Employee employee2 = new Employee("Employee 2", 3000);
        Employee employee3 = new Employee("Employee 3", 2000);
        Employee employee4 = new Employee("Employee 4", 5000);
        Employee employee5 = new Employee("Employee 5", 3000);

        Company company = new Company("Company");
        company.initCompany();

        company.addEmployee(EmployeeType.BACK_END, employee1);
        company.addEmployee(EmployeeType.FRONT_END, employee2);
        company.addEmployee(EmployeeType.FRONT_END, employee3);
        company.addEmployee(EmployeeType.ARCHITECT, employee4);
        company.addEmployee(EmployeeType.BACK_END, employee5);

        System.out.println(company.getAverageSalaries());

        company.printInfo();
    }
}
