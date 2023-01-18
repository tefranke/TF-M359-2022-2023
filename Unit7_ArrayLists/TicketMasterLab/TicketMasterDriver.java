package Unit7_ArrayLists.TicketMasterLab;

import Unit6_Arrays.TriviaGame.TriviaGame;

import java.io.File;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicketMaster tickets = new TicketMaster();
        tickets.loadFile("showData.txt");
        System.out.println(tickets.toString());
    }
}
