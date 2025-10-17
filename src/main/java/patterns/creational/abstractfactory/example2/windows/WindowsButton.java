package patterns.creational.abstractfactory.example2.windows;

import patterns.creational.abstractfactory.example2.component.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows button...");
    }
}
