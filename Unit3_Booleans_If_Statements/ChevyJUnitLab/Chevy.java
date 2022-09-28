package Unit3_Booleans_If_Statements.ChevyJUnitLab;

public class Chevy {
    private int year;
    private int miles;
    private double mpg;
    private int basePrice;
    private int priceWithUpgrades = basePrice;
    private double grandTotal = priceWithUpgrades*12;
    private String model;
    private String color;
    private boolean hasLuxuryPkg;
    private boolean has4WDPkg;
    private boolean hasSportsPkg;
    private final String make = "Chevrolet";
    private final double TAX_RATE_MULT = .122;
    private final double LUX_PRICE_MULT = .2;
    private final int FOUR_WHEEL_DRIVE_ADD = 3500;
    private final double SPORTS_MULT = .15;
    private final double FUEL_DEDUCTION_MULT = .8;

    public Chevy(int year, int miles, double mpg, int basePrice, String model,
                 String color, boolean hasLuxuryPkg, boolean has4WDPkg, boolean hasSportsPkg) {

        this.year = year;
        this.miles = miles;
        this.mpg = mpg;
        this.basePrice = basePrice;
        this.model = model;
        this.color = color;
        this.hasLuxuryPkg = hasLuxuryPkg;
        this.has4WDPkg = has4WDPkg;
        this.hasSportsPkg = hasSportsPkg;
    }
    public Chevy(){
        color = "White";
        year = 2021;
        model = "Trax";
        miles = 0;
        basePrice = 16000;
        mpg = 35;
        hasLuxuryPkg = false;
        has4WDPkg = false;
        hasSportsPkg = false;
        priceWithUpgrades = 16000;
        grandTotal = 16000*TAX_RATE_MULT;
    }
    public int compareTo(Chevy other){
        return this.miles - other.miles;
    }
    public boolean equals(Chevy other){
        if (this.model.equals(other.model) && this.color.equals(other.color)){
            return true;
        }
        else if ((this.miles < 200 && other.miles < 200) || (this.miles >= 200 && other.miles >= 200)){
            return true;
        }
        else {
            return false;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getPriceWithUpgrades() {
        return priceWithUpgrades;
    }

    public void setPriceWithUpgrades(int priceWithUpgrades) {
        this.priceWithUpgrades = priceWithUpgrades;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasLuxuryPkg() {
        return hasLuxuryPkg;
    }

    public void setHasLuxuryPkg(boolean hasLuxuryPkg) {
        this.hasLuxuryPkg = hasLuxuryPkg;
    }

    public boolean isHas4WDPkg() {
        return has4WDPkg;
    }

    public void setHas4WDPkg(boolean has4WDPkg) {
        this.has4WDPkg = has4WDPkg;
    }

    public boolean isHasSportsPkg() {
        return hasSportsPkg;
    }

    public void setHasSportsPkg(boolean hasSportsPkg) {
        this.hasSportsPkg = hasSportsPkg;
    }
    public String toString(){
        String output = "**************************************************\n";
        output += year + " " + make + " " + model + " (" + color + ")\n";
        output += "\tBASE PRICE:\t\t\t$" + (double)basePrice + "\n";
        output += "\tMILES:\t\t\t\t" + miles + "\n";
        output += "\tFUEL EFFICIENCY:\t\t" + miles + " mpg\n";
        output += "\tPACKAGES:\n";
        if (hasLuxuryPkg == true){
            output += "\t\t- Luxury Package";
            priceWithUpgrades += basePrice * LUX_PRICE_MULT;
        }
        if (has4WDPkg == true) {
            output += "\t\t- 4WD Package";
            priceWithUpgrades += FOUR_WHEEL_DRIVE_ADD;
        }
        if (hasSportsPkg == true) {
            output += "\t\t- Sports Package";
            priceWithUpgrades += basePrice * SPORTS_MULT;
        }
        else {
            output += "\t\t- None";
        }
        output += "\n\n\tPRICE WITH UPGRADES:\t$" + (double)priceWithUpgrades + "\n";
        output += "FINAL PRICE WITH TAX:\t$" + (double)priceWithUpgrades * TAX_RATE_MULT;
    }
}
