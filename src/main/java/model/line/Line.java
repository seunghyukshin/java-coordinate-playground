package model.line;

import model.Figure;
import model.point.Point;

public class Line implements Figure {

    private Point point1;
    private Point point2;

    public Line(Point p1, Point p2) {
        point1 = p1;
        point2 = p2;
    }

    @Override
    public double getRound() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    /**
     * 선의 길이
     */
    public double getLength() {
        return this.point1.getDistanceFromPoint(this.point2);
    }
}
