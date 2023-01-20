package Unit7_ArrayLists.Examples;

public class Notes_7_3_TryCatch {
    public static void main(String[] args) {
        int[] myNums = {1,2,3,4};
        String str = "hello world";

        try{
            // int x = 5/0;
            // System.out.println("The last value is: " + myNums[4]);
            System.out.println(str.substring(5,20));
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("String index out of bounds");
        }
        catch(Exception e){
            System.out.println("Something went wrong, had to quit");
        }
    }
}
