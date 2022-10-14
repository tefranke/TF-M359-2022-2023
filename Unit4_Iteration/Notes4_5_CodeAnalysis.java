package Unit4_Iteration;

public class Notes4_5_CodeAnalysis {
    public static void main(String[] args) {
        outputBreak("Challenge #1: Number Pyramid 1 to 5");
        for (int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        outputBreak("Challenge #2: Number Pyramid 55555 to 1");
        for (int i = 5; i >= 1; i--){
            for(int j = 0; j < i; j++){
                System.out.print(i + "");
            }
            System.out.println();
        }
        outputBreak("Challenge #3: Every other letter pyramid");
        everyOtherLetterPyramid("FremdVikings");
    }

    public static void outputBreak(String title){
        System.out.println();
        System.out.println();
        System.out.println(title);
        System.out.println();
    }

    // Print every other letter of input string str
    public static void everyOtherLetterPyramid(String str){
        String origStr = str;
        System.out.println(origStr);

        while (origStr.length() > 1){
            String output = "";

            for(int i = 0; i < origStr.length(); i += 2){
                output += origStr.charAt(i);
            }
            System.out.println(output);
            origStr = output;
        }
    }
}
