public class Search {
    public static int binary(int[] data, int target) {
        return binaryh(data, target, 0, data.length-1);
    }

    public static int binaryh(int[] data, int target, int start, int end) {
        int mid = (end - start)/2 + start;
        System.out.println(start + ", " + end + ", " + mid);
        if (target == data[mid]) {
            return mid;
        }
        else if (start == mid) {
            return -1;
        }
        else if(target > data[mid]) {
            return binaryh(data, target, mid, end);
        }
        else {
            return binaryh(data, target, start, mid);
        }
    }
    
    public static void main(String[] args) {
        int[] data = {10, 20, 24, 36, 40, 60, 65, 80, 83, 90, 100, 101};
        int target = 100;
        int res = binary(data, target);
        System.out.println("target " + target + " is at pos " + res);

        target = 102;
        res = binary(data, target);
        System.out.println("target " + target + " is at pos " + res);

        target = 24;
        res = binary(data, target);
        System.out.println("target " + target + " is at pos " + res);

        target = 21;
        res = binary(data, target);
        System.out.println("target " + target + " is at pos " + res);
    }
}
