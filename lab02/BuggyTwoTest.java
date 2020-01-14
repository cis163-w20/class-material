package lab02;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BuggyTwoTest {

    //Testing remove only in middle
    @Test
    public void testRemoveMiddle() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,2,3));
        ArrayList<Integer> correct = new ArrayList<>(Arrays.asList(1,3));
        BuggyTwo.removeRepeats(nums);
        assertEquals(correct,nums);
    }

    //Testing remove at front
    @Test
    public void testRemoveFront() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,1,2,3));
        ArrayList<Integer> correct = new ArrayList<>(Arrays.asList(2,3));
        BuggyTwo.removeRepeats(nums);
        assertEquals(correct,nums);
    }

    //Testing remove at end
    @Test
    public void testRemoveEnd() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,4));
        ArrayList<Integer> correct = new ArrayList<>(Arrays.asList(1,2,3));
        BuggyTwo.removeRepeats(nums);
        assertEquals(correct,nums);
    }

    //Testing not removing triple in middle
    @Test
    public void testSkipTripleMiddle() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,2,2,3,4));
        ArrayList<Integer> correct = new ArrayList<>(Arrays.asList(1,2,2,2,3,4));
        BuggyTwo.removeRepeats(nums);
        assertEquals(correct,nums);
    }

    //Testing not removing triple at front
    @Test
    public void testSkipTripleFront() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,1,1,2,3,4));
        ArrayList<Integer> correct = new ArrayList<>(Arrays.asList(1,1,1,2,3,4));
        BuggyTwo.removeRepeats(nums);
        assertEquals(correct,nums);
    }

    //Testing not removing triple at end
    @Test
    public void testSkipTripleEnd() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,4,4));
        ArrayList<Integer> correct = new ArrayList<>(Arrays.asList(1,2,3,4,4,4));
        BuggyTwo.removeRepeats(nums);
        assertEquals(correct,nums);
    }

    //Testing multiple consecutive removes
    @Test
    public void testMultipleRemovesConsecutive() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,2,3,3,4,5));
        ArrayList<Integer> correct = new ArrayList<>(Arrays.asList(1,4,5));
        BuggyTwo.removeRepeats(nums);
        assertEquals(correct,nums);
    }

    //Testing multiple removes
    @Test
    public void testMultipleRemoves() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5));
        ArrayList<Integer> correct = new ArrayList<>(Arrays.asList(1,3,5));
        BuggyTwo.removeRepeats(nums);
        assertEquals(correct,nums);
    }

    //Testing combo of individual removes/skips
    @Test
    public void testBigCombo() {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,1,2,2,3,4,4,4,5,5));
        ArrayList<Integer> correct = new ArrayList<>(Arrays.asList(3,4,4,4));
        BuggyTwo.removeRepeats(nums);
        assertEquals(correct,nums);
    }
}
