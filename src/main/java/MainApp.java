import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Figure> randomFigureList = FigureFactory.createRandomFigureList();
        for (Figure figure : randomFigureList) {
            figure.drawFigure();
        }
    }
}
