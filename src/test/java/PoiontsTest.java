import model.point.Point;
import model.point.Points;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PoiontsTest {

    @Test
    public void initTest() {
        String pointsString = "(10,20)-(20,24)";
        Points points = new Points(pointsString);

        List<Point> pointList = Arrays.asList(new Point(10,20),new Point(20,24));
        Points expected = new Points(pointList);

        assertThat(expected.equals(points)).isTrue();

    }
}
