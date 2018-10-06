package zad9_1;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {


    @Override
    public double circleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getR(), 2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getLeghtOfBaseA() * rectangle.getLeghtOfBaseB();
    }

    @Override
    public double ballVolume(Ball ball) {
        return (4 * Math.pow(ball.getRadius(), 3) * Math.PI) / 3;
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getLenghtOfSide(),3);
    }
}
