public class Square extends Figure {
   private final double length;
   private final double height;
   private final double perimeter;

    public Square(double length, double height, Colour colour) {
        super("square", colour);
        this.length = length;
        this.height = height;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }
    public void drawFigure(){
        System.out.println(this);
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getPerimeter() {
        return perimeter;
    }

    protected double calculateArea() {
        return length * height;
    }

    private double calculatePerimeter() {
        return 2 * (length + height);
    }

    @Override
    public String toString() {
        return String.format("Figure:%s" +
                " area:%.2f" +
                " colour:%s" +
                " perimeter:%.2f" +
                " length:%.2f" +
                " height:%.2f",
                name, area, colour, perimeter, length, height);
    }
}
