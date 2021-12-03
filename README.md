# Title : Number Range Summarizer

## Description

This project defines a Number Range Summarizer that takes a list of numbers and if numbers in the list are in sequential order, it puts those numbers in a range.

## NumberRangeSummarizer
The NumberRangeSummarizer is an interface that has two methods.
One to collect the input, comma delimited list of numbers, and one to summarize the input. RangeSummarizer.java implements this interfacea and adds the following functionality to the methods.

* ### collect

    The collect method scans the comma delimited list of numbers, sent in as a String parameter, and adds the numbers to an Integer collection, which is returned by the method.

* ### summarizeCollection

    Iterates through the Integer collection and detects if Integer values are sequential or not.
    * If Integers are sequential, it puts those Integers into a range and adds that range to a String collection. 
    * If the Integers are not sequential they are just added 
    to the String collection.
    * The String collection is iterated through to produce a Summarized comma delimited list of numbers, which is returned by the method.


## How to use

### Input 

The input is a text file, `sample1.txt`, which can be found in the resources folder in `src/main/resources`.

### Running the code 

* To run the code:

```
 mvn exec:java
```
* To run the test cases:

```
 mvn test
```


### Output
The student's student number and their allocated project is printed to terminal:

```
"Summarized List: <Summarized List of Numbers>"
```