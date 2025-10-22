package patterns.behavioral.templatemethod.example2.processor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

import patterns.behavioral.templatemethod.example2.data.User;

public class APIUserProcessor extends AbstractDataProcessor {
    private final ObjectMapper objectMapper;

    public APIUserProcessor(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    protected List<String> extractData(String source) {
        System.out.println("[API] Obtaining JSON-response from endpoint " + source + "...");
        return List.of("{\"username\":\"api_user1\", \"email\":\"api1@test.com\", \"age\":42}",
                "{\"username\":\"api_user2\", \"email\":\"api2@test.com\", \"age\":-10}");
    }

    @Override
    protected List<User> transformData(List<String> rawData) {
        System.out.println("[API] Parsing JSON-rows into User objects...");

        return rawData.stream()
                .map(r -> {
                    try {
                        return objectMapper.readValue(r, User.class);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                })
                .toList();
    }

    @Override
    protected void loadData(List<User> users) {
        System.out.printf("[API] Saving %s users into table 'users_api'\n", users.size());
    }

    @Override
    protected boolean needsValidation() {
        return true;
    }

    @Override
    protected List<User> validateData(List<User> users) {
        return users.stream()
                .filter(u -> u.age() > 10)
                .toList();
    }
}
