package patterns.creational.abstractfactory.example2.factory;

import patterns.creational.abstractfactory.example2.component.Button;
import patterns.creational.abstractfactory.example2.component.Checkbox;
import patterns.creational.abstractfactory.example2.mac.MacButton;
import patterns.creational.abstractfactory.example2.mac.MacCheckbox;

public class MacFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
