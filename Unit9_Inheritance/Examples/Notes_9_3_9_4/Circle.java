package Unit9_Inheritance.Examples.Notes_9_3_9_4;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius){
        super(color, 1);
        this.radius = radius;
    }
}
