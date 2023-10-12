package lexicon.se;

public class TodoitemTask {

    private int id;
    private boolean assigned;
    private TodoItem todoitem;
    private Person assignee;
    public TodoitemTask(int id, Person assignee, boolean assigned, TodoItem todoitem){
        this.id= id;
        this.assignee= assignee;
        setTodoItem(todoitem);
        setAssignee(assignee);

    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public TodoItem getTodoitem() {
        return todoitem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public void setTodoItem(TodoItem todoitem) {
        this.todoitem = todoitem;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
    public String getSummary(){
        return this.toString();
    }

    @Override
    public String toString() {
        return "TodoitemTask{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", todoitem=" + todoitem +
                ", assignee=" + assignee +
                '}';
    }
}



