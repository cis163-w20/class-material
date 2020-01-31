/**
 * Person class
 * modified from Savitch's Inheritance Example - Chapter 8 of Java, an Introduction to Problem Solving & Programming
 */
public class Person
{
    private String name;
    
    public Person( ) {
        this.name = "No name yet";
    }
    
    public Person(String initialName) {
        this.name = initialName;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public String getName( ) {
        return this.name;
    }
    
    public void writeOutput( ) {
        System.out.println(this.toString());
    }
   
    public boolean equals(Person otherPerson) {
        return (this.name.equalsIgnoreCase(otherPerson.name));
    }
    
    public String toString() {
      return("Name: " + getName( ));
    }
}
