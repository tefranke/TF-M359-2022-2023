package Unit7_ArrayLists.TicketMasterLab;

import Unit6_Arrays.TriviaGame.TriviaGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        TicketMaster tickets = new TicketMaster();
        tickets.loadFile("showData.txt");
        System.out.println(tickets.toString());

        System.out.println("Choose how to sort");
        System.out.println("1. A-Z");
        System.out.println("2. Z-A");
        System.out.println("3. Price low-high");
        System.out.println("4. Price high-low");
    }
}
