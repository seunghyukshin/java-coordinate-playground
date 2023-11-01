package model.figure.line;

import model.point.Point;

import java.util.ArrayList;
import java.util.List;

public class Lines {
    private final List<Line> lines;

    public Lines(List<Point> points) {
        List<Line> lines = new ArrayList<>();

        lines.add(new Line(points.get(0), points.get(1)));
        lines.add(new Line(points.get(1), points.get(2)));
        lines.add(new Line(points.get(0), points.get(2)));

        this.lines = lines;
    }

    /**
     * 모든 선의 길이 합
     */
    public double getSumOfLength() {
        return lines.stream().map(line -> line.getLength()).reduce((a, b) -> a + b).get();
    }
}
