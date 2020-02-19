
public class Path {
    static int[][] counts = new int[10][10];

    static int npaths(int i, int j) {
        if (i < 0 || i > counts.length || j < 0 || j > counts.length) {
            throw new IllegalArgumentException("Out of allowed sizes");
        }
        if (i == 0 || j == 0)
            return 1;
        else {
            if (counts[i][j] != 0)
                return counts[i][j];
            else {
                int c = npaths(i-1,j) + npaths(i, j-1);
                counts[i][j] = c;
                return c;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Path.npaths(0,0));
        System.out.println(Path.npaths(1,1));
        System.out.println(Path.npaths(2,2));
        System.out.println(Path.npaths(1,2));
        System.out.println(Path.npaths(1.1, 1.1));
        System.out.println(Path.npaths(10,10));
    }

}
