public class Triangle extends Figure {
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final double median;

    public Triangle(double sideA, Colour colour) {
        super("triangle", colour);
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideA;
        this.median = calculateMedian();
    }

    public void drawFigure(){
        System.out.println(this);
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getMedian() {
        return median;
    }

    private double calculateMedian() {
        return (2 * Math.pow(this.sideB, 2) + 2 * Math.pow(this.sideC, 2) - Math.pow(this.sideA, 2)) / 4;
    }

    protected double calculateArea() {
        double p = (this.sideA + this.sideB + this.sideC) / 2;
        return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
    }

    @Override
    public String toString() {
        return String.format("Figure:%s area:%.2f colour:%s side:%.2f median:%.2f", name, area, colour, sideA, median);
    }
}
