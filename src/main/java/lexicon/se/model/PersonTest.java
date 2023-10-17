package lexicon.se.model;

import lexicon.se.Person;

public class PersonTest {
      Person getExample(){
          return new Person(1,"firstName","lastName","email");

      }

    public PersonTest() {
    }

    public void setFirstName(String firstName){
       if(firstName == null)  throw new IllegalArgumentException();
       NullPointerException thrown = Assertion.assertThrows(NullPointerException.class,() -> {
           Person person = getExample();
           person.setFirstName(null);

       });
       assertEquals("first name cannot be null!",thrown.getMessage())

      }
      public void setLastName(){
          NullPointerException thrown = Assertion.assertThrows(NullPointerException.class,()->{
              Person person = getExample();
              person.setLastName(null);
          });
          assertEquals("last name can not be null!",thrown.getMessage());

      }
         public void setEmail(){
          NullPointerException thrown = Assertions.assertThrows(NullPointerException.class,()->{
               Person person = getExample();
               person.setEmail(null);
          });
          assertEquals("email can not be null!",thrown.getMessage());
         }

}
