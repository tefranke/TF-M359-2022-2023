package Unit7_ArrayLists.TicketMasterLab;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketMasterDriver {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException {
        // constants
        final int AZ = 1;
        final int ZA = 2;
        final int LOW_HIGH = 3;
        final int HIGH_LOW = 4;
        final int CITY = 5;
        final int QUIT = 6;

        // creates a TicketMaster object and loads in a file
        TicketMaster tickets = new TicketMaster();
        tickets.loadFile("showData.txt");
        System.out.println(tickets.toString());

        // choose how to sort
        int sortBy = 0;
        while(sortBy != QUIT) {
            sortBy = getUserInput();



            // sort by performer a to z
            if (sortBy == AZ){
                System.out.println("Here is a new list sorted A-Z: ");
                tickets.sortByPerformerAZ();
                System.out.println(tickets.toString());
            }


            // sort by performer z to a
            if (sortBy == ZA){
                System.out.println("Here is a new list sorted Z-A: ");
                tickets.sortByPerformerZA();
                System.out.println(tickets.toString());
            }

            // sort by price low to high
            if (sortBy == LOW_HIGH){
                System.out.println("Here is a new list sorted by price low-high: ");
                tickets.sortByPriceLowHigh();
                System.out.println(tickets.toString());
            }

            // sort by price high to low
            if (sortBy == HIGH_LOW){
                System.out.println("Here is a new list sorted by price high-low: ");
                tickets.sortByPriceHighLow();
                System.out.println(tickets.toString());
            }


            // sort by city
            if (sortBy == CITY) {
                System.out.println("Enter city you want to sort by:");
                String city = "";
                try {
                    city = input.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Enter a city name");
                    input.nextLine();   // dummy read
                }
                if (tickets.sortByCity(city).size() > 0) {
                    System.out.println("Here is a list of concerts in your city: ");
                    System.out.println(displayList(tickets.sortByCity(city)));
                }
                else {
                    System.out.println("There are no concerts in this city");
                }
            }
        }
        input.close();
    }

    /**
     * Returns a string of an array list properly formatted as a receipt
     * @param list is an array list of shows that you want to format
     * @return a string that displays a receipt of shows
     */
    public static String displayList(ArrayList<Show> list) {
        String output = "Date\t\tPrice\t\tQty\t\t\t Performer\t\t\t\tCity";
        output += "\n-------------------------------------------------------------------";
        for (Show a : list) {
            output += a.toString();
        }
        return output;
    }

    /**
     * static method getUserInput returns an int based on how you want to sort
     * @return int based on how you want to sort
     */
    public static int getUserInput(){
        System.out.println("Choose how to sort");
        System.out.println("1. Performer A-Z");
        System.out.println("2. Performer Z-A");
        System.out.println("3. Price low-high");
        System.out.println("4. Price high-low");
        System.out.println("5. City");
        System.out.println("6. Quit");
        int sortBy = 0;
        while (sortBy > 6 || sortBy <= 0) {
            System.out.println("Enter 1-6 based on how you want to sort");
            try {
                sortBy = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Do not enter anything other than an integer between 1-6");
                input.nextLine();   // dummy read
            }
        }
        input.nextLine();
        return sortBy;
    }
}
