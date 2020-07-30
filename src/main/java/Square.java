public class Square extends Figure {
    double length;
    double height;
    double perimeter;

    public Square(double length, double height, Colour colour) {
        super("square", colour);
        this.length = length;
        this.height = height;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    void drawFigure() {
        System.out.println((char) (8414));
    }

    double calculateArea() {
        return length * height;
    }

    double calculatePerimeter() {
        return 2 * (this.length + this.height);
    }

    public String toString() {
        return super.toString() + String.format("perimeter:%.2f length:%.2f hight:%.2f", perimeter, length, height);
    }
}
