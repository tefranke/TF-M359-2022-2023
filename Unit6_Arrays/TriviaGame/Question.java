package Unit6_Arrays.TriviaGame;

public class Question {
    private String question;
    private int pointVal;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;

    // Full Constructor
    public Question(String question, int pointVal, String optionA, String optionB,
                    String optionC, String optionD, String answer) {
        this.question = question;
        this.pointVal = pointVal;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answer = answer;
    }

    // Getters and Setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getPointVal() {
        return pointVal;
    }

    public void setPointVal(int pointVal) {
        this.pointVal = pointVal;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * The toString method properly formats a question and returns it
     * @return a properly formatted question
     */
    public String toString(){
        String output = question + " (" + pointVal + " points)\n";
        output += optionA + "\n";
        output += optionB + "\n";
        output += optionC + "\n";
        output += optionD + "\n";
        return output;
    }
}
