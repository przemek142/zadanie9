package zad9_1;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        //Line Test
        Point lineStart = new Point(0, 0);
        Point lineEnd = new Point(10, 10);
//        System.out.println(lineStart);
//        System.out.println(lineEnd);
        Line2D line = new Line2D(lineStart, lineEnd);
        System.out.print("Line test: " + line + ", ");
        System.out.printf("Line Length: %.2f\n", LineCalc.lineLength(line));

        //Circle Test
        Circle circle = new Circle(1);
        System.out.print("Circle test: " + circle);
        System.out.printf(", Cirle area: %.1f\n", shapeCalculator.circleArea(circle));

        //Cube Test
        Rectangle rectangle = new Rectangle(10, 20, 30);
        System.out.print("Rectangle Test: " + rectangle);
        System.out.printf(" area: %.1f\n", shapeCalculator.rectangleArea(rectangle));

        //Ball Test
        Ball ball = new Ball(10);
        System.out.print("Ball Test: " + rectangle);
        System.out.printf(" vol.: %.1f\n", shapeCalculator.ballVolume(ball));

        //Test Cube
        Cube cube = new Cube(10);
        System.out.print("Cube Test: " + cube);
        System.out.printf(" vol.: %.1f\n", shapeCalculator.cubeVolume(cube));


    }
}
