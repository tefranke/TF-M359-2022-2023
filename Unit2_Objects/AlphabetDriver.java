package Unit2_Objects;

public class AlphabetDriver {
    public static void main(String[] args) {

        Alphabet english = new Alphabet("abcdefghijklmnopqrstuvwxyz");

        System.out.println(english.getCharNum('c'));

        System.out.println(english.getRandomLetter());
    }
}
