public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    private double median;

    public Triangle(double sideA, Colour colour) {
        super("triangle", colour);
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideA;
        this.area = calculateArea();
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
        return (2 * Math.pow(sideB, 2) + 2 * Math.pow(sideC, 2) - Math.pow(sideA, 2)) / 4;
    }

    protected double calculateArea() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public String toString() {
        return String.format("Figure:%s" +
                " area:%.2f" +
                " colour:%s" +
                " side:%.2f" +
                " median:%.2f",
                name, area, colour, sideA, median);
    }
}
