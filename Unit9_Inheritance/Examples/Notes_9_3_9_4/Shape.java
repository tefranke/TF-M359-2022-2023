package Unit9_Inheritance.Examples.Notes_9_3_9_4;

public class Shape {
    private String color;
    private int numSides;

    public Shape(){
        color = "No color";
        numSides = 0;
    }

    public Shape(String color, int numSides){
        this.color = color;
        this.numSides = numSides;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }


    public String toString(){
        String output = "Color: " + color + ", # of sides: " + numSides;
        return output;
    }
}
