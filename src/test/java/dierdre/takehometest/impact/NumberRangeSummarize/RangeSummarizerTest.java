package dierdre.takehometest.impact.NumberRangeSummarize;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Collection;
import org.junit.Test;

public class RangeSummarizerTest {

    /**
     * Tests if the collect method in the RangeSummarizer class produces a non-empty collection when given 
     * a list of numbers
     */
    @Test

    public void isCollectionNotEmpty() {
        String testInput = "1,3,6,7,8,12,13,14,15,21,22,23,24,31,32,33";
        RangeSummarizer rSum = new RangeSummarizer();
        Collection<Integer> input = rSum.collect(testInput);
        assertFalse(input.isEmpty());

    }

    /**
     * Tests if the collect method in the RangeSummarizer class produces an empty collection when given a list not 
     * containing numbers
     */
    @Test
    public void isCollectionEmpty() {
        String testInput = "abc, cde";
        RangeSummarizer rSum = new RangeSummarizer();
        Collection<Integer> input = rSum.collect(testInput);
        assertTrue(input.isEmpty());

    }

    /**
     * Tests if the collect method in the RangeSummarizer class has the required size when given 
     * a list of numbers
     */

    @Test 

    public void isSizeCorrect() {
        String testInput = "1,3,6,7,8,12,13,14,15,21,22,23,24,31,32,33";
        RangeSummarizer rSum = new RangeSummarizer();
        Collection<Integer> input = rSum.collect(testInput);
        assertEquals(16, input.size());
    }

    /**
     * Tests if the summarizeCollection method in the RangeSummarizer class produces the correct results when ending in a numbers in a range
     */
    @Test
    public void isSummarized1() {
        String testInput = "1,3,6,7,8,12,13,14,15,21,22,23,24,31,32,33";
        RangeSummarizer rSum = new RangeSummarizer();
        Collection<Integer> input = rSum.collect(testInput);
        String results = rSum.summarizeCollection(input);

        String expResults = "1, 3, 6-8, 12-15, 21-24, 31-33";
        assertEquals(expResults, results);
    }

     /**
     * Tests if the summarizeCollection method in the RangeSummarizer class produces the correct results when ending with a number not in a range
     */
    @Test
    public void isSummarized2() {
        String testInput = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        RangeSummarizer rSum = new RangeSummarizer();
        Collection<Integer> input = rSum.collect(testInput);
        String results = rSum.summarizeCollection(input);

        String expResults = "1, 3, 6-8, 12-15, 21-24, 31";
        assertEquals(expResults, results);
    }
}
