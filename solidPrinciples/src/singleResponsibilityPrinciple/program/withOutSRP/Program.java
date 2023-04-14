package singleResponsibilityPrinciple.program.withOutSRP;
import java.util.Scanner;
public class Program {
   static Scanner scanner=new Scanner(System.in);
    public static void main(String arg[]){
        System.out.println("Welcome to my application!");

        Person user=new Person();
        System.out.print("what is your first name: ");
        user.setFirstName(scanner.nextLine());
        System.out.print("what is your last name: ");
        user.setLastName(scanner.nextLine());

        if (user.getFirstName().isEmpty()){
            System.out.println("You did not give us a valid first name");
            return;
        }
        if (user.getLastName().isEmpty()){
            System.out.println("You did not give us a valid last name");
            return;
        }
        System.out.println("Your username is "+
                user.getFirstName()+" "+user.getLastName()    );
    }
}
