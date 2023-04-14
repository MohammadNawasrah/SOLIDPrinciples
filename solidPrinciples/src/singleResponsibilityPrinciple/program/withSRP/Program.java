package singleResponsibilityPrinciple.program.withSRP;

public class Program {

    public static void main(String arg[]) {
        StanderMassage.getWelcomeMassage();
        Person user=PersonCapture.capture();
        boolean valid = PersonValidator.validator(user);
        if (valid==false){
            return;
        }
        AccountGenerator.createAccount(user);
    }
}
