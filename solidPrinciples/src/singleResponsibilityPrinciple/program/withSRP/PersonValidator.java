package singleResponsibilityPrinciple.program.withSRP;

public class PersonValidator {
    public static boolean validator(Person user){
        if (user.getFirstName().isEmpty()){
            StanderMassage.DisplayValidationError("username");
            return false;
        }
        if (user.getLastName().isEmpty()){
            StanderMassage.DisplayValidationError("lastname");
            return false;
        }
        return true;
    }
}
