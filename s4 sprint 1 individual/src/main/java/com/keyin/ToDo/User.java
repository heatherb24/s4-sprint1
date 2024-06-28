package com.keyin.ToDo;


public class User {
    private String name;
    private TaskList todoList;

    public User(String name) {
        this.name = name;
        this.todoList = new TaskList();
    }

    public String getName() {
        return name;
    }

    public void addTask(String description) {
        todoList.addTask(new Task(description));
    }

    public void markTaskAsCompleted(int taskIndex) {
        todoList.markTaskAsCompleted(taskIndex);
    }

    public void viewTasks() {
        todoList.printTasks();
    }
}

