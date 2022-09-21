package Unit2_Objects;
import java.util.Scanner;


public class ScannerExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user for name
        System.out.println("What is your name?");
        String name = input.nextLine();

        // prompt user for age
        System.out.println("What is your age?");
        int age = input.nextInt();

        // prompt user for GPA
        System.out.println("What is your GPA?");
        double gpa = input.nextDouble();


        // print summary
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your GPA is: " + gpa);
    }
}
