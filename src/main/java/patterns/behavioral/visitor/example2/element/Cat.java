package patterns.behavioral.visitor.example2.element;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import patterns.behavioral.visitor.example2.visitor.Visitor;

@Getter
@Setter
@AllArgsConstructor
public class Cat implements Animal {
    private String name;
    private String color;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
