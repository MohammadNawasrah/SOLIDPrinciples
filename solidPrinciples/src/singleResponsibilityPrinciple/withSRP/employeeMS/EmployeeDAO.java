package singleResponsibilityPrinciple.withSRP.employeeMS;

public class EmployeeDAO {
    public static void saveEmployeeToDatabase(Employee employee) {
        System.out.println("Done to save "+employee.getName()+" in database ");
    }
}
