package model.car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");

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
        return carList.stream().map(Car::getReport).collect(Collectors.joining(NEWLINE));
    }
}
