package zad9_1;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double shapeArea(Shape shape) {
        if (shape instanceof Circle) {
            return Math.PI * Math.pow(((Circle) shape).getR(), 2);
        } else if (shape instanceof Rectangle) {
            return ((Rectangle) shape).getHeight() * ((Rectangle) shape).getLeghtOfBaseA() *
                    ((Rectangle) shape).getLeghtOfBaseB();
        } else
            return 0;
    }

    @Override
    public double volume(Shape3D shape) {
        if(shape instanceof Ball){
            return (4 * Math.pow(((Ball) shape).getRadius(), 3) * Math.PI) / 3;
        }else if (shape instanceof Cube){
            return Math.pow(((Cube) shape).getLenghtOfSide(), 3);
        }else
            return 0;
    }
}
