package Unit9_Inheritance.Examples.Notes_9_3_9_4;

import org.w3c.dom.ls.LSOutput;

public class ShapeDriver {
    public static void main(String[] args) {
        Shape myShape = new Shape("red", 5);
        System.out.println(myShape);

        Circle myCircle = new Circle("green", 7);
        System.out.println(myCircle);

        Rectangle myRect = new Rectangle("yellow", 5, 7);
        System.out.println(myRect);

        Square mySquare = new Square("blue", 4);
        System.out.println(mySquare);

        mySquare.scaleSize(2);
        System.out.println(mySquare.findArea());
    }
}
