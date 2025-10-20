package main_.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List; // Импорт только интерфейса List


public class EpicTask extends Task {
    public List<SubTask> subTasks;

    public EpicTask(String id,  String title, String description, LocalDateTime creationDate){
        super( id,
                title,
                description,
                creationDate);
        this.subTasks = new ArrayList<>();
    }

    public EpicTask(String id,  String title, String description, LocalDateTime creationDate, List<SubTask> initSubTask){
        super( id,
                title,
                description,
                creationDate);
        this.subTasks = new ArrayList<>(initSubTask);
    }

    public void updateSubTask(){
        if (subTasks.isEmpty()){
            this.setStatus(Status.PENDING);

        }
    }
}

