package concepts;

/**
 * Give a practical example of what Abstract classes are. Asked in EPAM Systems
 */
abstract class Shape {

    protected String color;

    public Shape(String color){
        this.color = color;
    }

    public abstract double calculateArea();

    public void display(){
        System.out.println("This is a " + color + " shape.");
    }

}

class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class abstractClassExample{
    public static void main(String [] args){
        Circle circle = new Circle("Red", 5.0);
        circle.display();
        System.out.println("Area of circle: " +circle.calculateArea());

        Rectangle rectangle = new Rectangle("Blue", 4.0, 5.0);
        rectangle.display();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
