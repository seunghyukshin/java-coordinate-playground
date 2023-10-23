package model;

import strategy.PointStrategy;

import java.util.Objects;

public class PointNumber {
    int number;

    public PointNumber(String numberStr) {
        this.number = Integer.parseInt(numberStr);
    }

    public PointNumber(int number) {
        // TODO : ValidationUtils?
        if (number > PointStrategy.MAX_NUMBER) {
            String errorMessage = "좌표는 최대" + PointStrategy.MAX_NUMBER + "까지 가능합니다.";
            throw new IllegalArgumentException(errorMessage);
        }
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointNumber that = (PointNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "PointNumber{" +
                "number=" + number +
                '}';
    }

    // PointNumber간 차
    public double subtract(PointNumber pointNumber) {
        return this.number - pointNumber.number;
    }
}
