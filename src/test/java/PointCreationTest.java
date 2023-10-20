import model.Point;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class PointCreationTest {
    @Test
    public void OnePoint() {
        String pointStr = "(10,20)";

        Point point = new Point(pointStr);
        assertThat(new Point(10, 20).equals(point));
    }

    @Test
    public void 콤마여러개() {
        String pointStr = "(1,2,3)";

        assertThatThrownBy(() -> {
            Point point = new Point(pointStr);
        }).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("[입력값 오류]");

    }

    @Test
    public void 숫자외입력() {
        String pointStr = "(1,Abc)";

        assertThatThrownBy(() -> {
            Point point = new Point(pointStr);
        }).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("좌표값은 숫자만 가능");
    }
}
