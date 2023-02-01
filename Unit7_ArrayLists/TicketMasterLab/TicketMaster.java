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


    public void sortByPerformerAZ() {
        for (int i = 0; i <= showList.size() - 1; i++) {
            // look for the smallest remaining number
            int minIndex = i;
            for (int j = i + 1; j < showList.size(); j++) {
                if (showList.get(minIndex).getPerformer().compareTo(showList.get(j).getPerformer()) > 0) {
                    minIndex = j;
                }
            }
            // swap the values at index i and minIndex
            Show temp = showList.get(i);
            showList.set(i, showList.get(minIndex));
            showList.set(minIndex, temp);
        }
    }


    public void sortByPerformerZA() {
        for (int i = 0; i <= showList.size() - 1; i++) {
            // look for the smallest remaining number
            int minIndex = i;
            for (int j = i + 1; j < showList.size(); j++) {
                if (showList.get(minIndex).getPerformer().compareTo(showList.get(j).getPerformer()) < 0) {
                    minIndex = j;
                }
            }
            // swap the values at index i and minIndex
            Show temp = showList.get(i);
            showList.set(i, showList.get(minIndex));
            showList.set(minIndex, temp);
        }
    }

    public void sortByPriceLowHigh(){
        for (int i = 1; i < showList.size(); i++){
            double valueToInsert = showList.get(i).getPrice();
            Show showToInsert = showList.get(i);

            // Determine which position we need to slide over to
            int pos = i;
            while (pos > 0 && showList.get(pos-1).getPrice() > valueToInsert){
                showList.set(pos, showList.get(pos-1));     // shift right
                pos--;
            }

            // Now that we've found the correct position insert it
            showList.set(pos, showToInsert);
        }
    }

    public void sortByPriceHighLow(){
        for (int i = 1; i < showList.size(); i++){
            double valueToInsert = showList.get(i).getPrice();
            Show showToInsert = showList.get(i);

            // Determine which position we need to slide over to
            int pos = i;
            while (pos > 0 && showList.get(pos-1).getPrice() < valueToInsert){
                showList.set(pos, showList.get(pos-1));     // shift right
                pos--;
            }

            // Now that we've found the correct position insert it
            showList.set(pos, showToInsert);
        }
    }
    public String toString(){
        String output = TicketMasterDriver.displayList(showList);
        return output;
    }
}
