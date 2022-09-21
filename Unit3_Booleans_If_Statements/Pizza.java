package Unit3_Booleans_If_Statements;

public class Pizza {
    // instance variables

    private String store;
    private int inches;
    private int numToppings;
    private boolean isDeepDish;

    // constructors
    public Pizza(String aStore, int aInches, int aNumToppings, boolean aIsDeepDish) {
        store = aStore;
        inches = aInches;
        numToppings = aNumToppings;
        isDeepDish = aIsDeepDish;

    }

    public Pizza(String aStore, int aInches, boolean aIsDeepDish) {
        store = aStore;
        inches = aInches;
        numToppings = 0;
        isDeepDish = aIsDeepDish;
    }

    // getters & setters
    public String getStore(){
        return store;
    }

    public void setStore(String newStore){
        store = newStore;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }

    // Methods
    // printInfo method: prints all of the pizza's information
    public void printInfo(){
        System.out.println("The pizza is from " + this.store);
        System.out.println("The size of the pizza is " + this.inches + " inches");
        System.out.println("The pizza has " + this.numToppings + " toppings");
        System.out.println("Deep dish? " + this.isDeepDish);
    }

    public String toString(){
        String output = "The pizza is from " + this.store;
        output += "\nThe size of the pizza is " + this.inches + " inches";
        output += "\nThe pizza has " + this.numToppings + " toppings";
        output += "\nDeep dish? " + this.isDeepDish;

        return output;
    }

    // .equals method: returns true if both pizzas are equivalent,
    // false otherwise
    public boolean equals(Pizza other){
        if(this.inches == other.inches){
            return true;
        }
        else {
            return false;
        }
    }

    // compareTo method: returns negative if this comes before other
    // returns zero if they're the same
    // returns positive if other comes before this
    public int compareTo(Pizza other){
        if(this.inches < other.inches){
            return -1;
        }
        else if(this.inches > other.inches){
            return 1;
        }
        else {      // means this.inches == other.inches
            return 0;
        }
    }

}
