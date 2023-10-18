package model;

public class Point {
    PointNumber x;
    PointNumber y;

    /**
     * ex) poinStr : "(10,10)"
     */
    public Point(String pointStr) {
        // TODO : ValidtaionUtils로 빼기
        String pointNubmerStr = "\\-?\\d+";
        String regex = "\\(" + pointNubmerStr + "," + pointNubmerStr + "\\)";
        boolean matches = pointStr.matches(regex);

    }
}
