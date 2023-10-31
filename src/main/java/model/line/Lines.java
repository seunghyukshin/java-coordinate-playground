package model.line;

import java.util.List;

public class Lines {
    private List<Line> lines;

    /**
     * 모든 선의 길이 합
     */
    public double getSumOfLength() {
        return lines.stream().map(line -> line.getLength()).reduce((a, b) -> a + b).get();
    }
}
