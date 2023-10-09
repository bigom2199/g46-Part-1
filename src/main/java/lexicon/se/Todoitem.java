package lexicon.se;

import java.time.LocalDate;

public class Todoitem {

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine ;
    private boolean done;
    private  Person creator;

    public Todoitem(String title,String taskDescription,LocalDate deadLine,int id){
        this.title=title;
        this.taskDescription =taskDescription;
        this.id=id;

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
}
