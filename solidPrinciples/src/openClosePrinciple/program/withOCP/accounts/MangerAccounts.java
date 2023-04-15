package openClosePrinciple.program.withOCP.accounts;

import openClosePrinciple.program.withOCP.applicants.EmployeeModel;
import openClosePrinciple.program.withOCP.applicants.IApplicantsModel;

public class MangerAccounts extends AccountProcess implements IAccounts {
    @Override
    public EmployeeModel Create(IApplicantsModel person) {
        EmployeeModel employeeModel=process(person,"@mohammadh.com");
        employeeModel.setManager(true);
        return employeeModel;
    }
}
