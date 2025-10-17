package patterns.structural.proxy.example1;

import patterns.structural.proxy.example1.service.RealUserService;
import patterns.structural.proxy.example1.service.UserService;
import patterns.structural.proxy.example1.service.UserServiceProxy;

public class Application {
    public static void main(String[] args) {
        UserService userService = new UserServiceProxy(new RealUserService());
        userService.viewUserProfile("john_doe", "ROLE_USER");
    }
}
