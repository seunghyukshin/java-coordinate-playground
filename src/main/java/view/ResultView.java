package view;

import model.point.Points;

import java.awt.*;

public class ResultView {
    public static void printDistance(double distance) {
        System.out.println("두 점 사이 거리는" + distance);
    }

    public static void printTriangleArea(double area) {
        System.out.println("삼각형 넓이는" + area);
    }

}
