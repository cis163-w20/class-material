public class Person {
    private String first;
    private String last;
    private int age;

    public Person(String first, String last, int age) {
        this.first = first;
        this.last = last;
        this.age = age;
    }

    public String getFirst() {
        return this.first;
    }
    public void setFirst(String first) {
        this.first = first;
    }
    public String getLast() {
        return this.last;
    }
    public void setLast(String last) {
        this.last = last;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString() {
        String out = "Name = " + first + " " + last + ", Age = " + age;
        return out;
    }
}
