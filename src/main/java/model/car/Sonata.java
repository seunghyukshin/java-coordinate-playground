package model.car;

import enums.GasMileaseEnum;

public class Sonata extends Car {
    private final double tripDistance;

    public Sonata(int tripDistance) {
        super();
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return GasMileaseEnum.SONATA.getValue();
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
