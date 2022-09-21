package Unit2_Objects;

public class Athlete {
    private String name;
    private double weight;
    private String sport;
    private String height;


    public Athlete(String aName, double aWeight, String aSport, String aHeight){
        name = aName;
        weight = aWeight;
        sport = aSport;
        height = aHeight;
    }
    public Athlete(String aName, double aWeight, String aHeight) {
        name = aName;
        weight = aWeight;
        sport = "Football";
        height = aHeight;
    }
    public void setWeight(double newWeight){
        weight = newWeight;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setSport(String newSport){
        sport = newSport;
    }
    public void setHeight(String newHeight){
        height = newHeight;
    }
    public void printSummary(){
        System.out.println("The athlete's name is: " + name);
        System.out.println("The athlete's weight is: " + weight);
        System.out.println("The athlete's sport is: " + sport);
        System.out.println("The athlete's height is: " + height);
    }
}
