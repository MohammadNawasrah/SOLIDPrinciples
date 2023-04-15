package openClosePrinciple.program.withOCP;

import openClosePrinciple.program.withOCP.accounts.IAccounts;
import openClosePrinciple.program.withOCP.accounts.MangerAccounts;
import openClosePrinciple.program.withOCP.applicants.IApplicantsModel;

public class MangerModel implements IApplicantsModel {
    private String firstName;
    private String lastName;
    IAccounts iAccounts=new MangerAccounts();

    public IAccounts getIAccounts() {
        return iAccounts;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }
    public MangerModel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
