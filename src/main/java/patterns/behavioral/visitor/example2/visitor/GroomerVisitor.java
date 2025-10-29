package patterns.behavioral.visitor.example2.visitor;

import patterns.behavioral.visitor.example2.element.Bird;
import patterns.behavioral.visitor.example2.element.Cat;
import patterns.behavioral.visitor.example2.element.Dog;

public class GroomerVisitor implements Visitor {
    @Override
    public void visit(Dog dog) {
        System.out.printf("Стрижу собаку %s...%n", dog.getName());
    }

    @Override
    public void visit(Cat cat) {
        System.out.printf("Стрижу кота %s...%n", cat.getName());
    }

    @Override
    public void visit(Bird bird) {
        System.out.printf("Підрізаю пір'я птаху %s...%n", bird.getName());
    }
}
