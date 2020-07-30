import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Figure> randomFigureList = CreateRandomFigure.createRandomFigureList();
        for (Figure figure : randomFigureList
        ) {
            System.out.println(figure.toString());
        }
    }
}
