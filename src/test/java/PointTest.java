import model.Point;
import org.junit.jupiter.api.Test;
import utils.PointSeparatorUtils;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PointTest {
    @Test
    public void OnePoint() {
        String pointStr = "(10,20)";

        Point point = new Point(pointStr);
        assertThat(new Point(10,20).equals(point));
    }
    @Test
    public void Point_Fail() {
        String pointStr = "(10,20)";

        Point point = new Point(pointStr);
        assertThat(new Point(10,20).equals(point));
    }
}
