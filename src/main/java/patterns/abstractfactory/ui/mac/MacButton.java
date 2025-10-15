package patterns.abstractfactory.ui.mac;

import patterns.abstractfactory.ui.component.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac OS button...");
    }
}
