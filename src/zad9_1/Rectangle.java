package zad9_1;

import java.util.Objects;

public class Rectangle extends GeometricShape {
    private double leghtOfBaseA,leghtOfBaseB, height;

    public Rectangle(double leghtOfBaseA, double leghtOfBaseB, double height) {
        this.leghtOfBaseA = leghtOfBaseA;
        this.leghtOfBaseB = leghtOfBaseB;
        this.height = height;
    }

    public double getLeghtOfBaseA() {
        return leghtOfBaseA;
    }

    public void setLeghtOfBaseA(double leghtOfBaseA) {
        this.leghtOfBaseA = leghtOfBaseA;
    }

    public double getLeghtOfBaseB() {
        return leghtOfBaseB;
    }

    public void setLeghtOfBaseB(double leghtOfBaseB) {
        this.leghtOfBaseB = leghtOfBaseB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.leghtOfBaseA, leghtOfBaseA) == 0 &&
                Double.compare(rectangle.leghtOfBaseB, leghtOfBaseB) == 0 &&
                Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(leghtOfBaseA, leghtOfBaseB, height);
    }

    @Override
    public String toString() {
        return "Rectangle: Base A: " + leghtOfBaseA + ", Base B: " + leghtOfBaseB + ", height: " + height;
    }
}
