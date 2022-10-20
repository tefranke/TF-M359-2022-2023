package Unit4_Iteration;

public class DebuggerNotes {
    public static void main(String[] args) {
        int x = 5;
        int y = x + 2;

        for(int i = 0; i < 5; i++){
            System.out.print(i);
            outputBreak();
        }
    }
    public static void outputBreak(){
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
