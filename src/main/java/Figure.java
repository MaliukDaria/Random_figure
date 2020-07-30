import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Figure {
    String name;
    double area;
    Colour colour;

    public Figure(String name, Colour colour) {
        this.name = name;
        this.colour = colour;
    }

    abstract void drawFigure();

    abstract double calculateArea();

    Colour getColour() {
        return this.colour;
    }

    double getArea(){
        return this.area;
    }
}
