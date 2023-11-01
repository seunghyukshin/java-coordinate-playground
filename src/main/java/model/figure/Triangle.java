package model.figure;

import model.figure.line.Lines;
import view.ResultView;

public class Triangle implements Figure {

    private final Lines lines;

    public Triangle(Lines lines) {
        this.lines = lines;
    }

    @Override
    public double getRound() {
        return lines.getSumOfLength();
    }

    @Override
    public double getArea() {
        return this.getRound() / 2;
    }

    @Override
    public void print() {
        ResultView.printTriangleArea(getArea());
    }
}
