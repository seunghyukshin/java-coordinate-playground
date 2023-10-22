package model;

import utils.PointSeparatorUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Points {
    List<Point> pointList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Points points = (Points) o;
        return Objects.equals(pointList, points.pointList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pointList);
    }

    public Points(String pointsString) {
        String[] splitedPointStrings = PointSeparatorUtils.splitPointsString(pointsString);

        pointList = new ArrayList<>();
        for (String pointString : splitedPointStrings) {
            pointList.add(new Point(pointString));
        }
    }

    public Points(List<Point> pointList) {
        this.pointList = pointList;
    }
}
