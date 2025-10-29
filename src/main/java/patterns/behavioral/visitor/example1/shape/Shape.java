package patterns.behavioral.visitor.example1.shape;

import patterns.behavioral.visitor.example1.visitor.Visitor;

public interface Shape {
    void accept(Visitor visitor);
}
