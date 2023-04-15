package singleResponsibilityPrinciple.program.withSRP;

public class AccountGenerator {
    public static void createAccount(Person user){
        System.out.println(
        "Your username is " +
                user.getFirstName() +
                " " + user.getLastName());
    }
}
