import model.Line;
import model.Point;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;

public class PointDistanceTest {
    @Test
    public void 두점길이() {

        Point p1 = new Point(10, 10);
        Point p2 = new Point(14, 15);
        double distance = p1.getDistanceFromPoint(p2);
        System.out.println(distance);
        double expected = 6.403124;
        assertThat(distance).isEqualTo(expected, offset(0.00099));
    }
}
