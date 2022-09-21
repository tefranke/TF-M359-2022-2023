package Unit2_Objects;

public class Alphabet {
    private String letters;

    public Alphabet(String inLetters){
        letters = inLetters;

    }
    public int getCharNum(char input){

        return letters.indexOf(input)+1;

    }
    public String getRandomLetter(){
        int randomNum = (int)(Math.random()*letters.length());
        return letters.substring(randomNum,randomNum+1);
    }
}
