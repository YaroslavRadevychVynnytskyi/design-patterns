package patterns.creational.abstractfactory.example2.factory;

import patterns.creational.abstractfactory.example2.component.Button;
import patterns.creational.abstractfactory.example2.component.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
