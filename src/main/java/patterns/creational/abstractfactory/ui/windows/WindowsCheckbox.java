package patterns.creational.abstractfactory.ui.windows;

import patterns.creational.abstractfactory.ui.component.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Windows checkbox...");
    }
}
