package lexicon.se.model;

import lexicon.se.TodoItem;
import lexicon.se.TodoitemTask;

import java.time.LocalDate;

public class TodoItemTaskTest {
    TodoitemTask getExample(){
        return  new TodoitemTask(1,false,new TodoItem(1,"Test Title",null,
                LocalDate.now(),false,null),null);
    }

    public void isAssigned(){
        TodoitemTask itemTask = getExample();
        itemTask.setAssigned(null);

        assertFalse(itemTask.isAssigned());
        itemTask.setAssigned(new PersonTest("firstName","lastName","email"));
        assertTrue(itemTask.isAssigned());

    }

    void setTodoItem(){

            TodoitemTask itemTask = getExample();
            itemTask.setTodoItem(null);

        asertEquals("todoItem is not null!",thrown.getMessage());

    }
}
