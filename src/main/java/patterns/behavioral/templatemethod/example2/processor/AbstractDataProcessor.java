package patterns.behavioral.templatemethod.example2.processor;

import java.util.List;
import java.util.Objects;

import patterns.behavioral.templatemethod.example2.data.User;

public abstract class AbstractDataProcessor {

    public final void processDate(String source) {
        connect(source);
        List<String> rawData = extractData(source);
        List<User> users = transformData(rawData);
        if (needsValidation()) {
            users = validateData(users);
        }
        loadData(users);
        disconnect(source);
    }

    private void connect(String source) {
        System.out.println("Connecting to the source: " + source);
    }

    private void disconnect(String source) {
        System.out.println("Disconnecting from the source: " + source);
    }

    protected abstract List<String> extractData(String source);
    protected abstract List<User> transformData(List<String> rawData);
    protected abstract void loadData(List<User> users);

    protected boolean needsValidation() {
        return false;
    }

    protected List<User> validateData(List<User> users) {
        return users.stream()
                .filter(Objects::nonNull)
                .toList();
    }
}
