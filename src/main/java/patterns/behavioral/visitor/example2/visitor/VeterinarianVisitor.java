package patterns.behavioral.visitor.example2.visitor;

import patterns.behavioral.visitor.example2.element.Bird;
import patterns.behavioral.visitor.example2.element.Cat;
import patterns.behavioral.visitor.example2.element.Dog;

public class VeterinarianVisitor implements Visitor {
    @Override
    public void visit(Dog dog) {
        System.out.printf("Огляд песика %s породи %s...%n", dog.getName(), dog.getBreed());
    }

    @Override
    public void visit(Cat cat) {
        System.out.printf("Огляд котика %s кольору %s...%n", cat.getName(), cat.getColor());
    }

    @Override
    public void visit(Bird bird) {
        System.out.printf("Огляд пташки %s виду %s...%n", bird.getName(), bird.getSpecies());
    }
}
