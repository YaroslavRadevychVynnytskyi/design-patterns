package patterns.behavioral.templatemethod.example1.builder;

public class GamingComputerBuilder extends AbstractComputerBuilder {
    @Override
    protected void installCPU() {
        System.out.println("Installing powerful gaming processor AMD...");
    }

    @Override
    protected void installRAM() {
        System.out.println("Installing 64GB DDR5 RAM...");
    }

    @Override
    protected void installGPU() {
        System.out.println("Installing powerful gaming graphic card...");
    }

    @Override
    protected boolean needsGpu() {
        return true;
    }
}
