public class CreateRandomTriangle extends CreateRandomFigure {
    @Override
    protected Figure createRandomFigure() {
        return new Triangle((int) (Math.random() * 10 + 1),
                CreateRandomFigure.chooseRandomColour());
    }
}
