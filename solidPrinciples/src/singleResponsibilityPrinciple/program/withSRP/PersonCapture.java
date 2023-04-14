package singleResponsibilityPrinciple.program.withSRP;

import java.util.Scanner;

public class PersonCapture {
    public static Person capture() {
        Scanner scanner = new Scanner(System.in);
        Person user = new Person();
        System.out.print("what is your first name: ");
        user.setFirstName(scanner.nextLine());
        System.out.print("what is your last name: ");
        user.setLastName(scanner.nextLine());
        return user;
    }
}
