public class CreateRandomCircle implements CreateRandomFigure {
    @Override
    public Figure createRandomFigure() {
        return new Circle((int) (Math.random() * 10 + 1), Colour.chooseRandomColour());
    }
}
