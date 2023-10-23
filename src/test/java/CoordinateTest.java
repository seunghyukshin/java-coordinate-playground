import model.Coordinate;
import model.Points;
import org.junit.jupiter.api.Test;

public class CoordinateTest {
    @Test
    public void initTest() {

        String pointsString = "(10,20)-(20,24)";
        Coordinate coordinate = new Coordinate(new Points(pointsString));

        coordinate.printPoints();
    }
}
