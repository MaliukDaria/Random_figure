public class Circle extends Figure {
    double radius;
    double circumference;

    public Circle(double radius, Colour colour) {
        super("circle",colour);
        this.radius = radius;
        this.area = calculateArea();
        this.circumference = calculateCircumference();
    }

    void drawFigure() {
        System.out.println((char) (9711));
    }

    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    double calculateCircumference ()
    {
        return 2*Math.PI*radius;
    }

    public String toString() {
        return "Circle: "+ "area = " + this.area+", radius = " + this.radius + ", colour - " + this.colour;
    }
}
