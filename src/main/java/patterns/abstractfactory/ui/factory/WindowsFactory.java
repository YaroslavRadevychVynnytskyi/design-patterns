package patterns.abstractfactory.ui.factory;

import patterns.abstractfactory.ui.component.Button;
import patterns.abstractfactory.ui.component.Checkbox;
import patterns.abstractfactory.ui.windows.WindowsButton;
import patterns.abstractfactory.ui.windows.WindowsCheckbox;

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
