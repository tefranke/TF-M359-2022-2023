package Unit7_ArrayLists.TicketMasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class TicketMaster {
    private ArrayList<Show> showList = new ArrayList<Show>();

    public TicketMaster() {
    }

    public void loadFile(String fileName) throws FileNotFoundException {

        File myFile = new File(fileName);
        Scanner fileIn = new Scanner(myFile);

        while(fileIn.hasNextLine()){
            String date = fileIn.next();
            double cost = fileIn.nextDouble();
            int quantity = fileIn.nextInt();
            String temp = fileIn.nextLine();
            int index = temp.indexOf(",");
            String artist = temp.substring(0,index);
            String city = temp.substring(index+2);
            Show addShow = new Show(date, cost, quantity, artist, city);
            showList.add(addShow);
        }


    }

    public String toString(){
        String output = "Date\t\tPrice\t\tQty\t\t\t Performer\t\t\t\tCity";
        output += "\n-------------------------------------------------------------------";
        for(Show a : showList){
            output += a.toString();
        }
        return output;
    }
}
