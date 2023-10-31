package model.creator;

import model.Figure;
import model.point.Point;
import model.factory.FigureFactory;
import utils.PointSeparatorUtils;
import view.InputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleFigureCreator implements FigureCreator {

    @Override
    public Figure create() {
        List<Point> pointList = _getPointListByInputString();
        Figure figure = this.create(pointList);

        return null;
    }

    private List<Point> _getPointListByInputString() {
        String pointsString = InputView.getPointsString(); // "(10,20)-(20,40)"
        String[] pointStringArray = PointSeparatorUtils.splitPointsString(pointsString); // {"(10,20)", "(20,40)"}
        return Arrays.stream(pointStringArray).map(pointString -> new Point(pointString)).collect(Collectors.toList()); // List<Point>
    }

    @Override
    public Figure create(List<Point> points) {
        return FigureFactory.getInstance(points);
    }

}
