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
    public void PointSepartaorUtilsTest() {
        String pointStr = "(10,20)";

        String[] splited = PointSeparatorUtils.splitPointString(pointStr);

        assertThat(splited[0].equals("10")).isTrue();
        assertThat(splited[1].equals("20")).isTrue();
    }

}
