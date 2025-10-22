package patterns.behavioral.templatemethod.example1.builder;

public abstract class AbstractComputerBuilder {

    public final void buildComputer() {
        installMotherboard();
        installCPU();
        installRAM();
        if (needsGpu()) installGPU();
        runTests();
    }

    private void installMotherboard() {
        System.out.println("Installing generic motherboard...");
    }

    private void runTests() {
        System.out.println("Computer is built. Running final tests...");
    }

    protected abstract void installCPU();
    protected abstract void installRAM();
    protected abstract void installGPU();

    protected boolean needsGpu() {
        return false;
    }
}
