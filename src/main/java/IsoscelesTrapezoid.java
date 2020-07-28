public class IsoscelesTrapezoid extends Figure{
    double baseA;
    double baseB;
    double side;
    double middleLine;

    public IsoscelesTrapezoid(double baseA, double baseB, double side, Colour colour) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.side = side;
        this.colour = colour;
        this.area = calculateArea();
        this.middleLine = calculateMiddleLine();
    }

    double calculateMiddleLine (){
        return (this.baseA+this.baseA)/2;
    }


    void drawFigure() {
        System.out.println((char) (9674));
    }

    double calculateArea() {
        return ((this.baseA + this.baseB) / 2) * Math.sqrt(Math.pow(this.side, 2) - (Math.pow((this.baseA - this.baseB), 2)) / 4);
    }

    public String toString() {
        return "IsoscelesTrapezoid: "+ "area = " + this.area+", middleLine = " + this.middleLine + ", colour - " + this.colour;
    }
}
