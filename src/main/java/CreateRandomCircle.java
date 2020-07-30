public class CreateRandomCircle extends CreateRandomFigure {
    @Override
    Figure createRandomFigure() {
        return new Circle((int) (Math.random() * 10 + 1), CreateRandomFigure.createRandomColour());
    }
}
