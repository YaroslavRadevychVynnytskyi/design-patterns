package patterns.creational.abstractfactory.ui.windows;

import patterns.creational.abstractfactory.ui.component.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows button...");
    }
}
