package Unit4_Iteration;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int randomNum = (int)(Math.random() * 10) + 1;
        boolean isDone = false;

        while (!isDone){
            System.out.println("Guess a number from 1-10:");
            int guess = input.nextInt();
            input.nextLine();
            if (guess == randomNum) {
                System.out.println("Congrats! You guessed the number " + randomNum + " in " + count);
                isDone = true;
            }
            else{
                count ++;
            }
        }
    }
}
