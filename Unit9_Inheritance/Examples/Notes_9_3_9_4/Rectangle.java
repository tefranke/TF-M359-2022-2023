package Unit9_Inheritance.Examples.Notes_9_3_9_4;

public class Rectangle extends Shape{
    private int width;
    private int length;

    public Rectangle (){
        super();
        width = 0;
        length = 0;
    }

    public Rectangle(String color, int width, int length){
        super(color, 4);
        this.width = width;
        this.length = length;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public void scaleSize(double scale){
        width *= scale;
        length *= scale;
    }


    public double findArea(){
        return (double)length*width;
    }

    public String toString(){
        String output = super.toString() + ", length: " + length + ", width: " + width;
        return output;
    }
}
