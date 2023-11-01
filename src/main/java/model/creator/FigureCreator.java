package model.creator;

import model.figure.Figure;
import model.point.Point;

import java.util.List;

/**
 * 변경금지
 */
public interface FigureCreator {
    public Figure order();
    Figure create(List<Point> points);
}
