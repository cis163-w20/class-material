import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("John", "Smith", 23, 12345, 3.7));
        students.add(new Student("Jane", "Doe", 19, 12346, 3.3));
        students.add(new Student("John", "Doe", 20, 12347, 2.9));
        students.add(new Student("Jane", "Smith", 28, 12348, 3.6));
        students.add(new Student("Jill", "Smith", 26, 12349, 3.9));
        students.add(new Student("Bob", "Smith", 21, 12350, 3.8));
        students.add(new Student("Tod", "Doe", 22, 12351, 2.3));

        // Student class implements comparable, so we can sort
        // TODO:  What does this sort by?
        Collections.sort(students);
        System.out.println("Default sort\n" + students);

        // Look at the java documentation for "Collections"
        // TODO: Why can't you call Collections.sort on a
        // regular array such as below.
        // Student[] students = new Student[8];
        
        /* What if we want to sort by something else?
         * One way is to create a "Comparator".  The
         * file SortById.java is a comparator.  
         * TODO Fill in the compare function with the
         * code to compare by student id #.
         */
        Collections.sort(students, new SortById());
        System.out.println("Sorted by Id\n" + students);

        /* We could have accomplished the same thing with an
         * anonymous inner class.
         * TODO Complete the anonymous inner class to accomplish
         * the same thing as the separate comparator.
         */
        Collections.sort(students, new Comparator<Student>() {
            // PUT CODE HERE
        });
        System.out.println("Sorted by Id\n" + students);

        /* TODO Create and use a separate anonymous class to sort by
         * first name and then print the results.
         *
         * Put code below this comment.
         */




        /* Coomparator is really just an interface, so we can
         * use a lambda function instead.
         * The below code uses a lambda function to sort by id
         */

        Collections.sort(students, (o1, o2) -> new Integer(o1.getId()).compareTo(new Integer(o2.getId())));
        System.out.println("Sorted by Id\n" + students);

        /* TODO Using the previous as an example, write code
         * to sort by first name with a lambda function and
         * print the results.
         *
         * Put code below this comment.
         */


        

        /* We can also use lambda expressions with streams.
         * Streams are sequences of objects.  They are not
         * a data structure and don't store the elements, they
         * get the elements on demand.  They allow us to use
         * Java in what's called a "functional programming" style.
         *
         * Streams have some input source -- in this case
         * we'll use collections.
         *
         * Streams support different operations that are either
         * intermediate or terminal.
         *    * intermediate operations return another stream,
         *      allowing us to chain operations together in
         *      what's called a pipeline of operations
         *      (think of this like a factory line where
         *      I do something and the person after me does the
         *      next step)
         *    * terminal operations return either nothing (void)
         *      or something that is not a stream (like an primitive value,
         *      collection, etc.)
         *
         *  Some specific operations:
         *    * filter - intermediate (new stream with only some elements)
         *    * map - intermediate (new stream with modified elements)
         *    * sorted - intermediate
         *    * mapToInt or mapToDouble - intermediate
         *    * for each - terminal
         *    * reduce - terminal
         *    * collect - terminal
         *    * sum - terminal
         *    * max - terminal
         */
        
        /* This all seems complicated, but it's not as bad
         * as it sounds.
         *
         * For instance, the code below uses streams
         * to get an arraylist of all of the
         * students older than 25
         * *
         * The first part `students.stream()`
         * creates a stream from the ArrayList.
         * 
         * Then, we call filter with a lambda expression.
         * Filter will create a new stream with any student
         * for which the lambda expression is true.
         * So, at this point after the filter, we have a stream
         * of all students with age > 25.
         * We then turn these into a collection which is terminal.
         */

        ArrayList<Student> older = (ArrayList<Student>)students.stream()
            .filter(p -> p.getAge() > 25)
            .collect(Collectors.toList());

        /* If we didn't want to cast, we could replace this
         * with the following (it goes directly to an arraylist instead
         * of a list)
         */
        ArrayList<Student> olderv2 = students.stream()
            .filter(p -> p.getAge() > 25)
            .collect(Collectors.toCollection(ArrayList::new));

        /* Let's say we now wanted to average the gpa of all
         * of the students over 25.
         *
         * The below stream/lambda combo accomplishes that
         * Write now our stream is still of "Student" objects
         * but to average, we care only about the GPA, so
         * we turn it into a stream of doubles that are the GPAs.
         *
         * We do this with the `mapToDouble`, which takes as
         * it's argument the function that we want to use to
         * go from a student to a double value.
         * In our case, this is just the getGpa function
         * we could use a lambda function here, but we can
         * make it a little simpler still and refer directly
         * to the function by ClassName::functionName.
         * 
         * At that point, we have a DoubleStream which is a
         * special type of stream.  Since it has numerical
         * values, it directly has an average() reduction operation
         * (this can be considered a reduction because it
         * combines the many values to a single one).
         */

         System.out.println(olderv2.stream()
            .mapToDouble(Student::getGpa)
            .average());

         /* Note that there's really no need to separate these
          * out into 2 steps (if we don't explicitly need the array
          * list of older students, which we didnt' here).
          * Instead, it would have been more efficient to just do it
          * all at once (see below)
          */
        System.out.println(students.stream()
            .filter(p -> p.getAge() >  25)
            .mapToDouble(Student::getGpa)
            .average());

        /* TODO The above could have been accomplished with a
         * loop if we had wanted.  Write code that computes and prints
         * the same value without streams/lambdas.
         *
         * Put code below this
         */

        


        /* Now it's your turn to try streams and lambdas.
         */

        /* TODO Use a stream and lambda(s) to 
         * create an array list of all of the students
         * whose first name is John
         *
         * Put code below this
         */



        /* TODO Use a stream and lambda(s) to print count
         * the number of students with age > 20 and gpa > 3.0
         *
         * Put code below this
         */



        /* TODO Use a stream and lambda(s) to print count
         * the number of students with age > 20 and gpa > 3.0
         *
         * Put code below this
         */



        /* TODO Use a stream to create a list with new person
         * objects with the same values, except for 
         * their first and last names should be all lowercase.
         *
         * Put code below this
         */



        ArrayList<Student> sorted = students.stream()
            .sorted(Comparator.comparing(Student::getId))
            .collect(Collectors.toCollection(ArrayList::new));
    }
}
