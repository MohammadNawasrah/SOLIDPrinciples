package openClosePrinciple.program.withOutOCP;

public class PersonModel {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public PersonModel(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
