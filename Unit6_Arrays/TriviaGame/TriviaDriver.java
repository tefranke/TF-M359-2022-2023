package Unit6_Arrays.TriviaGame;

import Unit6_Arrays.CourseEx.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TriviaDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in)
        File myFile = new File("swimming.txt");
        Scanner fileIn = new Scanner(myFile);

        // The first line says the theme of the class
        String theme = fileIn.nextLine();       // swimming

        // The second line says how many questions are in the class
        int numQuestions = fileIn.nextInt();     // 12
        fileIn.nextLine();                      // dummy read for newLine

        System.out.println("State your name: ");
        String userName = input.nextLine();
        System.out.println("Okay " + userName + ". You will now begin a " + theme + " trivia game");

        for (int i = 0; i < numQuestions; i++){
            String question = fileIn.nextLine();
            int pointVal = fileIn.nextInt();
            fileIn.nextLine();
            String optionA = fileIn.nextLine();
            String optionB = fileIn.nextLine();
            String optionC = fileIn.nextLine();
            String optionD = fileIn.nextLine();
            String correctOption = fileIn.nextLine();
            
        }
    }
}
