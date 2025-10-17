package patterns.creational.abstractfactory.ui.factory;

import patterns.creational.abstractfactory.ui.component.Button;
import patterns.creational.abstractfactory.ui.component.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
