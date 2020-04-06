public class ArrayStack {
    /* index to next spot to be filled */
    private int top;

    /* array to hold Integer objects, could change to store other types 
     * code in textbook (ch12) shows example using generic types
     *     which allows to store any object type in them (think
     *     like ArrayList can)
     */
    private Integer[] stack;

    /* current number of items on the stack */
    private int size;

    /* constructor with default initial capcity */
    public ArrayStack() {
        stack = new Integer[64];
        top = 0;
        size = 0;
    }

    /* constructor specifying capacity */
    public ArrayStack(int initialCapacity) {
        stack = new Integer[initialCapacity];
        top = 0;
        size = 0;
    }

    public void push(Integer elem) {
        if (size == stack.length) {
            // already filled, need more room
            expand();
        }
        
        // either way, add it now
        stack[top] = elem;
        top++;
        size++;
    }

    /* method to remove from top of stack
     * returns null if nothing to pop 
     */
    public Integer pop() {
        if (size == 0) {
            return null;
        }
        else {
            top--;
            size--;
            Integer result = stack[top];
            stack[top] = null;
            return result;
        }
    }

    public void expand() {
        // make a new array and copy values over
        Integer[] temp = stack;
        stack = new Integer[stack.length*2];
        for(int i=0; i<size; i++) {
            stack[i] = temp[i];
        }

        // could have replaced all of above with
        // stack = Arrays.copyOf(stack, stack.length*2);
    }

    public void display() {
        System.out.println("stack capacity = " + stack.length);
        System.out.println("number of items in stack = " + size);
        for(int i=top-1; i>=0; i--) {
            System.out.println(stack[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack small = new ArrayStack(4);
        small.display();
        small.push(new Integer(2));
        small.push(new Integer(5));
        small.push(new Integer(-1));
        small.push(new Integer(8));
        small.push(new Integer(20));
        small.push(new Integer(4));
        small.display();
        Integer val = small.pop();
        System.out.println("Removed value = " + val + "\n");
        small.display();
    }
}
