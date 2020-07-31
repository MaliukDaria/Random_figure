public class Circle extends Figure {
    private final double radius;
    private final double circumference;

    public Circle(double radius, Colour colour) {
        super("circle", colour);
        this.radius = radius;
        this.circumference = calculateCircumference();
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public void drawFigure(){
        System.out.println(this);
    }

    protected double calculateArea() {
        return Math.PI * radius * radius;
    }

    private double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Figure:%s area:%.2f colour:%s radius:%.2f circumference:%.2f", name, area, colour, radius, circumference);
    }
}
