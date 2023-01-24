package Unit7_ArrayLists.TicketMasterLab;

import Unit6_Arrays.TriviaGame.TriviaGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        TicketMaster tickets = new TicketMaster();
        tickets.loadFile("showData.txt");
        System.out.println(tickets.toString());

        int sortBy = 0;
        while(sortBy != 6) {
            System.out.println("Choose how to sort");
            System.out.println("1. A-Z");
            System.out.println("2. Z-A");
            System.out.println("3. Price low-high");
            System.out.println("4. Price high-low");
            System.out.println("5. City");
            System.out.println("6. Quit");
            sortBy = 0;
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
            if (sortBy == 5) {
                System.out.println("Enter city you want to sort by:");
                String city = "";
                try {
                    city = input.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Enter a city name");
                    input.nextLine();   // dummy read
                }
                System.out.println("Here are a list of concerts in your city: ");
                System.out.println(displayList(tickets.sortByCity(city)));
            }
        }
    }

    public static String displayList(ArrayList<Show> list) {
        String output = "Date\t\tPrice\t\tQty\t\t\t Performer\t\t\t\tCity";
        output += "\n-------------------------------------------------------------------";
        for (Show a : list) {
            output += a.toString();
        }
        return output;
    }
}
