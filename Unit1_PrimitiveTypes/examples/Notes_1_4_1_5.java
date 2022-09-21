package Unit1_PrimitiveTypes.examples;

public class Notes_1_4_1_5 {
    public static void main(String[] args) {
        // 1. Given a decimal number (double), TRUNCATE the decimals
        // (chop them off) and display the resulting whole number
        double width = 12.7391;
        System.out.println("Truncated version: " + (int)width);

        // 2. Given an integer, display it TRUNCATED to the hundreds
        // digit
        int population = 8132789;   // should turn into 8132700
        population = (population / 100) * 100;
        System.out.println("Truncated population is: " + population);
        // or
        // int diff = population % 100;
        // population -= diff;

        // 3. Given a decimal number (double), display it ROUNDED to
        // the nearest integer
        double height = 7.89;
        int roundedHeight = (int)(height + .5);
        System.out.println("Rounded height is: " + roundedHeight);

        // 4. Given an integer, display it ROUNDED to the hundreds digit
        int speed = 16378;  // should display 16400
        speed += 50;
        int roundedSpeed = (speed / 100) * 100;
        System.out.println("Rounded speed is: " + roundedSpeed);
        // or
        // double temp = speed / 100;
        // temp = (int)(temp + .5);
        // temp *= 100;
    }
}
