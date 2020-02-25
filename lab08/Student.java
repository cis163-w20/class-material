public class Student extends Person implements Comparable<Student>{
    private int id;
    private double gpa;

    public Student(String first, String last, int age, int id, double gpa) {
        super(first, last, age);
        this.id = id;
        this.gpa = gpa;
    }
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public int compareTo(Student other) {
        return this.getLast().compareTo(other.getLast());
    }
    
    public String toString() {
        String out = "Student #" + this.id + ", gpa = " + this.gpa + "\n";
        out += super.toString();
        return out;
    }
}
