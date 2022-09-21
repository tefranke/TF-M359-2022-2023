package Unit1_PrimitiveTypes.examples;

public class Examples_1_3 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // You're throwing a pizza party!
        int guestCount = 5, pizzaCount = 4;

        // 1. On average, how much pizza can each guest eat?
        // Calculate and store this value in an appropriate variable
        double avgPizza = (double)pizzaCount / guestCount;

        // 2. Display this information by finishing the below code
        System.out.println("Pizza serving size: " + avgPizza);

        // 3. But wait! 2 more guests just showed up bearing 5 pizzas
        // write code below to update all variables appropriately,
        // and then output a new sentence indicating what fraction
        // of a pizza each guest can have now.
        guestCount += 2;
        pizzaCount += 5;
        avgPizza = (double)pizzaCount / guestCount;
        System.out.println("New pizza serving size: " + avgPizza);

        // 4. Switching gears a bit... display the one's digit
        // of a given number
        int num = 178253;
        int onesDigit = num % 10;
        System.out.println("One's digit is: " + onesDigit);

        // 5. Display the ten's digit of num
        int tensDigit = num % 100;
        tensDigit = tensDigit / 10;
        System.out.println("Ten's digit is: " + tensDigit);
    }
}
