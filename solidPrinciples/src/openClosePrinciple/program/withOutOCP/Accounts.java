package openClosePrinciple.program.withOutOCP;

public class Accounts {
    public EmployeeModel Create(PersonModel person){
        EmployeeModel employeeModel=new EmployeeModel();
        employeeModel.setFirstName(person.getFirstName());
        employeeModel.setLastName(person.getLastName());
        employeeModel.setEmailAddress(person.getFirstName()+person.getFirstName()+"@gmail.com");
        return employeeModel;
    }
}
