package singleResponsibilityPrinciple.employeeMS.withOutSRP;

public class Employee {
    private long id;
    private String name;
    private String department;
    private boolean working;

    public void saveEmployeeToDatabase(){
        System.out.println("Done to save employee in database");
    }
    public void printEmployeeDetailReportXML(){
        System.out.println("XML report employee");
    }
    public void printEmployeeDetailReportCSV(){
        System.out.println("CSV report employee");
    }
    public void terminateEmployee(){
        System.out.println("terminateEmployee");
    }
}
