package main.model;

import java.time.LocalDateTime;


public class Task {
    protected String id;
    protected String title;
    protected String description;
    private LocalDateTime creationDate;

    Status status;
    Priority priority;


    public Task(String id,  String title, String description, LocalDateTime creationDate){
        this.id = id;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.status = Status.PENDING;
        this.priority = Priority.MEDIUM;
    }

    public Task(String id,  String title, String description, LocalDateTime creationDate, Status status, Priority priority){
        this.id = id;
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.status = status;
        this.priority = priority;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCreationDate(LocalDateTime creationDate){
        this.creationDate = creationDate;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPriority(Priority priority){
        this.priority = priority;
    }

    public String getId(){
        return id;
    }

    public LocalDateTime getCreationDate(){
        return creationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString(){
        return String.format("id: %s\ntitle: %s\ndescription: %s\ncreating date: %s\nstatus: %s\npriority: %s",
                getId(), getTitle(), getDescription(), getCreationDate(), getStatus(), getPriority());
    }
}

