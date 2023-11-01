import org.junit.jupiter.api.Test;
import utils.PointStringUtils;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SeparatorTest {

    @Test
    public void PointSepartaorUtilsTest() {
        String pointStr = "(10,20)";

        String[] splitArray = PointStringUtils.splitPointString(pointStr);

        assertThat(splitArray[0].equals("10")).isTrue();
        assertThat(splitArray[1].equals("20")).isTrue();
    }
    @Test
    public void NotNumber() {
        String pointStr = "(-10,20)";

        String[] splitArray = PointStringUtils.splitPointString(pointStr);

        assertThat(splitArray[0].equals("-10")).isTrue();
        assertThat(splitArray[1].equals("20")).isTrue();
    }
}
