package patterns.creational.abstractfactory.example2.mac;

import patterns.creational.abstractfactory.example2.component.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac OS button...");
    }
}
