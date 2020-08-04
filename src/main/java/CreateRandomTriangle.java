public class CreateRandomTriangle implements CreateRandomFigure {
    @Override
    public Figure createRandomFigure() {
        return new Triangle((int) (Math.random() * 10 + 1),
                Colour.chooseRandomColour());
    }
}
