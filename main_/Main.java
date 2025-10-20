package main_;

import main_.model.Task;
import java.time.LocalDateTime;

public class Main {
    public static void main() {
        LocalDateTime now = LocalDateTime.now();
        main_.model.Task task = new Task("id", "title", "description", now);
        System.out.println(task.toString());
    }
}