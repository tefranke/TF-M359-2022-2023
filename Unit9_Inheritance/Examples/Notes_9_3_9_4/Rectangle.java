package Unit9_Inheritance.Examples.Notes_9_3_9_4;

public class Rectangle extends Shape{
    private int width;
    private int length;

    public Rectangle (){
        super("No color", 4);
        width = 0;
        length = 0;
    }

    public Rectangle(String color, int width, int length){
        super(color, 4);
        this.width = width;
        this.length = length;
    }

    public String toString(){
        String output = "This rectangle is " + super.getColor() +
                ", with a width of " + width + " and a length of " + length;
        return output;
    }
}
