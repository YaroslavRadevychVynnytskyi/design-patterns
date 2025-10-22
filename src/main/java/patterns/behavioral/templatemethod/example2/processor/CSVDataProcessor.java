package patterns.behavioral.templatemethod.example2.processor;

import java.util.List;

import patterns.behavioral.templatemethod.example2.data.User;

public class CSVDataProcessor extends AbstractDataProcessor {
    @Override
    protected List<String> extractData(String source) {
        System.out.println("[CSV] Extracting rows from the file " + source + "...");
        return List.of("user1,user1@example.com,25", "user2,,30", "user3,user3@example.com,17"); //imitation
    }

    @Override
    protected List<User> transformData(List<String> rawData) {
        System.out.println("[CSV] Parsing CSV-rows into User objects...");

        return rawData.stream()
                .map(r -> {
                    String[] split = r.split(",");
                    return new User(split[0], split[1], Integer.parseInt(split[2]));
                })
                .toList();
    }

    @Override
    protected void loadData(List<User> users) {
        System.out.printf("[CSV] Saving %s users into table 'users_csv'\n", users.size());
    }

    @Override
    protected boolean needsValidation() {
        return true;
    }

    @Override
    protected List<User> validateData(List<User> users) {
        return users.stream()
                .filter(u -> u.email() != null && !u.email().isBlank())
                .toList();
    }
}
