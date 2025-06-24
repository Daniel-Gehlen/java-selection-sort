# Selection Sort Implementation in Java

This repository contains a Java implementation of the Selection Sort algorithm, 
an in-place comparison sorting algorithm with O(n²) time complexity.

## How to Run
1. Compile: `javac SelectionSort.java`
2. Execute: `java SelectionSort`

## Running Tests
Compile and run the test file:
```bash
javac -cp junit.jar SelectionSortTest.java
java -cp junit.jar:. org.junit.runner.JUnitCore SelectionSortTest
```

## Algorithm Diagram
```mermaid
graph TD

subgraph SelectionSortProcess
    findMin[Find Minimum]
    swap[Swap Elements]
    repeat[Repeat for Unsorted Part]
end

subgraph ExampleExecution
    inputArray[[64, 34, 25, 12, 22]]
    sortedArray[Sorted Array]
    printOutput[Print Result]
end

findMin --> swap
swap --> repeat
repeat --> findMin

inputArray --> |passed to| SelectionSort
SelectionSort --> |produces| sortedArray
sortedArray --> |printed by| printOutput
```
