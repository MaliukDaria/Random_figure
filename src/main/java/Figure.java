import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Figure {
    double area;
    Colour colour;

    abstract void drawFigure();

    abstract double calculateArea();

    Colour getColour() {
        return this.colour;
    }

    double getArea(){
        return this.area;
    }

/*    Figure randomFigureGeneration()
    {
        ArrayList<Figure> figureList = new ArrayList<>();
    }*/

}
