package singleResponsibilityPrinciple.program.withSRP;

public class StanderMassage {

    public static String getWelcomeMassage() {
        return "Welcome to my application!";
    }
    public static void DisplayValidationError(String fieldName) {
        System.out.println("You did not give us a valid " + fieldName);
    }
}
