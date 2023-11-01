package model.factory;

import model.figure.Figure;
import model.figure.Triangle;
import model.figure.line.Lines;
import model.point.Point;
import model.figure.line.Line;

import java.util.List;

public class FigureFactory {
    public static Figure getInstance(List<Point> points) {
        if (points.size() == 2) {
            return new Line(points.get(0), points.get(1));
        }

        return new Triangle(new Lines(points));

    }
}
