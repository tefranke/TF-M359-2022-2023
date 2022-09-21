package Unit2_Objects;

public class WrapperExample {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);

        // Create a wrapped integer
        Integer wrappedInt = new Integer(7);
        Integer wrappedInt2 = 8;

        System.out.println(wrappedInt);
        System.out.println(wrappedInt2.intValue());

        // Create a wrapped double
        Double doubleVal = 7.5;
        System.out.println(doubleVal);

        // Display mn/max values for int
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);


    }
}
