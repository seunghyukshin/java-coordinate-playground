import model.creator.FigureCreator;
import model.creator.SimpleFigureCreator;

public class Main {
    public static void main(String[] args) {
        FigureCreator figureCreator = new SimpleFigureCreator();
        figureCreator.order();

    }
}
