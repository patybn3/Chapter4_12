<h3>Object-Oriented Data Structure Using Java, 4th Edition</h3>

<h4>Student: Patricia Antlitz - NECC Fall 2022 <br> Computer Science II</h4>
<h5>Chapter 4 - Exercise 12</h5>

####variables used:

```java
    protected final int DEFCAP = 100; // default capacity
    protected T[] elements;           // array that holds queue elements
    protected int numElements = 0;    // number of elements in this queue
    protected int front = 0;          // index of front of queue
    protected int rear;               // index of rear of queue
```

###Methods added to `ArrayBoundedQueue.java` as required:

a. `String toString()` creates and returns a string that correctly represents
the current queue. Such a method could prove useful for testing and debugging
the class and for testing and debugging applications that use the class. Assume
each stacked element already provided its own reasonable `toString` method.<br>
```java
    public String toString();     //will loop the array, turn it to a string and print it
```
b. `int space()` returns an integer indicating how many empty spaces remain in
the queue.
```java
    public int space();           //will print the array size
```
c. `void remove(int count)` removes the front count elements from the
queue, and throws `QueueUnderflowException` if there are less than count
elements in the queue. 
```java
    public void remove(int count);      //user can select how many elements to pop
```

d. `boolean swapStart()` if there are less than two elements on the stack returns
false; otherwise it reverses the order of the top two elements on the
stack and returns true.
```java
  public boolean swapStart()        //To swap the top 2 elements
```
e. `boolean swapEnd()` if there are less than two elements on the stack returns
false; otherwise it reverses the order of the top two elements on the
stack and returns true.

```java
  public boolean swapEnd()        //To swap the top 2 elements
```

###Main class: Chapter4_12_PatriciaAntlitz.java

<hr>
<h5>Problems:</h5>

I wanted to use recursion on all methods, but I couldn't find my way around it.
I also had trouble inserting the numbers into the queue. I wanted to do it through a method in ArrayBoundedQueue (a new method)
but method enqueue has a parameter T, which didn't allow me to pass i (int) as a parameter.
I also wanted to add 10 random numbers instead of 0-9. I will, in the future, look for a different approach to random numbers. I couldn't make math.random work. 

source:<br>
https://www.softwaretestinghelp.com/java-queue-interface/

https://www.javatpoint.com/java-queue

<hr>

<h5>Technologies</hr>
- JAVA 15.0.1


<hr>

<h3>To run:</h3>
<hr>

IDE:<br>
Build the project and run the Chapter4_12_PatriciaAntlitz.java file

CLI:<br>
* Navigate to the correct directory ....../Chapter4_12_PatriciaAntlitz/src <br>
* Run on terminal:
    * javac Chapter4_12_PatriciaAntlitz.java => compile
    * java Chapter4_12_PatriciaAntlitz.java => run

by [Patricia Antlitz - GitHub](https://github.com/patybn3)