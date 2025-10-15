package patterns.abstractfactory.ui.factory;

import patterns.abstractfactory.ui.component.Button;
import patterns.abstractfactory.ui.component.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
