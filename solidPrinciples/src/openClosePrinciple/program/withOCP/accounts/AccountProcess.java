package openClosePrinciple.program.withOCP.accounts;

import openClosePrinciple.program.withOCP.applicants.EmployeeModel;
import openClosePrinciple.program.withOCP.applicants.IApplicantsModel;

public class AccountProcess {
    public EmployeeModel process(IApplicantsModel person ,String emailAddress) {
        EmployeeModel employeeModel=new EmployeeModel();
        employeeModel.setFirstName(person.getFirstName());
        employeeModel.setLastName(person.getLastName());
        employeeModel.setEmailAddress(person.getFirstName()+person.getFirstName()+emailAddress);
        return employeeModel;
    }
}
