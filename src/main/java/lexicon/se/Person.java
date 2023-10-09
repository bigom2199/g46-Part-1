package lexicon.se;

public class Person {
     private String firstName;
     private String lastName;
     private  int id;
     private String email;
     public Person (String firstName,String lastName,String email,int id) {
         this.firstName=firstName;
         this.lastName =lastName;
         this.email = email;
         this.id= id;
     }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
