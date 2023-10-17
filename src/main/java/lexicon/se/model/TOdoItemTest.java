package lexicon.se.model;

import lexicon.se.Person;
import lexicon.se.TodoItem;

import java.time.LocalDate;

public class TOdoItemTest {
    TOdoItemTest getExample() {
        return new TOdoItemTest(1, "Test Todo", null, LocalDate.now(), false, null);


    }

    public void seTitle() {
        TodoItem item = getExample();
        NullPointerException thrown = Assertion.asserThrows(NullPointerException.class, () -> {

            item.setTitle(null);

        });
        IllegalArgumentException thrown2 = assertions.assertThrows(IllegalArgumentException.class, () -> {
            item.setTitle("Bok");

        });
        assertEquals("title can not be null!", thrown.getMessage());
        assertEquals("title is not allowed be empty!", thrown2.getMessage());


    }
      public  void setDeadLine(){
        TodoItem item = getExample();
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class,() ->{
            item.setDeadLine(null);

        });
        assertEquals("deadLine can not be null!", thrown.getMessage());
      }
       void isOverdue(){
        TodoItem item = getExample();
        item.setDeadLine(LocalDate.now().plusDays(1));
        assertFalse(item.isOverdue());

        item.setDeadLine(LocalDate.now().minusDays(1));
        assertTrue(item.isOverdue());
       }

}

