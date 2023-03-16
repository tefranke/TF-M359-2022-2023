package Unit9_Inheritance.Examples.BuildingLab;

public class Commercial extends Building{
    private String purpose;
    private int maximumOccupancy;
    private int parkingSpaces;

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getMaximumOccupancy() {
        return maximumOccupancy;
    }

    public void setMaximumOccupancy(int maximumOccupancy) {
        this.maximumOccupancy = maximumOccupancy;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public Commercial(String name, String builder, int yearBuilt, int price,
                      String location, int sqFt, String purpose, int maximumOccupancy, int parkingSpaces) {
        super(name, builder, yearBuilt, price, location, sqFt);
        this.purpose = purpose;
        this.maximumOccupancy = maximumOccupancy;
        this.parkingSpaces = parkingSpaces;
    }

    public String toString(){
        String output = super.toString();
        output += "The purpose of this building is for " + purpose + "\nMaximum Occupancy: " + maximumOccupancy;
        output += "\nNumber of Parking Spaces: " + parkingSpaces;
        return output;
    }

    @Override
    public void renovate() {
        super.renovate();
        maximumOccupancy += (int)(Math.random() * maximumOccupancy/10);
        parkingSpaces += (int)(Math.random() * parkingSpaces/10);
    }

    public int monthlyRevenue(){
        return getSqFt()*1000;
    }
}
