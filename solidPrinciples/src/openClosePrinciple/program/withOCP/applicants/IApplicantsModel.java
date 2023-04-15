package openClosePrinciple.program.withOCP.applicants;

import openClosePrinciple.program.withOCP.accounts.IAccounts;

public interface IApplicantsModel {
     String getFirstName();
     String getLastName();
     IAccounts getIAccounts();
}
