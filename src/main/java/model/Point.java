package model;

import utils.PointSeparatorUtils;

import java.util.Objects;

public class Point {
    PointNumber x;
    PointNumber y;

    /**
     * ex) poinStr : "(10,10)"
     */
    public Point(String pointStr) {
        // TODO : ValidtaionUtils로 빼기
        String[] splited = PointSeparatorUtils.splitPointString(pointStr);
        this.x = new PointNumber(splited[0]);
        this.y = new PointNumber(splited[1]);
    }

    public Point(int x, int y) {
        this.x = new PointNumber(x);
        this.y = new PointNumber(y);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x) && Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
