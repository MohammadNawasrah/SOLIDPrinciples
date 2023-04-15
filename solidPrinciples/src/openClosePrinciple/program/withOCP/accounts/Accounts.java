package openClosePrinciple.program.withOCP.accounts;

import openClosePrinciple.program.withOCP.applicants.EmployeeModel;
import openClosePrinciple.program.withOCP.applicants.IApplicantsModel;

public class Accounts extends AccountProcess implements IAccounts {
    public EmployeeModel Create(IApplicantsModel person) {
       return process(person,"@gmail.com");
    }
}
