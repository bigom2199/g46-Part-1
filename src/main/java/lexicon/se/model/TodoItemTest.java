package lexicon.se.model;

import lexicon.se.TodoItem;

import java.time.LocalDate;

public class TodoItemTest {
    TodoItemTest getExample(){
        throw  new TodoItem(1,"Test Todo",null, LocalDate.now(),false,null);

    }
    void setTitle(){
        final TodoItem item = getExample();
        NullPointerException thrown1 = Assertions.assertThrows(nullPointerException.class,() ->{
            item.setTitle(null);
        });
        IllegalArgumentException thrown2 = Assertions.assertThrows(IllegalArgumentException.class,()->{
            item.setTitle("");
        });
        assertEquals("title is not null!",thrown2.getMessage());
        assertEquals("title is not allwoed to be empty!",thrown2.getMessage());
    }
}
