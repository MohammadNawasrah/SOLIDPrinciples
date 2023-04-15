package singleResponsibilityPrinciple.employeeMS;

import singleResponsibilityPrinciple.employeeMS.withSRP.EmployeeDAO;
import singleResponsibilityPrinciple.employeeMS.withSRP.Employee;

public class EmployeeMS {
    public static void main(String args[]){
        Employee employee=new Employee(1,"mohammad","it",true);
        EmployeeDAO.saveEmployeeToDatabase(employee);
    }
}
