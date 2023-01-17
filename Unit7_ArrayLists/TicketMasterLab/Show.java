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

    public String toString(){
        // String output = "Date\t\tPrice\t\tQuantity\tPerformer\t\t\t\tCity";
        // output += "\n-------------------------------------------------------------------";
        String output = date + "\t$" + price + "\t" + quantity + "\t\t\t\t" + city + "\n";
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
