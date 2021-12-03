package dierdre.takehometest.impact.NumberRangeSummarize;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Iterator;

public class RangeSummarizer implements NumberRangeSummarizer {

    public RangeSummarizer() {
    }

    /**
     * Scans the comma delimited list of numbers and adds the numbers
     * to the Integer collection
     * @param input String containing a comma delimited list of numbers
     * @return Collection of Integers extracted from the given String
     */
    public Collection<Integer> collect(String input) {

        Collection<Integer> numCollection = new ArrayList<Integer>();
        Scanner sScan = new Scanner(input);
        sScan.useDelimiter(",");
        while (sScan.hasNextInt()) {
            numCollection.add(sScan.nextInt());
        }
        sScan.close();
        return numCollection;
    }

    /**
     * Iterates through the Integer collection and detects if integer values
     * are sequential, if so, it puts those integers in a range and adds that range 
     * to a String collection. If the integers are not sequential they are just added 
     * to the String collection.
     * The String collection is iterated through to produce a Summarized comma delimited list of 
     * numbers.
     * 
     * @param input Collection of Integers from a given list of numbers
     * @return Summarized comma delimited numbers
     */

    public String summarizeCollection(Collection<Integer> input) {
        
        int base;
        int min;
        int nextInt;
        boolean inRange = false;
        String summarizedList = "";
        Collection<String> elements = new ArrayList<String>();
        Iterator<Integer> iterateInput = input.iterator();
        Iterator<String> iterateResult;

        base = iterateInput.next();
        while(iterateInput.hasNext()) {
            nextInt = iterateInput.next();
            if (nextInt == base + 1) {
                min = base;
                while (nextInt == base + 1) {
                    base = nextInt;
                    if (iterateInput.hasNext()) {
                        nextInt = iterateInput.next();
                    }
                }
                elements.add(min + "-" + base);
                inRange = base == nextInt;
            } else {
                elements.add(""+base);
            }
            base = nextInt;
        }

        if (inRange == false) {
            elements.add(""+base); 
        }

        iterateResult = elements.iterator();
        summarizedList = summarizedList + iterateResult.next();

        while (iterateResult.hasNext()) {
            summarizedList = summarizedList + ", "+ iterateResult.next();
        }
        
        return summarizedList;
    }
    
}
