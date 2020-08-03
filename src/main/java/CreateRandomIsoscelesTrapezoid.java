public class CreateRandomIsoscelesTrapezoid implements CreateRandomFigure {
    @Override
    public Figure createRandomFigure() {
        return new IsoscelesTrapezoid((int) (Math.random() * 10 + 1),
                (int) (Math.random() * 10 + 1),
                (int) (Math.random() * 10 + 1),
                Colour.chooseRandomColour());
    }
}
