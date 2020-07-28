public class Circle extends Figure{
    double radius;

    public Circle(double radius, Colour colour) {
        this.radius = radius;
        this.colour = colour;
        this.area = calculateArea();
    }

    void drawFigure() {
        System.out.println((char) (9711));
    }

    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return "Circle: "+ "area = " + this.area+", radius = " + this.radius + ", colour - " + this.colour;
    }

}
