package patterns.behavioral.visitor.example2.element;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import patterns.behavioral.visitor.example2.visitor.Visitor;

@Getter
@Setter
@AllArgsConstructor
public class Dog implements Animal {
    private String name;
    private String breed;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
