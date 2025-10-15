package patterns.abstractfactory.ui;

import patterns.abstractfactory.ui.component.Button;
import patterns.abstractfactory.ui.component.Checkbox;
import patterns.abstractfactory.ui.factory.MacFactory;
import patterns.abstractfactory.ui.factory.WindowsFactory;

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
