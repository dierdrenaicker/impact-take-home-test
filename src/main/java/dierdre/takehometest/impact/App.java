package dierdre.takehometest.impact;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Scanner;
import dierdre.takehometest.impact.NumberRangeSummarize.*;

public class App 
{
    public static void main( String[] args )
    {
        String inputString = "";
        String summarizedList;
        try {
            File testFile = new File("src/main/resources/sample1.txt");
            Scanner fileScanner = new Scanner(testFile);

            while(fileScanner.hasNextLine()) {
                inputString = fileScanner.nextLine();
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        RangeSummarizer rSum = new RangeSummarizer();
        Collection<Integer> input = rSum.collect(inputString);
        summarizedList = rSum.summarizeCollection(input);

        System.out.println("Summarized List: " + summarizedList);



    }
}
