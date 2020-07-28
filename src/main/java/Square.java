public class Square extends Figure{
   int length;
   int height;
   int perimeter;


    public Square(int length, int height, Colour colour) {
        this.length = length;
        this.height = height;
        this.colour = colour;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    void drawFigure() {
        System.out.println((char) (8414));
    }

    double calculateArea() {
        return length * height;
    }

    int calculatePerimeter() {
        return 2*(this.length+this.height);
    }

    public String toString() {
        return "Square: "+ "area = " + this.area+", perimeter = " + this.perimeter + ", colour - " + this.colour;
    }
}
