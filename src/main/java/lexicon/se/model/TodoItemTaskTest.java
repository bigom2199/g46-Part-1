package lexicon.se.model;

import lexicon.se.Person;
import lexicon.se.TodoitemTask;

import java.time.LocalDate;

public class TodoItemTaskTest{
      TOdoItemTest getExample(){
          return new TodoItemTaskTest(1,false, new TodoItem (1," Test Title",null, LocalDate.now(),false,null),null);

      }
      public  void isAssigned(){
          TodoitemTask itemTask = getExample(){
              itemTask.setAssignee(null);
              assertFalse(itemTask.isAssigned());
              itemTask.setAssignee(new Person(1,"firstName","lastName","email"));
              assert True(itemTask.isAssigned());

          }
          public void setTodoItem(){
              NullPointerException thrown = Assertions.assertThrows(NullPointerException.class,() -> {
                  TodoitemTask itemTask = getExample();
                  itemTask.setTodoItem(null);

              });
              assert Equals("todoitem can not be null!",thrown.getMessage());

          }
      }

    }

