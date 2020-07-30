import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
/*CreateRandomFigure randomCircle = new CreateRandomCircle();
Figure circle = randomCircle.createRandomFigure();
        System.out.println(circle);*/

      //  List<String> randomFigures = Arrays.asList("Circle", "Square", "Triangle", "IsoscelesTrapezoid");
        List<Figure> randomFigureList = CreateRandomFigure.createRandomFigureList();
        for (Figure figure: randomFigureList
             ) {
            System.out.println(figure.toString());
        }
     //   System.out.println("Hello");
    }


}



