package Unit9_Inheritance.Examples.Notes_9_3_9_4;

public class Square extends Rectangle{

    public Square(String color, int sideLength){
        super(color, sideLength, sideLength);
    }

    public double findArea(){
        return (double)super.getLength()*super.getLength();
    }

    public String toString(){
        String output = "Color: " + this.getColor();
        return output;
    }
}
