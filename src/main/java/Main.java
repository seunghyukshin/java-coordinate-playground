import model.Coordinate;
import model.Points;

public class Main {
    public static void main(String[] args) {

//        String pointString = InputView.getPointString();
        String pointString = "(10,20)-(20,24)";
        Points points = new Points(pointString);

        Coordinate coordinate = new Coordinate(points);
        coordinate.printPoints();

    }
}
