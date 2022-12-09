package Unit6_Arrays.TriviaGame;

import java.io.File;
import java.util.Scanner;

public class TriviaGame {
    private String theme;
    private int numQuestions;
    private Question[] questionArray;
    private int totalPoints;
    private int numCorrect;
    private int myFile;


    // Full Constructor
    public TriviaGame(String theme, int numQuestions, Question[] questionArray,
                      int totalPoints, int numCorrect) {
        this.theme = theme;
        this.numQuestions = numQuestions;
        this.questionArray = questionArray;
        this.totalPoints = totalPoints;
        this.numCorrect = numCorrect;
    }

    public TriviaGame() {
        theme = " ";
        numQuestions = 0;
        questionArray = new Question[1];
        totalPoints = 0;
        numCorrect = 0;
    }

    // Getters and Setters

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    public Question[] getQuestionArray() {
        return questionArray;
    }

    public void setQuestionArray(Question[] questionArray) {
        this.questionArray = questionArray;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getNumCorrect() {
        return numCorrect;
    }

    public void setNumCorrect(int numCorrect) {
        this.numCorrect = numCorrect;
    }

    public void loadFile(String myFile){
        Scanner fileIn = new Scanner(myFile);
        theme = fileIn.nextLine();
        numQuestions = fileIn.nextInt();
        questionArray = new Question[numQuestions];
        fileIn.nextLine();
        for (int i = 0; i < numQuestions; i++){
            String question = fileIn.nextLine();
            int pointVal = fileIn.nextInt();
            fileIn.nextLine();
            String optionA = fileIn.nextLine();
            String optionB = fileIn.nextLine();
            String optionC = fileIn.nextLine();
            String optionD = fileIn.nextLine();
            String correctOption = fileIn.nextLine();
            questionArray[i] = new Question(question, pointVal, optionA, optionB, optionC, optionD, correctOption);
        }
    }

    public String toString(){
        String output = "";
        for(Question a: questionArray){
            output += a.toString();
        }
        return output;
    }
}
