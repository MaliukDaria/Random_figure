import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Figure> randomFigureList = CreateRandomFigure.createRandomFigureList();
        for (Figure figure : randomFigureList
        ) {
            figure.drawFigure();
        }
        Square square = new Square(4,6,Colour.RED);

    }
}
