package Unit7_ArrayLists.TicketMasterLab;

import java.util.Scanner;
import java.util.ArrayList;
public class TicketMaster {
    private ArrayList<Show> showList = new ArrayList<Show>();
    private String fileName;

    public TicketMaster() {
        fileName = "";
    }

    public void loadFile(String fileName){
        Scanner fileIn = new Scanner(fileName);
        while(fileIn.hasNextLine()){
            String date = fileIn.next();
            double cost = fileIn.nextDouble();
            int quantity = fileIn.nextInt();
        }
    }
}
