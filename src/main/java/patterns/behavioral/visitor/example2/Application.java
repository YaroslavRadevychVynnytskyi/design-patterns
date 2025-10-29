package patterns.behavioral.visitor.example2;

import patterns.behavioral.visitor.example2.element.Animal;
import patterns.behavioral.visitor.example2.element.Bird;
import patterns.behavioral.visitor.example2.element.Cat;
import patterns.behavioral.visitor.example2.element.Dog;
import patterns.behavioral.visitor.example2.visitor.GroomerVisitor;
import patterns.behavioral.visitor.example2.visitor.VeterinarianVisitor;
import patterns.behavioral.visitor.example2.visitor.Visitor;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Animal> animals = List.of(
                new Dog("Рекс", "дворняга"),
                new Cat("Томка", "сірий з білим"),
                new Bird("Жорік", "папугай")
        );

        Visitor groomer = new GroomerVisitor();
        Visitor veterinarian = new VeterinarianVisitor();

        System.out.println("=== Візит до грумера ===");
        animals.forEach(a -> a.accept(groomer));

        System.out.println("=== Візит до ветеринара ===");
        animals.forEach(a -> a.accept(veterinarian));
    }
}
