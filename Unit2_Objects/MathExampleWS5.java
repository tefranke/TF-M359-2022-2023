package Unit2_Objects;
import java.util.Scanner;


public class MathExampleWS5 {
    /*
     *   Tyler Franke
     *   Mr. Moon - 5th Period
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Part 1

        // prompt user for coords
        System.out.println("Enter x1: ");
        int x1 = input.nextInt();

        System.out.println("Enter y1: ");
        int y1 = input.nextInt();

        System.out.println("Enter x2: ");
        int x2 = input.nextInt();

        System.out.println("Enter y2: ");
        int y2 = input.nextInt();

        // prints distance
        double dist = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is "
                + dist); // could also do Math.pow(x1-x2, 2) for squaring


        // Part 2

        // prompt for max/min
        System.out.println("\n\nEnter max: ");
        int max = input.nextInt();

        System.out.println("Enter min: ");
        int min = input.nextInt();

        // display random number between max and min
        int randomNum = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println("A random integer between " + max + " and " + min + " is: " + randomNum);


        // Part 3

        int absValue = Math.abs(-7);
        System.out.println("\n\nAbsolute value of -7: " + absValue);

        double secondPower = Math.pow(5, 2);
        System.out.println("The second power of 5 is: " + secondPower);

        int maximum = Math.max(1, 21);
        System.out.println("The maximum value on the range (1, 21) is: " + maximum);

        int minimum = Math.min(1, 21);
        System.out.println("The minimum value on the range (1, 21) is: " + minimum);
    }
}
