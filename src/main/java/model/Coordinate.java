package model;

import view.ResultView;

import javax.swing.*;
import java.awt.*;

public class Coordinate {

    private final Points points;

    public Coordinate(Points points) {
        this.points = points;
    }

    public void printPoints() {
        ResultView.drawPoints(points);
        points.printDistance(); // 거리출력
    }
}
