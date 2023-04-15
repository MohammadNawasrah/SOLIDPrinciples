package openClosePrinciple.program.withOCP.accounts;

import openClosePrinciple.program.withOCP.applicants.EmployeeModel;
import openClosePrinciple.program.withOCP.applicants.IApplicantsModel;

public class ExecutiveAccount extends AccountProcess implements IAccounts {
    @Override
    public EmployeeModel Create(IApplicantsModel person) {
        EmployeeModel employeeModel=process(person,"@yahoo.com");
        employeeModel.setManager(true);
        employeeModel.setExecutive(true);
        return employeeModel;
    }
}
