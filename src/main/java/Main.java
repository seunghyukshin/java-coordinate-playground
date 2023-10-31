import model.Coordinate;
import model.creator.FigureCreator;
import model.creator.SimpleFigureCreator;
import model.point.Points;

public class Main {
    public static void main(String[] args) {
        FigureCreator figureCreator = new SimpleFigureCreator();
        figureCreator.create();

    }
}
