package Unit6_Arrays.TriviaGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriviaGame {
    // instance variables
    private String theme;
    private int numQuestions;
    private Question[] questionArray;
    private int totalPoints;
    private int numCorrect;
    private int streak;
    private int pointVal;
    private int numAnswered;

    // default constructor
    public TriviaGame() {
        theme = "";
        numQuestions = 0;
        questionArray = new Question[12];
        totalPoints = 0;
        numCorrect = 0;
        streak = 0;
        numAnswered = 0;
        pointVal = 0;
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

    public int getStreak() {
        return streak;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public int getPointVal() {
        return pointVal;
    }

    public void setPointVal(int pointVal) {
        this.pointVal = pointVal;
    }

    public int getNumAnswered() {
        return numAnswered;
    }

    public void setNumAnswered(int numAnswered) {
        this.numAnswered = numAnswered;
    }

    /**
     * This method loads the file into a new question array to create a new TriviaGame
     * @param myFile takes in the file to create a TriviaGame with the file
     * @throws FileNotFoundException
     */
    public void loadFile(String myFile) throws FileNotFoundException {
        File qFile = new File(myFile);
        Scanner fileIn = new Scanner(qFile);
        theme = fileIn.nextLine();
        numQuestions = fileIn.nextInt();
        fileIn.nextLine();
        for (int i = 0; i < numQuestions; i++){
            String question = fileIn.nextLine();
            pointVal = fileIn.nextInt();
            fileIn.nextLine();
            String optionA = fileIn.nextLine();
            String optionB = fileIn.nextLine();
            String optionC = fileIn.nextLine();
            String optionD = fileIn.nextLine();
            String correctOption = fileIn.nextLine();
            Question curQ = new Question(question, pointVal, optionA, optionB, optionC, optionD, correctOption);
            questionArray[i] = curQ;
        }
    }

    /**
     * This method takes in the user answer and the question answered and determines if the given answer is correct
     * @param answer takes the user's answer to the question
     * @param curQ takes the question that the user answered
     * @return a boolean that is true if the question was answered correctly and false if the question wasn't
     */
    public boolean isCorrect(String answer, Question curQ){
        return answer.equals(curQ.getAnswer());
    }

    /**
     * This method returns the general statistics after each question(if the user will continue) or the
     * final statistics (if the user doesn't wish to continue or is done with the quiz)
     * @param isDone is a boolean that says whether the user is done with the trivia game or not
     * @return a String that shows the user's statistics for the current game
     */
    public String getStats(boolean isDone){
        String output;
        if(!isDone)
            output = "Current Stats:\n";
        else
            output = "Congrats! Here Are Your Final Stats:\n";

        output += "Answer Streak: " + streak;
        output += "\nPoints Gained: " + pointVal;
        output += "\nTotal Points: " + totalPoints;
        output += "\nAnswered Questions: " + numAnswered;
        output += "\nCorrectly Answered Questions: " + numCorrect;
        if(isDone)
            output += "\nGrade: " + ((double)numCorrect/numAnswered) * 100 + "%";
        return output;
    }

    /**
     * This method creates a new array that excludes the questions that have already been used
     * @param index is the index of the question that has been used
     * @param qArr is the array that contains all remaining questions + the question that was just used
     * @return newArr which is a new Array that excludes the previously used question
     */
    public Question[] newArr(int index, Question[] qArr) {
        int count = 0;
        Question[] newArr = new Question[qArr.length - 1];
        for (int i = 0; i <= newArr.length; i++) {
            if (i != index) {
                newArr[count] = qArr[i];
                count++;
            }
        }
        return newArr;
    }
}
