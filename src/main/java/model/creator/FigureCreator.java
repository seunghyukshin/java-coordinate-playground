package model.creator;

import model.Figure;
import model.point.Point;

import java.util.List;

/**
 * 변경금지
 */
public interface FigureCreator {
    public Figure create();
    Figure create(List<Point> points);
}
