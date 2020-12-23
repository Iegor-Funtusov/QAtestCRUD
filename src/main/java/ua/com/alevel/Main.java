package ua.com.alevel;

import ua.com.alevel.controller.UserController;

/**
 * @author Iehor Funtusov, created 23/12/2020 - 7:35 PM
 */

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world");
        UserController userController = new UserController();
        userController.run();
    }
}
