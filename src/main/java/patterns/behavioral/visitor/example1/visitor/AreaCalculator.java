package patterns.behavioral.visitor.example1.visitor;

import patterns.behavioral.visitor.example1.shape.Circle;
import patterns.behavioral.visitor.example1.shape.Rectangle;
import patterns.behavioral.visitor.example1.shape.Triangle;

public class AreaCalculator implements Visitor {
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        System.out.printf("Коло (r=%s): %s%n", circle.getRadius(), area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.printf("Прямокутник (%sx%s): %s%n", rectangle.getWidth(), rectangle.getHeight(), area);
    }

    @Override
    public void visit(Triangle triangle) {
        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();

        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.printf("Трикутник (%s,%s,%s): %s%n", triangle.getA(), triangle.getB(), triangle.getC(), area);
    }
}
