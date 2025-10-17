package patterns.structural.decorator.example1;

import patterns.structural.decorator.example1.decorator.EncryptionDataSourceDecorator;
import patterns.structural.decorator.example1.decorator.LoggingDataSourceDecorator;

public class Application {
    public static void main(String[] args) {
        DataSource fileDataSource = new FileDataSource("data.txt");
        LoggingDataSourceDecorator loggingDataSource = new LoggingDataSourceDecorator(fileDataSource);
        EncryptionDataSourceDecorator encryptionLoggingDataSource = new EncryptionDataSourceDecorator(loggingDataSource);

        encryptionLoggingDataSource.writeData("Hello, World!");
        System.out.println(encryptionLoggingDataSource.readData());
    }
}
