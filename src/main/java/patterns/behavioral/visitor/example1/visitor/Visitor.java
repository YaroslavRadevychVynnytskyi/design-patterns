package patterns.behavioral.visitor.example1.visitor;

import patterns.behavioral.visitor.example1.shape.Circle;
import patterns.behavioral.visitor.example1.shape.Rectangle;
import patterns.behavioral.visitor.example1.shape.Triangle;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Triangle triangle);
}
