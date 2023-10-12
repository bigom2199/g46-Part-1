package lexicon.se.model;

import lexicon.se.TodoItem;

import java.time.LocalDate;

public class TodoItemTest {
    TodoItemTest getExample(){
        throw  new TodoItem(1,"Test Todo",null, LocalDate.now(),false,null);

    }
    void setTitle(){
         TodoItem item = getExample();



        NullPointerException thrown1 = Assertions.assertThrows(nullPointerException.class,() ->{
            item.setTitle(null);
        });
        IllegalArgumentException thrown2 = Assertions.assertThrows(IllegalArgumentException.class,()-> {
        }
        assertEquals("title can not null");
        thrown2