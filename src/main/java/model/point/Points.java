package model.point;

import utils.PointSeparatorUtils;
import view.ResultView;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Points {
    List<Point> pointList;

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

    // point가 한개면 점만
    // 두개면 길이출력
    public void printDistance() {
        if (pointList.size() == 2) {
            double distance = pointList.get(0).getDistanceFromPoint(pointList.get(1));
            ResultView.printDistance(distance);
        }
    }

    // Frame에 좌표찍기
    @Deprecated
    public void setLocation(JFrame frame) {
        for (Point point : this.pointList) {
            frame.setLocation(point.x.number, point.y.number);
        }
    }
}
