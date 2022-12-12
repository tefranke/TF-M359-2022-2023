package Unit6_Arrays.TriviaGame;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        TriviaGame myGame = new TriviaGame();
        myGame.loadFile("swimming.txt");
        Question[] qArr = myGame.getQuestionArray();
        String indexes = "";

        System.out.println("State your name: ");
        String userName = input.nextLine();
        System.out.println("Okay " + userName + ". You will now begin a " + myGame.getTheme() + " trivia game");

        for(int i = 0; i < qArr.length; i++) {
            int index = (int) (Math.random() * qArr.length);
            if (!indexes.contains(index + ""))
                indexes += "" + index;
            System.out.println(qArr[index]);
            System.out.println("Type your answer (a, b, c, or d): ");
            String userAns = input.nextLine();
            if (myGame.isCorrect(userAns.toLowerCase(), qArr[index])) {
                System.out.println("\nCorrect!");
                myGame.setTotalPoints(myGame.getTotalPoints() + qArr[index].getPointVal());
                myGame.setNumCorrect(myGame.getNumCorrect() + 1);
                myGame.setStreak(myGame.getStreak() + 1);
            } else {
                System.out.println("Incorrect. The correct option was " + qArr[index].getAnswer());
                myGame.setStreak(0);
            }
            myGame.setNumAnswered(myGame.getNumAnswered() + 1);
            System.out.println("Do you want to continue? Y or N");
            userAns = input.nextLine().toLowerCase();
            if(userAns.equals("y"))
                System.out.println(myGame.getStats(false));
            else {
                System.out.println(myGame.getStats(true));
                break;
            }
        }
        System.out.println("Great Job!\n" + myGame.getStats(myGame.getNumAnswered() == myGame.getNumQuestions()));

    }
}
