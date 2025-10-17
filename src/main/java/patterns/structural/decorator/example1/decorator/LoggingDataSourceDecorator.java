package patterns.structural.decorator.example1.decorator;

import patterns.structural.decorator.example1.DataSource;

public class LoggingDataSourceDecorator extends DataSourceDecorator {

    public LoggingDataSourceDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("[LOG] Writing data: " + data);
        super.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("[LOG] Reading data...");
        return super.readData();
    }
}
