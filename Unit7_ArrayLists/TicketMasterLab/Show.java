package Unit7_ArrayLists.TicketMasterLab;

public class Show {
    private String date;
    private double price;
    private int quantity;
    private String performer;
    private String city;

    public Show(String date, double price, int quantity, String performer, String city) {
        this.date = date;
        this.price = price;
        this.quantity = quantity;
        this.performer = performer;
        this.city = city;
    }


    // returns string of a show on one line
    public String toString(){
        String output = "\n" + date + "\t$" + price + "\t\t" + quantity + "\t\t\t" + performer;
        if(performer.length() < 7){
            output += "\t";
        }
        if(performer.length() < 12){
            output += "\t";
        }
        if(performer.length() < 16){
            output += "\t";
        }
        output += "\t\t" + city;
        return output;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPerformer() {
        return performer;
    }

    public String getCity() {
        return city;
    }
}
