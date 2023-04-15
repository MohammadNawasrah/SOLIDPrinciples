package openClosePrinciple.program.withOCP.main;


import openClosePrinciple.program.withOCP.MangerModel;
import openClosePrinciple.program.withOCP.applicants.ApplicantsModel;
import openClosePrinciple.program.withOCP.applicants.EmployeeModel;
import openClosePrinciple.program.withOCP.applicants.IApplicantsModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String arg[]) {
        List<IApplicantsModel> applicants = Arrays.asList(
                new ApplicantsModel("Mohammad", "Nawasrah"),
                new MangerModel("Ahmad", "Nawasrah"),
                new MangerModel("Mazen", "Nawasrah")
        );
        List<EmployeeModel> employees = new ArrayList<EmployeeModel>();
        for (IApplicantsModel person : applicants) {
            employees.add(person.getIAccounts().Create(person));
        }
        for (EmployeeModel emp : employees) {
            System.out.println(emp.getFirstName() + " " + emp.getLastName() + " : " + emp.getEmailAddress() +
                    ", Is manager a : "+emp.isManager()+", Is executive :"+emp.isExecutive());
        }
    }
}
