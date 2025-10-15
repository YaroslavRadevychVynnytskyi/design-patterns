package patterns.abstractfactory.ui.factory;

import patterns.abstractfactory.ui.UIFactory;
import patterns.abstractfactory.ui.component.Button;
import patterns.abstractfactory.ui.component.Checkbox;
import patterns.abstractfactory.ui.mac.MacButton;
import patterns.abstractfactory.ui.mac.MacCheckbox;

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
