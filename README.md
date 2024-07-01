***---OOPS:---***

1. Write a Java program to create a class called "MusicLibrary" with a collection of songs and methods to add and remove songs, and to play a random song.


***---Collections Framework:---***

**ArrayList:**
1. Write a program to create an ArrayList of Strings and add elements to it. Then, iterate through the ArrayList and print each element.
2. Write a program to remove duplicates from an ArrayList of integers.
3. Write a program to sort an ArrayList of Strings alphabetically.

**LinkedList:**
1. Write a program to create a LinkedList of integers and add elements to it. Then, iterate through the LinkedList and print each element.
2. Write a program to reverse a LinkedList.
3. Write a program to find the middle element of a LinkedList.

**HashMap:**
1. Write a program to create a HashMap where the keys are Strings (representing names) and the values are Integers (representing ages). Add some entries and then iterate through the HashMap, printing each key-value pair.
2. Write a program to remove an entry from a HashMap given the key.
3. Write a program to check if a specific key exists in a HashMap.

**HashSet:**
1. Write a program to create a HashSet of strings and add elements to it. Then, iterate through the HashSet and print each element.
2. Write a program to find the intersection of two HashSet objects.
3. Write a program to check if a specific element exists in a HashSet.

***---Java 8:---***

**Lambda Expressions:**
1. Write a program that uses lambda expressions to implement a simple interface (e.g., Runnable, Comparator).
2. Rewrite a traditional anonymous inner class with a lambda expression.

**Streams:**
1. Write a program that uses Streams to filter a list of strings based on a condition.
2. Write a program that uses Streams to map a list of integers to their squares.
3. Write a program that uses Streams to find the maximum element in a list of integers.

**Functional Interfaces:**
1. Write a custom functional interface and use it with lambda expressions.
2. Write a program that takes a list of strings and sorts them based on their length using a Comparator composed with lambda expressions.

**Method References:**
1. Write a program that demonstrates method references with a static method.
2. Write a program that demonstrates method references with an instance method of an object.

**Optional:**
1. Write a program that uses Optional to handle a potentially null value.
2. Write a program that uses Optional to retrieve a value from a map and handle the absence of that key gracefully.

**Default Methods:**
1. Write a program that demonstrates the use of default methods in interfaces.
2. Write a program that demonstrates multiple inheritance of default methods from interfaces.

***---Multithreading:---***

**Creating Threads:**
1. Write a program to create a simple thread by extending the Thread class and overriding its run() method.
2. Write a program to create a thread by implementing the Runnable interface and passing it to a Thread object.

**Synchronization:**
1. Write a program to demonstrate synchronization using the synchronized keyword.
2. Write a program to demonstrate synchronization using synchronized methods.

**Thread Pools:**
1. Write a program to create a fixed-size thread pool using Executors.newFixedThreadPool() and submit tasks to it.
2. Write a program to create a cached thread pool using Executors.newCachedThreadPool() and submit tasks to it.

**CompletableFuture:**
1. Write a program to create a CompletableFuture and supply a result using CompletableFuture.completedFuture().
2. Write a program to create a CompletableFuture and supply a result asynchronously using CompletableFuture.supplyAsync().
3. Write a program to combine two CompletableFutures and perform some action when both are complete using thenCombine().

**Thread Coordination:**
1. Write a program to demonstrate thread coordination using wait() and notify().
2. Write a program to demonstrate thread coordination using CountDownLatch.

**Concurrency Utilities:**
1. Write a program to demonstrate the use of Semaphore to control access to a shared resource.
2. Write a program to demonstrate the use of CyclicBarrier to synchronize threads at a barrier point.

***---Exception Handling:---***

**Basic Exception Handling:**
1. Write a program that divides two numbers entered by the user. Handle the ArithmeticException that may occur if the divisor is zero.

**Custom Exception:**
1. Define a custom exception class called InvalidAgeException. Write a program that takes the age of a person as input and throws InvalidAgeException if the age is less than 0 or greater than 150.

**Try-Catch-Finally:**
1. Write a program to read integers from the user until the user enters "done". Calculate the average of the entered numbers and handle any NumberFormatException that may occur.

**Multiple Catch Blocks:**
1. Write a program that takes two integers as input and performs division. Handle both ArithmeticException and InputMismatchException.

**Nested Try-Catch Blocks:**
1. Write a program that reads a file path from the user and attempts to open the file. Handle both FileNotFoundException and IOException.

**Throwing Exceptions:**
1. Write a method called validateEmail that accepts an email address as a parameter and throws an IllegalArgumentException if the email address is not valid (e.g., doesn't contain "@" symbol).

**Chained Exceptions:**
1. Write a program that reads an integer from the user and attempts to convert it to a String. Handle NumberFormatException and throw a custom exception ConversionException with the original exception as the cause.