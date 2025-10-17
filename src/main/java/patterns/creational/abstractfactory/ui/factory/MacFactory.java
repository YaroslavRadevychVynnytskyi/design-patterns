package patterns.creational.abstractfactory.ui.factory;

import patterns.creational.abstractfactory.ui.component.Button;
import patterns.creational.abstractfactory.ui.component.Checkbox;
import patterns.creational.abstractfactory.ui.mac.MacButton;
import patterns.creational.abstractfactory.ui.mac.MacCheckbox;

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
