import java.util.ArrayList;
import java.util.List;

public class FigureFactory {
    public static List<Figure> createRandomFigureList() {

        List<Figure> randomFigureList = new ArrayList<>();
        int numberOfFigures = (int) (Math.random() * 10 + 1);
        for (int i = 0; i < numberOfFigures; i++) {
            CreateRandomFigure randomFigure = FigureFactory.chooseRandomFigure();
            Figure figure = randomFigure.createRandomFigure();
            randomFigureList.add(figure);
        }
        return randomFigureList;
    }

    private static CreateRandomFigure chooseRandomFigure() {
        CreateRandomFigure randomFigure = switch ((int) (Math.random() * 3) + 1) {
            case 1 -> new CreateRandomCircle();
            case 2 -> new CreateRandomIsoscelesTrapezoid();
            case 3 -> new CreateRandomSquare();
            case 4 -> new CreateRandomTriangle();
            default -> null;
        };
        if (randomFigure == null) {
            throw new RuntimeException("The random figure isn't chosen");
        }
        return randomFigure;
    }
}
