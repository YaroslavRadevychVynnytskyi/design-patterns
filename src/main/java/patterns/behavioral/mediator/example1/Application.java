package patterns.behavioral.mediator.example1;

public class Application {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "Ivan");
        User user2 = new ChatUser(chatRoom, "Mariia");
        User user3 = new ChatUser(chatRoom, "Petro");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        System.out.println("=== Communication ===");
        user1.send("Hello, everyone!");
        System.out.println();
        user2.send("Hello, Ivan!");
    }
}
