package lexicon.se;

public class TodoItemTask {

    private int id;
    private boolean assigned;
    private TodoItem todoitem;
    private Person assignee;
    public TodoItemTask(int id,Person assignee,boolean assigned,TodoItem todoitem){
        this.id= id;
        this.assignee= assignee;

    }

    public int getId() {
        return id;
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



