public class Mystery {
    public static int foo(int[] data, int x) {
        int index = -1;
        int i = 0;
        while (index != -1 && i < data.length) {
            if (data[i] == x) {
                index = i;
            }
            i++;
        }
        return index;
    }
}
