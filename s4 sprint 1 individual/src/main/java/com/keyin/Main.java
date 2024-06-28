package com.keyin;

import com.keyin.ToDo.User;


public class Main {
    public static void main(String[] args) {
        User[] users = new User[10];

        User user1 = new User("Steve");
        user1.addTask("Get gas");
        user1.addTask("File reports");
        user1.addTask("Clean fridge");

        User user2 = new User("Bob");
        user2.addTask("Go grocery shopping");
        user2.addTask("Go jogging");
        user2.addTask("Paint wall");

        user1.markTaskAsCompleted(0);

        user2.markTaskAsCompleted(0);
        user2.markTaskAsCompleted(1);

        displayUserTasks(user1);
        displayUserTasks(user2);

        users[0] = user1;
        users[1] = user2;

    }

    public static void displayUserTasks(User user) {
        System.out.println("User: " + user.getName());
        user.viewTasks();
        System.out.println();
    }
}
