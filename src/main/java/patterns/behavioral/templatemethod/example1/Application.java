package patterns.behavioral.templatemethod.example1;

import patterns.behavioral.templatemethod.example1.builder.AbstractComputerBuilder;
import patterns.behavioral.templatemethod.example1.builder.GamingComputerBuilder;
import patterns.behavioral.templatemethod.example1.builder.OfficeComputerBuilder;

public class Application {
    public static void main(String[] args) {
        AbstractComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        AbstractComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();

        System.out.println("=======Building office computer=======");
        officeComputerBuilder.buildComputer();

        System.out.println("=======Building gaming computer=======");
        gamingComputerBuilder.buildComputer();
    }
}
