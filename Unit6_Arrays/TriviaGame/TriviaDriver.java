package Unit6_Arrays.TriviaGame;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        // creates a new TriviaGame
        Scanner input = new Scanner(System.in);
        TriviaGame myGame = new TriviaGame();
        myGame.loadFile("swimming.txt");
        Question[] qArr = myGame.getQuestionArray();
        // prompts user for name and introduces the game
        System.out.println("State your name: ");
        String userName = input.nextLine();
        System.out.println("Okay " + userName + ". You will now begin a " + myGame.getTheme() + " trivia game");

        // for loop to run the game
        for(int i = 0; i < 12; i++) {
            int index = (int) (Math.random() * qArr.length);
            System.out.println(qArr[index]);
            System.out.println("Type your answer (a, b, c, or d): ");
            String userAns = input.nextLine();
            // if correct answer then all values are updated
            if (myGame.isCorrect(userAns.toLowerCase(), qArr[index])) {
                System.out.println("\nCorrect!");
                myGame.setTotalPoints(myGame.getTotalPoints() + qArr[index].getPointVal());
                myGame.setNumCorrect(myGame.getNumCorrect() + 1);
                myGame.setStreak(myGame.getStreak() + 1);
                myGame.setPointVal(qArr[index].getPointVal());
            }
            // else some values are updated
            else {
                System.out.println("Incorrect. The correct option was " + qArr[index].getAnswer());
                myGame.setStreak(0);
                myGame.setPointVal(0);
            }
            myGame.setNumAnswered(myGame.getNumAnswered() + 1);
            // prompts user if they want to continue
            if (myGame.getNumAnswered() != myGame.getNumQuestions()) {
                System.out.println("Do you want to continue? Y or N");
                userAns = input.nextLine().toLowerCase();
                // if they do then continue the game
                if (userAns.equals("y"))
                    System.out.println(myGame.getStats(false));
                // else stop the loop
                else {
                    System.out.println(myGame.getStats(true));
                    break;
                }
            }
            // updates array to exclude the used question
            qArr = myGame.newArr(index, qArr);
        }
        // returns stats
        System.out.println("Great Job!\n" + myGame.getStats(myGame.getNumAnswered() == myGame.getNumQuestions()));

    }
}
