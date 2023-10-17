package lexicon.se;

public class Person {
     private String firstName;
     private String lastName;
     private  int id;
     private String email;
     public Person (String firstName,String lastName,String email,int id) {
         setFirstName(firstName);
         setLastName (lastName);
         setEmail(email);
         this.id= id;
     }

    public String getFirstName() {
        return firstName;
    }
      public void setFirstName(String firstName){
         if (firstName == null) throw new IllegalArgumentException("firstName was null.");
         this.firstName = firstName;
      }

    public String getLastName() {
        return lastName;
    }
        public void setLastName(String lastName){
          if (lastName == null) throw new IllegalArgumentException("LastName was null.");
          this.lastName = lastName;
        }

    public int getId() {

        return id;
    }
      public void setId(int id){
         this.id = id;
      }

    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }
      public String getSummary(){
         return this.toString();
      }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
