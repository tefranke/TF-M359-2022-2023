package Unit6_Arrays.TriviaGame;

import Unit6_Arrays.CourseEx.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        TriviaGame myGame = new TriviaGame();
        myGame.loadFile("swimming.txt");
        Question[] qArr = myGame.getQuestionArray();




        System.out.println("State your name: ");
        String userName = input.nextLine();
        System.out.println("Okay " + userName + ". You will now begin a " + myGame.getTheme() + " trivia game");

        System.out.println(myGame);
    }
}
