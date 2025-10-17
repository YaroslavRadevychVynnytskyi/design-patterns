package patterns.creational.abstractfactory.example2.windows;

import patterns.creational.abstractfactory.example2.component.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Windows checkbox...");
    }
}
