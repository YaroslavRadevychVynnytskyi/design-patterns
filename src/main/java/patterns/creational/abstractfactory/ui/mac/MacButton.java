package patterns.creational.abstractfactory.ui.mac;

import patterns.creational.abstractfactory.ui.component.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac OS button...");
    }
}
