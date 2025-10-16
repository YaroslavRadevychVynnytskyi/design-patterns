package patterns.creational.abstractfactory.ui.mac;

import patterns.creational.abstractfactory.ui.component.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Mac OS checkbox...");
    }
}
