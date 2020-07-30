public class CreateRandomTriangle extends CreateRandomFigure{
    @Override
    Figure createRandomFigure() {
        return new Triangle((int)(  Math.random() * 10 +1),(int)(  Math.random() * 10 +1),(int)(  Math.random() * 10 +1), CreateRandomFigure.createRandomColour());
    }
}
