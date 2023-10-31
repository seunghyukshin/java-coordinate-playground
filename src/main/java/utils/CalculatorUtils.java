package utils;

import model.point.PointNumber;

public class CalculatorUtils {
    // 두 점사이간 거리
    public static double getDistanceWithTwoPoint(PointNumber x1, PointNumber y1, PointNumber x2, PointNumber y2) {
        // 루트{(x1 - x2)^2 + (y1 - y2)^2}
        return Math.sqrt(Math.pow((x1.subtract(x2)), 2) + Math.pow((y1.subtract(y2)), 2));
    }
}
