import model.car.Car;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    static RentCompany rentCompany = new RentCompany();
    static List<Car> carList;

    public static RentCompany create() {
        carList = new ArrayList<>();
        return rentCompany;
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public String generateReport() {
        return "";
    }
}
