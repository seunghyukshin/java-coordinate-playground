package enums;

public enum GasMileaseEnum {
    SONATA(10), AVANTE(15), K5(13);
    /* 연비
    - Sonata : 10km/리터
    - Avante : 15km/리터
    - K5 : 13km/리터
    */

    private double value;

    GasMileaseEnum(long value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
