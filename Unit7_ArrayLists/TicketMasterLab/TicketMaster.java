package Unit7_ArrayLists.TicketMasterLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class TicketMaster {
    // instance variable
    private ArrayList<Show> showList;


    // default constructor
    public TicketMaster() {
        showList = new ArrayList<Show>();
    }


    /**
     * void method loadFile takes in a file name and crates an arraylist of shows
     * @param fileName is the name of the file you intend to read in
     * @throws FileNotFoundException
     */
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
        fileIn.close();
    }


    // get method
    public ArrayList<Show> getShowList() {
        return showList;
    }


    /**
     * sortByCity takes in the city you want to sort by and returns an ArrayList of concerts in that city
     * @param city is the city you intend to sort by
     * @return and ArrayList of concerts in city
     */
    public ArrayList<Show> sortByCity(String city){
        ArrayList<Show> cityList = new ArrayList<>();
        for (int i = 0; i < showList.size(); i++){
            if (showList.get(i).getCity().equalsIgnoreCase(city)){
                cityList.add(showList.get(i));
            }
        }
        return cityList;
    }


    /**
     * method sortByPerformerAZ sorts an array list by performer name from A to Z
     */
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


    /**
     * method sortByPerformerZA sorts an array list by performer name from Z to A
     */
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

    /**
     * method sortByPriceLowHigh sorts an array list by price low to high
     */
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

    /**
     * method sortByPriceHighLow sorts an array list by price high to low
     */
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

    // calls the static method displayList from the TicketMasterDriver
    // class to display an array list in the correct format
    public String toString(){
        String output = TicketMasterDriver.displayList(showList);
        return output;
    }
}
