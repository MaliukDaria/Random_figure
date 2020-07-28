public class Triangle extends Figure{
    double sideA;
    double sideB;
    double sideC;
    double median;

    public Triangle(double sideA, double sideB, double sideC, Colour colour) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.colour = colour;
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
        return "Triangle: "+ "area = " + this.area+", median = " + this.median + ", colour - " + this.colour;
    }
}
