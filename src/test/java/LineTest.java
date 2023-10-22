import model.Line;
import model.Point;
import org.junit.jupiter.api.Test;

public class LineTest {
    @Test
    public void distance() {
        Point p1 = new Point(1, 10);
        Point p2 = new Point(1, 45);
        Line line = new Line(p1, p2);

    }
}
