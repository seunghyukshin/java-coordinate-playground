package model.factory;

import model.Figure;
import model.point.Point;
import model.line.Line;

import java.util.List;

public class FigureFactory {
    public static Figure getInstance(List<Point> points) {

        return new Line(points.get(0), points.get(1));
    }
}
