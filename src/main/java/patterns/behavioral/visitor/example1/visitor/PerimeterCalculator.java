package patterns.behavioral.visitor.example1.visitor;

import patterns.behavioral.visitor.example1.shape.Circle;
import patterns.behavioral.visitor.example1.shape.Rectangle;
import patterns.behavioral.visitor.example1.shape.Triangle;

public class PerimeterCalculator implements Visitor {
    @Override
    public void visit(Circle circle) {
        double l = 2 * Math.PI * circle.getRadius();
        System.out.printf("Коло (r=%s): %s%n", circle.getRadius(), l);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double p = 2 * (rectangle.getHeight() + rectangle.getWidth());
        System.out.printf("Прямокутник (%sx%s): %s%n", rectangle.getWidth(), rectangle.getHeight(), p);
    }

    @Override
    public void visit(Triangle triangle) {
        double p = triangle.getA() + triangle.getB() + triangle.getC();
        System.out.printf("Трикутник (%s,%s,%s): %s%n", triangle.getA(), triangle.getB(), triangle.getC(), p);
    }
}
