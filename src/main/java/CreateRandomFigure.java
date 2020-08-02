import java.util.ArrayList;
import java.util.List;

public abstract class CreateRandomFigure {
   protected abstract Figure createRandomFigure();

    protected static Colour chooseRandomColour() {
        return Colour.values()[(int) (Math.random() * (Colour.values().length))];
    }

    public static List<Figure> createRandomFigureList() {

        List<Figure> randomFigureList = new ArrayList<>();
        int numberOfFigures = (int) (Math.random() * 10 + 1);
        for (int i = 0; i < numberOfFigures; i++) {
            CreateRandomFigure randomFigure = CreateRandomFigure.chooseRandomFigure();
            Figure figure  = randomFigure.createRandomFigure();
            randomFigureList.add(figure);
        }
        return randomFigureList;
    }

    public static CreateRandomFigure chooseRandomFigure() {
        CreateRandomFigure randomFigure = null;
        switch ((int) (Math.random() * 3) + 1) {
            case 1:
                randomFigure = new CreateRandomCircle(); break;
            case 2:
                randomFigure =  new CreateRandomIsoscelesTrapezoid(); break;
            case 3:
                randomFigure =  new CreateRandomSquare(); break;
            case 4:
                randomFigure =  new CreateRandomTriangle(); break;
        }
        if (randomFigure==null) {
            throw new NullPointerException("The random figure isn't chosen");
        }
        return randomFigure;
    }
}

