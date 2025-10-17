package patterns.creational.abstractfactory.example2.mac;

import patterns.creational.abstractfactory.example2.component.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Mac OS checkbox...");
    }
}
