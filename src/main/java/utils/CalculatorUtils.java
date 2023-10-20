package utils;

import model.Point;
import model.PointNumber;

public class CalculatorUtils {
    public static double getDistanceWithTwoPoint(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.abs(x1 - x2) + Math.abs(y1 - y2));
    }
}
