public class CreateRandomSquare extends CreateRandomFigure {
    @Override
    protected Figure createRandomFigure() {
        return new Square((int) (Math.random() * 10 + 1), (int) (Math.random() * 10 + 1),
                Colour.chooseRandomColour());
    }
}
