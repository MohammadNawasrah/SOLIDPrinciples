package openClosePrinciple.program.withOCP.applicants;

import openClosePrinciple.program.withOCP.accounts.Accounts;
import openClosePrinciple.program.withOCP.accounts.IAccounts;

public class ApplicantsModel implements IApplicantsModel {
    private String firstName;
    private String lastName;

     IAccounts iAccounts=new Accounts();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public IAccounts getIAccounts() {
        return this.iAccounts;
    }

    public ApplicantsModel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
