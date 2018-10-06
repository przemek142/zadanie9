package zad9_1;

import java.util.Objects;

public class Cube extends Shape3D {
    private double lenghtOfSide;

    public Cube(double lenghtOfSide) {
        this.lenghtOfSide = lenghtOfSide;
    }

    public double getLenghtOfSide() {
        return lenghtOfSide;
    }

    public void setLenghtOfSide(double lenghtOfSide) {
        this.lenghtOfSide = lenghtOfSide;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(cube.lenghtOfSide, lenghtOfSide) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lenghtOfSide);
    }

    @Override
    public String toString() {
        return String.format("%.2f",lenghtOfSide);
    }
}
