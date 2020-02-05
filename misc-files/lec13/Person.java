public class Person {
    String name;
    short id;
    short age;
    
    public Person(short id, short age) {
        this.id = id;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public String toString() {
        String s = "id = " + id + ", name = " + name + ", age = " + age;
        return s;
    }

    public short getAge() {
        return age;
    }
    
    public static int avgAges(Person[] people) {
        int tot = 0;
        int count = 0;
        for (int i=0; i<=people.length; i++) {
            tot += people[i].getAge();
        }
        return tot/count;
    }
    
    public static void main(String[] args) {
        short s1 = 142;
        short s2 = 2058;
        Person p1 = new Person(s1, (short)40);
        Person p2 = new Person(s2, (short)30);

        Person[] people = new Person[3];
        people[0] = p1;
        people[1] = p2;
        System.out.println(p1);
        int tot = avgAges(people);
        System.out.println(tot);

    }
}
