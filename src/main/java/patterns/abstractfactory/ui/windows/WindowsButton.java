package patterns.abstractfactory.ui.windows;

import patterns.abstractfactory.ui.component.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows button...");
    }
}
