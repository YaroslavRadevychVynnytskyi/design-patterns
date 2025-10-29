package patterns.behavioral.visitor.example2.visitor;

import patterns.behavioral.visitor.example2.element.Bird;
import patterns.behavioral.visitor.example2.element.Cat;
import patterns.behavioral.visitor.example2.element.Dog;

public interface Visitor {
    void visit(Dog dog);
    void visit(Cat cat);
    void visit(Bird bird);
}
