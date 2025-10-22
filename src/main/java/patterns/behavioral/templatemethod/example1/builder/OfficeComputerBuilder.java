package patterns.behavioral.templatemethod.example1.builder;

public class OfficeComputerBuilder extends AbstractComputerBuilder {

    @Override
    protected void installCPU() {
        System.out.println("Installing regular i5 CPU...");
    }

    @Override
    protected void installRAM() {
        System.out.println("Installing 16GB DDR4 RAM...");
    }

    @Override
    protected void installGPU() {}
}
