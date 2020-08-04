public class IsoscelesTrapezoid extends Figure {
    private double baseA;
    private double baseB;
    private double side;
    private double middleLine;

    public IsoscelesTrapezoid(double baseA, double baseB, double side, Colour colour) {
        super("isosceles trapezoid", colour);
        this.baseA = baseA;
        this.baseB = baseB;
        this.side = side;
        super.setArea(calculateArea());
        this.middleLine = calculateMiddleLine();
    }
    public void drawFigure(){
        System.out.println(this);
    }

    public double getBaseA() {
        return baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public double getSide() {
        return side;
    }

    public double getMiddleLine() {
        return middleLine;
    }

    private double calculateMiddleLine() {
        return (baseA + baseA) / 2;
    }

    protected double calculateArea() {
        return ((baseA + baseB) / 2) *
                Math.sqrt(Math.pow(side, 2) - (Math.pow((baseA - baseB), 2)) / 4);
    }

    @Override
    public String toString() {
        return String.format("Figure:%s" +
                " area:%.2f" +
                " colour:%s" +
                " base a:%.2f" +
                " base b:%.2f" +
                " side:%.2f" +
                " middleLine:%.2f ",
                super.getName(), super.getArea(), super.getColour(), baseA, baseB, side, middleLine);
    }
}
