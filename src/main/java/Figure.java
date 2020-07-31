public abstract class Figure {
    protected final String name;
    protected final double area;
    protected final Colour colour;

    public Figure(String name, Colour colour) {
        this.name = name;
        this.colour = colour;
        this.area = this.calculateArea();
    }

    public abstract void drawFigure();

    protected abstract double calculateArea();

    public Colour getColour() {
        return this.colour;
    }

    public double getArea() {
        return this.area;
    }
}
