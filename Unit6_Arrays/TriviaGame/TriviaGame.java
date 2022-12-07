package Unit6_Arrays.TriviaGame;

public class TriviaGame {
    private String theme;
    private int numQuestions;
    private Question[] questionArray;
    private int totalPoints;
    private int numCorrect;

    // Full Constructor
    public TriviaGame(String theme, int numQuestions, Question[] questionArray,
                      int totalPoints, int numCorrect) {
        this.theme = theme;
        this.numQuestions = numQuestions;
        this.questionArray = questionArray;
        this.totalPoints = totalPoints;
        this.numCorrect = numCorrect;
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

    public void loadFile(String fileName){
        for(int i = 0; i < numQuestions; i++){
            questionArray[i] = new Question(questionArray[i].getQuestion(), questionArray[i].getPointVal(),
                    questionArray[i].getOptionA(), questionArray[i].getOptionB(), questionArray[i].getOptionC(),
                    questionArray[i].getOptionD(), questionArray[i].getAnswer());
        }
    }
}
