package concepts;

/**
 * Give an example of how interface can be implemented
 */

interface ShapeInterface{
    double calculateArea();
    double calculatePerimeter();

    double pi = Math.PI;
}

class CircleExample implements ShapeInterface{

    private double radius;

    public CircleExample(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class RectangleExample implements ShapeInterface{

    private double length;
    private double width;

    public RectangleExample(double length , double width){
        this.length = length;
        this.width = width;

    }
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2* (length + width);
    }
}
public class interFaceExample {

    public  static  void  main(String [] args){
        ShapeInterface circle = new CircleExample(5.0);
        System.out.println(" Area of circle: " + circle.calculateArea());
        System.out.println(" Perimeter of circle: " + circle.calculatePerimeter());

        ShapeInterface rect = new RectangleExample(4.6, 7.8);
        System.out.println(" Area of rect: " + rect.calculateArea());
        System.out.println(" Perimeter of rect: " + rect.calculatePerimeter());
    }
}
