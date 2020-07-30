public class Triangle extends Figure {
    double sideA;
    double sideB;
    double sideC;
    double median;

    public Triangle(double sideA, Colour colour) {
        super("triangle", colour);
        this.sideA = sideA;
        this.sideB = sideA;
        this.sideC = sideA;
        this.area = calculateArea();
        this.median = calculateMedian();
    }

    double calculateMedian() {
        return (2 * Math.pow(this.sideB, 2) + 2 * Math.pow(this.sideC, 2) - Math.pow(this.sideA, 2)) / 4;
    }

    void drawFigure() {
        System.out.println((char) (916));
    }

    double calculateArea() {
        double p = (this.sideA + this.sideB + this.sideC) / 2;
        return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
    }

    public String toString() {
        return super.toString() + String.format("side:%.2f median:%.2f", sideA, median);
    }
}
