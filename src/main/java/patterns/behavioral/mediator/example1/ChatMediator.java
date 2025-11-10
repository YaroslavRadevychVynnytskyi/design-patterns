package patterns.behavioral.mediator.example1;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
