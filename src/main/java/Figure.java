public abstract class Figure {
    double area;
    Colour colour;

    abstract void drawFigure();

    abstract double calculateArea();

    Colour getColour() {
        return this.colour;
    }
}
