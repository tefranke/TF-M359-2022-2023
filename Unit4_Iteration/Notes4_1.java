package Unit4_Iteration;
import java.util.Scanner;

public class Notes4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isDone = false;
        String reply = "";
        int sum = 0;
        int count = 0;


        while (!isDone) {
            // Prompt user if they have a new number to enter
            System.out.println("Do you have a number to enter? (Y or N)");
            reply = input.nextLine();

            if (reply.equalsIgnoreCase("Y")) {
                // prompt user to enter the number
                System.out.println("Enter number: ");
                int number = input.nextInt();

                // must also read in the newline character
                input.nextLine();

                // update your stats
                count++;
                sum += number;
            } else {
                // means they have no new numbers to enter
                isDone = true;
            }
        }


        // IF YOU GET HERE, means we're done putting in #s and can just give summary
        System.out.println("Total sum of all numbers: " + sum);
        System.out.println("Avg of all numbers: " + sum/count);
    }
}
