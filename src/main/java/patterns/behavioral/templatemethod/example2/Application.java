package patterns.behavioral.templatemethod.example2;

import com.fasterxml.jackson.databind.ObjectMapper;

import patterns.behavioral.templatemethod.example2.processor.APIUserProcessor;
import patterns.behavioral.templatemethod.example2.processor.AbstractDataProcessor;
import patterns.behavioral.templatemethod.example2.processor.CSVDataProcessor;

public class Application {
    public static void main(String[] args) {
        AbstractDataProcessor csvDataProcessor = new CSVDataProcessor();
        csvDataProcessor.processDate("oct_users.csv");

        AbstractDataProcessor apiDataProcessor = new APIUserProcessor(new ObjectMapper());
        apiDataProcessor.processDate("https://server.com/api/v1/users");

    }
}
