package Unit4_Iteration.PigLatinLab;

import java.util.Locale;

public class PigLatin {
    /**
     * Static method startsWithVowel takes a phrase and returns whether that phrase starts with a vowel
     * @param word1 takes a parameter of a single word to determine if the first letter is a vowel
     * @return
     */
    public static boolean startsWithVowel(String word1){
        String vowels = "aeiou";
        // sees if first letter is vowel
        return vowels.contains(word1.substring(0,1));
    }

    /**
     * Static method secondIsVowel takes a phrase and returns whether that phrase has a second letter of a vowel
     * @param word2 takes the parameter of a word to determine if the second letter is a vowel
     * @return
     */
    public static boolean secondIsVowel(String word2){
        String vowels = "aeiou";
        // sees if second letter is vowel
        return vowels.contains(word2.substring(1,2));
    }

    /**
     * Static method translateWordToPigLatin takes a word and returns a translation of that word to pig latin
     * @param oneWord takes the parameter of a word without a space to translate to pig latin
     * @return
     */
    public static String translateWordToPigLatin(String oneWord){
        // if first letter is vowel, add "yay" to the end of phrase
        if (startsWithVowel(oneWord)){
            return oneWord + "yay";
        }
        // if second letter is vowel, moves first letter to the end and adds "ay" at the end
        else if (secondIsVowel(oneWord)){
            return oneWord.substring(1, oneWord.length()) + oneWord.substring(0,1) + "ay";
        }
        // if third letter is vowel, moves first two letters to the end and adds "ay" at the end
        else {
            return oneWord.substring(2, oneWord.length()) + oneWord.substring(0,2) + "ay";
        }
    }

    /**
     * Static method toPigLatin takes a sentence and returns a translation of that sentence to pig latin
     * @param phrase takes the parameter of a sentence to return in pig latin
     * @return
     */
    public static String toPigLatin(String phrase){
        String pigLatin = "";
        // changes sentence to all lower case so capitals don't get put in the middle of words
        phrase = phrase.toLowerCase();
        // while there are still spaces, the loop converts the word before the space to pig latin and then changes the
        // sentence to exclude the first word and the space after
        while (phrase.indexOf(" ") > -1){
            String pigLatin1 = phrase.substring(0, phrase.indexOf(" "));
            pigLatin += translateWordToPigLatin(pigLatin1) + " ";
            phrase = phrase.substring(phrase.indexOf(" ") + 1);
        }
        // after the while loop the last word is still left because there is no space after it
        // the last word is converted to pig latin and the converted sentence is stored in the variable pigLatin
        pigLatin += translateWordToPigLatin(phrase);
        // first letter of the sentence is changed to a capital letter
        String firstLetter = pigLatin.substring(0,1).toUpperCase();
        pigLatin = firstLetter + pigLatin.substring(1);
        return pigLatin;
    }
}
