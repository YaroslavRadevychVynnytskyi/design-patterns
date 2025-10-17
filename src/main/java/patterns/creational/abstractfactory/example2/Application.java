package patterns.creational.abstractfactory.example2;

import patterns.creational.abstractfactory.example2.component.Button;
import patterns.creational.abstractfactory.example2.component.Checkbox;
import patterns.creational.abstractfactory.example2.factory.MacFactory;
import patterns.creational.abstractfactory.example2.factory.UIFactory;
import patterns.creational.abstractfactory.example2.factory.WindowsFactory;

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
