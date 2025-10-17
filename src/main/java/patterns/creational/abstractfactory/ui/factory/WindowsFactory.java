package patterns.creational.abstractfactory.ui.factory;

import patterns.creational.abstractfactory.ui.component.Button;
import patterns.creational.abstractfactory.ui.component.Checkbox;
import patterns.creational.abstractfactory.ui.windows.WindowsButton;
import patterns.creational.abstractfactory.ui.windows.WindowsCheckbox;

public class WindowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
