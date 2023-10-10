package lexicon.se;

import java.time.LocalDate;

public class TodoItem {

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine ;
    private boolean done;
    private  Person creator;

    public TodoItem(String title,String taskDescription,LocalDate deadLine, int id,boolean done){
        this.title=title;
         this.creator=creator;
        this.id=id;
        setDeadLine(deadLine);


    }

    public int getId() {
        return id;
    }
public void setId(){
        this.id=id;
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

    public void setTitle(String title){
        if (title.isEmpty()){
            throw  new IllegalArgumentException("title is not empty!");
        }
        this.title=title;
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
    public  void setCreator(Person creator){
        this.creator=creator;
    }
    public String getSummary(){
        return this.toString();
    }
    @Override
    public String toString() {
        return "Todoitem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", deadLine=" + deadLine +
                ", done=" + done +
                ", creator=" + creator +
                '}';
    }








    }
}
