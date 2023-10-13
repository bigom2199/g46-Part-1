package lexicon.se.model;

import lexicon.se.Person;

import java.text.ParseException;

public class PersonTest {


    public PersonTest getExample() {
        return new Person(1, "firstName", "lastName", "email");
    }



    public void setFirstName() {

        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
            Person person = getExample();
            person.setFirstName(null);

        });
        assertEquals("first name is not null");
        thrown.getMessage();
    }




    public void setLastName() {
        NullPointerException thrown = Assertions.assertThrows(NullPointerException.class,() ->{

        PersonTest person = getExample();
        person.setLastName();

        assertEquals("last name can not be null!");
        thrown.getMessage();
    }


    void setEmail() {
              NullPointerException thrown = Assertions.assertThrows(NullPointerException.class,() -> {

        Person person = getExample();
        person.setEmail(null);

        assertEquals("email can not be null!");
        person.getEmail();
    }

}

    }
}


