/**
 * Student class
 * modified from Savitch's Inheritance Example - Chapter 8 of Java, an Introduction to Problem Solving & Programming
 */
public class Student extends Person
{
  private int studentNumber;
  
  public Student( ) {
    super();
    this.studentNumber = 0;//Indicating no number yet
  }
  
  public Student(String initialName) {
    super(initialName);
    this.studentNumber = 0;//Indicating no number yet
  }
  
  public Student(String initialName, int initialStudentNumber) {
    super(initialName);
    this.studentNumber = initialStudentNumber;
  }
  
  public void set(String newName, int newStudentNumber) {
    setName(newName);
    this.studentNumber = newStudentNumber;
  }
  
  public int getStudentNumber( ) {
    return this.studentNumber;
  }
  
  public void setStudentNumber(int newStudentNumber) {
    this.studentNumber = newStudentNumber;
  }
  
  public boolean equals(Student otherStudent) {
    return (super.equals(otherStudent) && 
            this.studentNumber == otherStudent.studentNumber);
  }
  
  
  public String toString( ) {
    return(super.toString() 
             + "\nStudent number: "
             + this.studentNumber);
  }
  
}
