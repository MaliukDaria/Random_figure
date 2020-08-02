public class CreateRandomCircle extends CreateRandomFigure {
    @Override
    protected Figure createRandomFigure() {
        return new Circle((int) (Math.random() * 10 + 1), CreateRandomFigure.chooseRandomColour());
    }
}
