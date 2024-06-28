package com.keyin.ToDo;


public class TaskList {

    private class Node {
        private Task task;
        private Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null;
        }

        public Task getTask() {
            return task;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    private Node head;

    public TaskList() {
        head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void markTaskAsCompleted(int taskIndex) {
        if (taskIndex < 0) {
            System.out.println("Invalid task index.");
            return;
        }
        int index = 0;
        Node current = head;
        while (current != null) {
            if (index == taskIndex) {
                current.getTask().markCompleted();
                return;
            }
            current = current.getNext();
            index++;
        }
        System.out.println("Task not found at " + taskIndex);
    }

    public void printTasks() {
        Node current = head;
        int taskIndex = 0;
        while (current != null) {
            Task task = current.getTask();
            String status = task.isCompleted() ? "[Completed]" : "[Pending]";
            System.out.println(taskIndex + ". " + status + " " + task.getDescription());
            current = current.getNext();
            taskIndex++;
        }
    }
}



