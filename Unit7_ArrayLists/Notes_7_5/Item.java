package Unit7_ArrayLists.Notes_7_5;

public class Item {
    private String name;
    private double cost;
    private int quantity;

    public Item(String name, double cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    /** This method determines if two items are equal
     *  For two items to be equal they will have the same name and cost
     *  The quantity doesn't matter
     */
    public boolean equals(Item other) {
        if(this.name.equals(other.name) && this.cost == other.cost){
            return true;
        }
        else
            return false;
    }

    /**
     * this method returns a String representation of a single Item
     * The String format is similar to: Ice Cream, $3.99, 10
     * Where 10 represents the quantity
     */
    public String toString() {
        String output = this.getName() + ", $" + this.getCost() + ", " + this.getQuantity();
        return output;
    }


    // ALL GETTER AND SETTER METHODS FOR INSTANCE VARIABLES

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
