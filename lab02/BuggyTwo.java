package lab02;

import java.util.ArrayList;
import java.util.Arrays;

public class BuggyTwo {

    /**
     * Remove any consecutive entries that occur exactly 2x in a row.
     * Does not remove things that occur 3x in a row.
     * Ex: [1,1,2,2,2,3,4,4,5,5] should be turned into [2,2,2,3].
     * @param nums The arraylist to remove numbers from
     */
    public static void removeRepeats(ArrayList<Integer> nums) {
        for (int i=0; i<nums.size()-1; i++) {
            /*
            Current one is equal to previous, but not equal to next
            This means there are exactly two in a row -> remove both
            If they are all equal (or none are equal), then we
            do not want to remove.
             */
            int prev = i-1;
            int next = i+1;
            if (nums.get(prev) == nums.get(i) && nums.get(i) != nums.get(next)) {
                nums.remove(i);
                nums.remove(i - 1);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,1,2,2,2,3,4,4,5,5));
        System.out.println("Original is: " + nums);
        removeRepeats(nums);
        System.out.println("Removed is: " + nums);
        System.out.println("Correct should be: [2,2,2,3]");
    }
}
