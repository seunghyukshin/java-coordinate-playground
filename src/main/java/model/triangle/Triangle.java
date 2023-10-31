package model.triangle;

import model.Figure;
import model.line.Lines;

public abstract class Triangle implements Figure {

    private Lines lines;

    @Override
    public double getRound() {
        return lines.getSumOfLength();
    }

    @Override
    public double getArea() {
        return this.getRound() / 2;
    }
}
