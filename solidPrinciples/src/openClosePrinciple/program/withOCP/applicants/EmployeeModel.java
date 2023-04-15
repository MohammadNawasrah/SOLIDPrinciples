package openClosePrinciple.program.withOCP.applicants;

public class EmployeeModel {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private boolean isManager = false;

    public boolean isExecutive() {
        return isExecutive;
    }

    public void setExecutive(boolean executive) {
        isExecutive = executive;
    }

    private boolean isExecutive = false;

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
