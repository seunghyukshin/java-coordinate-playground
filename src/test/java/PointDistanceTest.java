import model.Line;
import model.Point;
import org.junit.jupiter.api.Test;

public class PointDistanceTest {
    @Test
    public void 두점길이(){

        Point p1 = new Point(1, 10);
        Point p2 = new Point(1, 45);
        double distance = p1.getDistanceFromPoint(p2);
    }
}
