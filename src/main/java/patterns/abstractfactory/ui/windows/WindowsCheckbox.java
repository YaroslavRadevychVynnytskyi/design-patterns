package patterns.abstractfactory.ui.windows;

import patterns.abstractfactory.ui.component.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Windows checkbox...");
    }
}
