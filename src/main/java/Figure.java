public abstract class Figure {
    private  String name;
    private double area;
    private  Colour colour;

    public Figure(String name, Colour colour) {
        this.name = name;
        this.colour = colour;
    }

    public abstract void drawFigure();

    protected abstract double calculateArea();

    public Colour getColour() {
        return colour;
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }

    protected void setArea(double area) {
        this.area = area;
    }
}
