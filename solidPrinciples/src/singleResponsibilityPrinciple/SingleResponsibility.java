package singleResponsibilityPrinciple;

import singleResponsibilityPrinciple.withSRP.employeeMS.EmployeeDAO;
import singleResponsibilityPrinciple.withSRP.employeeMS.Employee;

public class SingleResponsibility {
    public static void main(String args[]){
        Employee employee=new Employee(1,"mohammad","it",true);
        EmployeeDAO.saveEmployeeToDatabase(employee);
    }
}
