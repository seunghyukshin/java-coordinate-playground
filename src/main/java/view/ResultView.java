package view;

import model.point.Points;

import java.awt.*;

public class ResultView {
    public static void printDistance(double distance) {
        System.out.println("두 점 사이 거리는" + distance);
    }

    public static void drawPoints(Points points) {

//        JFrame frame = new JFrame();
//        points.setLocation(frame);
//        frame.setPreferredSize(_initDimension());
//        frame.pack();
//        frame.setVisible(true);

    }

    private static Dimension _initDimension() {
        Dimension dimension = new Dimension(250, 250);

        return dimension;
    }

}
