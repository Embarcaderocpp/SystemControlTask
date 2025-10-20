package main;

import main.model.Task;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main() {
        LocalDateTime now = LocalDateTime.now();
        main.model.Task task = new Task("id", "title", "description", now);
        System.out.println(task.toString());
    }
}