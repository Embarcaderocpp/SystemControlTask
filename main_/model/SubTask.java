package main_.model;

import java.time.LocalDateTime;

public class SubTask extends Task {
    private int epicId;
    public SubTask(String id,  String title, String description, LocalDateTime creationDate, int epicId){
        super( id,
                title,
                description,
                creationDate);
        this.epicId = epicId;
    }

    public void setEpicId(int epicId) {
        this.epicId = epicId;
    }

    public int getEpicId(){
        return epicId;
    }
}
