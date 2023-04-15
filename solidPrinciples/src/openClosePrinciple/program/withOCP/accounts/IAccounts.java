package openClosePrinciple.program.withOCP.accounts;

import openClosePrinciple.program.withOCP.applicants.EmployeeModel;
import openClosePrinciple.program.withOCP.applicants.IApplicantsModel;

public interface IAccounts {
    EmployeeModel Create(IApplicantsModel person);
}
