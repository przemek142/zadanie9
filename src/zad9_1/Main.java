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
        System.out.printf(", Cirle area: %.1f\n", shapeCalculator.shapeArea(circle));

        //Cube Test
        Rectangle rectangle = new Rectangle(10, 20, 30);
        System.out.print("Rectangle Test: " + rectangle);
        System.out.printf(" area: %.1f\n", shapeCalculator.shapeArea(rectangle));

        //Ball Test
        Ball ball = new Ball(10);
        System.out.print("Ball Test: " + rectangle);
        System.out.printf(" vol.: %.1f\n", shapeCalculator.volume(ball));

        //Test Cube
        Cube cube = new Cube(10);
        System.out.print("Cube Test: " + cube);
        System.out.printf(" vol.: %.1f\n", shapeCalculator.volume(cube));

        //additional
        System.out.println();
        Shape[] shapes = {line, circle, rectangle, ball, cube};

        for (Shape shape : shapes) {
            int hashOfClass = shape.hashCode();
//            System.out.printf("\n" + hashOfClass);
            switch (hashOfClass) {
                case 75529185:
                    Line2D line2D = (Line2D) shape;
                    System.out.println("Odcinek wyznaczony przez współrzędne " + shape + " ma długość " +
                            LineCalc.lineLength(line2D));
                    break;
                case 1072693279:
                    Circle circle1 = (Circle)shape;
                    System.out.println("Koło o promieniu " + circle1.getR() + " ma pole " +
                            shapeCalculator.shapeArea(circle1));
                    break;
                case -844204961:
                    Rectangle rectangle1 = (Rectangle)shape;
                    System.out.println("Prostokąt o długościach boków " + rectangle1.getLeghtOfBaseA() + " i " +
                            rectangle1.getLeghtOfBaseB() + "ma pole, które wynosi " +
                            shapeCalculator.shapeArea(rectangle1));
                    break;
                case 1076101151:
                    if (shape instanceof Ball) {
                        Ball ball1 = (Ball) shape;
                        System.out.println("Kula o promieniu " + ball1.getRadius() + " ma objętość " + shapeCalculator.volume(ball1));
                    } else if (shape instanceof Cube){
                        Cube cube1 = (Cube)shape;
                        System.out.println("Sześcian o długości krawędzi wynoszącej " + cube1.getLenghtOfSide() + " ma pojemność " + shapeCalculator.volume(cube));
                    }
            }

        }


    }
}
