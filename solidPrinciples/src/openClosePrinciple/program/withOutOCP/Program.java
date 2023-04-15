package openClosePrinciple.program.withOutOCP;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String arg[]) {
        List<PersonModel> applicants = Arrays.asList(
                new PersonModel("Mohammad", "Nawasrah"),
                new PersonModel("Ahmad", "Nawasrah"),
                new PersonModel("Mazen", "Nawasrah")
        );
        List<EmployeeModel> employees = new ArrayList<EmployeeModel>();
        Accounts accountProcessor = new Accounts();
        for (PersonModel person : applicants) {
            employees.add(accountProcessor.Create(person));
        }
        for (EmployeeModel emp : employees) {
            System.out.println(emp.getFirstName() + " " + emp.getLastName() + " : " + emp.getEmailAddress());
        }
    }
}
