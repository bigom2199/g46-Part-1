package lexicon.se.model;

import lexicon.se.TodoItem;
import lexicon.se.TodoItemTask;

import java.time.LocalDate;

public class TodoItemTaskTest {
    TodoItemTask getExample(){
        return  new TodoItemTask(1,false,new TodoItem(1,"Test Title",null, LocalDate.now(),false,null),null);
    }
    @Test
    public void isAssigned(){
        TodoItemTask itemTask = getExample();
        itemTask.setAssigned(null);

        assertFalse(itemTask.isAssigned());
        itemTask.setAssigned(new Person(1,"firstName","lastName","email"));
        assertTrue(itemTask.isAssigned());

    }
    void setTodoItem(){
        nullPointerException thrown = Assertions.assertThrrows(NullPointerException.class,() ->{
            TodoItemTask itemTask = getExample();
            itemTask.setTodoItem(null);


        });
        asertEquals("todoItem is not null!",thrown.getMessage());

    }
}
