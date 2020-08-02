public class CreateRandomIsoscelesTrapezoid extends CreateRandomFigure {
    @Override
    protected Figure createRandomFigure() {
        return new IsoscelesTrapezoid((int) (Math.random() * 10 + 1),
                (int) (Math.random() * 10 + 1),
                (int) (Math.random() * 10 + 1),
                CreateRandomFigure.chooseRandomColour());
    }
}
