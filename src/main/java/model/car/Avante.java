package model.car;

import enums.GasMileaseEnum;

public class Avante extends Car {
    private final double tripDistance;

    public Avante(int tripDistance) {
        super();
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return GasMileaseEnum.AVANTE.getValue();
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return "Avante";
    }
}
