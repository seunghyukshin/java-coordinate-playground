package model.creator;

import model.figure.Figure;
import model.point.Point;
import model.factory.FigureFactory;
import utils.PointStringUtils;
import view.InputView;
import view.ResultView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleFigureCreator implements FigureCreator {

    @Override
    public Figure order() {
        List<Point> pointList = _getPointListByInputString();
        Figure figure = this.create(pointList); // 생성 

        // TODO: 좌표 그리기
//        figure.draw();
        figure.print();

        return null;
    }

    // 사용자 입력값을 PointList로 반환
    private List<Point> _getPointListByInputString() {
        String pointsString = InputView.getPointsString(); // "(10,20)-(20,40)"
        String[] pointStringArray = PointStringUtils.splitPointsString(pointsString); // {"(10,20)", "(20,40)"}
        return Arrays.stream(pointStringArray).map(pointString -> new Point(pointString)).collect(Collectors.toList()); // List<Point>
    }

    @Override
    public Figure create(List<Point> points) {
        return FigureFactory.getInstance(points);
    }

}
