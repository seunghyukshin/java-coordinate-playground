package model.car;

import enums.GasMileaseEnum;

public class K5 extends Car {
    private final double tripDistance;

    public K5(int distance) {
        super();
        tripDistance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return GasMileaseEnum.K5.getValue();
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return null;
    }
}
