package openClosePrinciple.program.withOCP.applicants;

import openClosePrinciple.program.withOCP.accounts.ExecutiveAccount;
import openClosePrinciple.program.withOCP.accounts.IAccounts;

public class ExecutiveModel implements IApplicantsModel {
    private String firstName;
    private String lastName;
    IAccounts iAccounts=new ExecutiveAccount();

    public ExecutiveModel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public IAccounts getIAccounts() {
        return iAccounts;
    }
}
