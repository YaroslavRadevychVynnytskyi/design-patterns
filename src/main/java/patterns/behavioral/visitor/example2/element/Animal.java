package patterns.behavioral.visitor.example2.element;

import patterns.behavioral.visitor.example2.visitor.Visitor;

public interface Animal {
    void accept(Visitor visitor);
}
