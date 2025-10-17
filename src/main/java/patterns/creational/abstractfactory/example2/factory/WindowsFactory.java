package patterns.creational.abstractfactory.example2.factory;

import patterns.creational.abstractfactory.example2.component.Button;
import patterns.creational.abstractfactory.example2.component.Checkbox;
import patterns.creational.abstractfactory.example2.windows.WindowsButton;
import patterns.creational.abstractfactory.example2.windows.WindowsCheckbox;

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
