public class CircularArrayQueue {
    private int front;
    private int end;
    private int size;
    private String[] queue;

    public CircularArrayQueue() {
        this(8);
    }

    public CircularArrayQueue(int capacity) {
        front = 0;
        end = 0;
        size = 0;
        queue = new String[capacity];
    }

    public void enqueue(String elem) throws Exception{
        if (size == queue.length) {
            /* In actuality, you'd expand the size by doubling,
             * copy stuff to front, update front/end
             * This is just used to limit the complexity of this code example
             */
            throw new Exception("Not enough room in underlying array");
        }
        
        queue[end] = elem;
        end = (end+1) % queue.length;
        size++;
    }

    public String dequeue() {
        String result = queue[front];
        queue[front] = null;
        front = (front+1) % queue.length;
        size--;
        return result;
    }

    public void display() {
        System.out.println("front = " + front + ", end = " + end + ", size = " + size);
        String out = "";
        for (int i = 0; i<queue.length; i++) {
            out += "|";
            if(queue[i] != null) {
                out += queue[i];
            }
            else {
                out += " ";
            }
        }
        out += "|";
        System.out.println(out);
    }

    public static void main(String[] args) {
        CircularArrayQueue q = new CircularArrayQueue(6);
        try {
            q.enqueue("B");
            q.enqueue("Z");
            q.enqueue("P");
            q.enqueue("A");
            q.enqueue("Q");
            q.display();
            String res = q.dequeue();
            System.out.println("removed " + res);
            res = q.dequeue();
            System.out.println("removed " + res);
            res = q.dequeue();
            System.out.println("removed " + res);
            q.enqueue("M");
            q.enqueue("E");
            q.enqueue("W");
            q.display();
        }
        catch (Exception e) {
            System.out.println("you added to much to this queue");
        }
    }
}           
