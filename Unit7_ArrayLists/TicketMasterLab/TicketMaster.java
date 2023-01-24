package Unit7_ArrayLists.TicketMasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class TicketMaster {
    private ArrayList<Show> showList;

    public TicketMaster() {
        showList = new ArrayList<Show>();
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

    public ArrayList<Show> getShowList() {
        return showList;
    }


    public ArrayList<Show> sortByCity(String city){
        ArrayList<Show> cityList = new ArrayList<>();
        for (int i = 0; i < showList.size(); i++){
            if (showList.get(i).getCity().equalsIgnoreCase(city)){
                cityList.add(showList.get(i));
            }
        }
        return cityList;
    }

    public String toString(){
        String output = TicketMasterDriver.displayList(showList);
        return output;
    }
}
