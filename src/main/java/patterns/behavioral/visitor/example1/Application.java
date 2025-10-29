package patterns.behavioral.visitor.example1;

import patterns.behavioral.visitor.example1.shape.Circle;
import patterns.behavioral.visitor.example1.shape.Rectangle;
import patterns.behavioral.visitor.example1.shape.Shape;
import patterns.behavioral.visitor.example1.shape.Triangle;
import patterns.behavioral.visitor.example1.visitor.AreaCalculator;
import patterns.behavioral.visitor.example1.visitor.PerimeterCalculator;
import patterns.behavioral.visitor.example1.visitor.Visitor;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4,6);
        Shape triangle = new Triangle(3,4,5);

        List<Shape> shapes = List.of(circle, rectangle, triangle);

        Visitor areaCalculator = new AreaCalculator();
        Visitor perimeterCalculator = new PerimeterCalculator();

        System.out.println("=== Розрахунок площ ===");
        shapes.forEach(s -> s.accept(areaCalculator));
        System.out.println("=== Розрахунок периметрів ===");
        shapes.forEach(s -> s.accept(perimeterCalculator));
    }
}
