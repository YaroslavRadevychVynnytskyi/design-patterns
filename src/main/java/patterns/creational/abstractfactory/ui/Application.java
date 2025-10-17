package patterns.creational.abstractfactory.ui;

import patterns.creational.abstractfactory.ui.component.Button;
import patterns.creational.abstractfactory.ui.component.Checkbox;
import patterns.creational.abstractfactory.ui.factory.MacFactory;
import patterns.creational.abstractfactory.ui.factory.UIFactory;
import patterns.creational.abstractfactory.ui.factory.WindowsFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.checkbox = uiFactory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        String userOS = "windows";

        UIFactory uiFactory = userOS.equals("mac") ? new MacFactory() : new WindowsFactory();

        Application app = new Application(uiFactory);
        app.renderUI();
    }
}
