import java.util.ArrayList;
import java.util.List;

public abstract class CreateRandomFigure {
    abstract Figure createRandomFigure();

    public static Colour createRandomColour() {
        return Colour.values()[(int) (Math.random() * (Colour.values().length))];
    }

    public static List<Figure> createRandomFigureList() {

        List<Figure> randomFigureList = new ArrayList<>();
        int numberOfFigures = (int) (Math.random() * 10 + 1);
        for (int i = 0; i < numberOfFigures; i++) {
            CreateRandomFigure randomFigure = CreateRandomFigure.chooseRandomFigure();
            Figure figure = null;
            if (randomFigure != null) {
                figure = randomFigure.createRandomFigure();
            }
            randomFigureList.add(figure);
        }
        return randomFigureList;
    }

    public static CreateRandomFigure chooseRandomFigure() {
        switch ((int) (Math.random() * 3) + 1) {
            case 1:
                return new CreateRandomCircle();
            case 2:
                return new CreateRandomIsoscelesTrapezoid();
            case 3:
                return new CreateRandomSquare();
            case 4:
                return new CreateRandomTriangle();
        }
        return null;
    }
}

