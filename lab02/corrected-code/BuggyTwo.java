package lab02;

import java.util.ArrayList;
import java.util.Arrays;

public class BuggyTwo {

    /**
     * Remove any consecutive entries that occur exactly 2x in a row.
     * Does not remove things that occur 3x in a row.
     * Ex: [1,1,2,2,2,3,4,4,5,5] should be turned into [2,2,2,3].
     *
     * @param nums The arraylist to remove numbers from
     */
    public static void removeRepeats(ArrayList<Integer> nums) {
        // Start at 1 and look backwards
        int curind = 1;
        while (curind < nums.size()) {
            int prevind = curind - 1;

            // Check if this element equals previous element
            if (nums.get(prevind) == nums.get(curind)) {
                /*
                 Check forward for further repeats.
                 If repeated forward, skip ahead past repeats
                 Need to make sure we don't walk off end of list
                 */
                boolean stillGoing = true;
                int count = 0;
                while (stillGoing && curind + count < nums.size() - 1) {
                    if (nums.get(curind + count + 1) == nums.get(curind)) {
                        count++;
                    }
                    else {
                        stillGoing = false;
                    }
                }

                /*
                Exactly two in a row -> remove
                More than two in a row -> skip ahead
                 */
                if (count == 0) {
                    nums.remove(curind);
                    nums.remove(prevind);
                    // If I removed, need to adjust index
                    // Know that next one is not same, so can jump past it
                    curind -= 1;
                }
                else {
                    curind += count;
                }
            }
            curind++;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,1,2,2,2,3,4,4,5,5));
        System.out.println("Original is: " + nums)
        removeRepeats(nums);
        System.out.println("After removal is: " + nums);
        System.out.println("Correct is: [2, 2, 2, 3]");
    }
}
