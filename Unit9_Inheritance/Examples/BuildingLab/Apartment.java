package Unit9_Inheritance.Examples.BuildingLab;

public class Apartment extends Residential{
    private boolean hasGarage;

    public Apartment(String name, String builder, int yearBuilt, int price, String location, int sqFt,
                     int schoolRating, int safetyRating, int numBaths, int numBeds, boolean hasGarage) {
        super(name, builder, yearBuilt, price, location, sqFt, schoolRating, safetyRating, numBaths, numBeds);
        this.hasGarage = hasGarage;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public String toString(){
        String output = super.toString();
        output += "Does this property have a garage: " + hasGarage;
        return output;
    }

    @Override
    public void renovate() {
        super.renovate();
        if(Math.random() < 0.5){
            hasGarage = true;
        }
    }
}
