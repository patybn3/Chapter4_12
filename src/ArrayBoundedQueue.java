//---------------------------------------------------------------------------
// ArrayBoundedQueue.java        by Dale/Joyce/Weems                Chapter 4
//
// Implements QueueInterface with an array to hold the queue elements.
//
// Two constructors are provided: one that creates a queue of a default
// capacity and one that allows the calling program to specify the capacity.
//---------------------------------------------------------------------------

public class ArrayBoundedQueue<T> implements QueueInterface<T>
{
  protected final int DEFCAP = 100; // default capacity
  protected T[] elements;           // array that holds queue elements
  protected int numElements = 0;    // number of elements in this queue
  protected int front = 0;          // index of front of queue
  protected int rear;               // index of rear of queue

  public ArrayBoundedQueue() 
  {
    elements = (T[]) new Object[DEFCAP];
    rear = DEFCAP - 1;
  }

  public ArrayBoundedQueue(int maxSize) 
  {
    elements = (T[]) new Object[maxSize];
    rear = maxSize - 1;
  }

  public void enqueue(T element)
  // Throws QueueOverflowException if this queue is full;
  // otherwise, adds element to the rear of this queue.
  {  
    if (isFull())
      throw new QueueOverflowException("Enqueue attempted on a full queue.");
    else
    {
      rear = (rear + 1) % elements.length;
      elements[rear] = element;
      numElements = numElements + 1;
    }
  }

  public T dequeue()
  // Throws QueueUnderflowException if this queue is empty;
  // otherwise, removes front element from this queue and returns it.
  {   
    if (isEmpty())
      throw new QueueUnderflowException("Dequeue attempted on empty queue.");
    else
    {
      T toReturn = elements[front];
      elements[front] = null;
      front = (front + 1) % elements.length;
      numElements = numElements - 1;
      return toReturn;
    }
  }

  public boolean isEmpty()
  // Returns true if this queue is empty; otherwise, returns false.
  {              
    return (numElements == 0);
  }

  public boolean isFull()
  // Returns true if this queue is full; otherwise, returns false.
  {              
    return (numElements == elements.length);
  }
  
  public int size()
  // Returns the number of elements in this queue.
  {
    return numElements;
  }

  public String toString()
  {
    String printData = "";

    if (isEmpty())
    {
      throw new QueueUnderflowException("Print attempted on empty queue.");
    }
    else
    {
      //loops from the beginning of the queue to the end
      for(int i = front; i <= rear; i++)
      {
        //set the list to string and print it
        printData = printData + elements[i].toString();
        System.out.print(elements[i] + " ");
      }
    }
    return printData;
  }

  public int space()
  {
    System.out.println("Number of elements: " + numElements);
    return elements.length - numElements;
  }

  public void remove(int count)
  {
    if (count > numElements)
    {
      throw new QueueUnderflowException("Count out of bounds.");
    }

    front = (front + count) % elements.length;
    numElements -= count;
    System.out.println(count + " Items Removed. New List: ");
  }

  public boolean swapStart()
  {
    T firstElement;
    int calc = (front + 1) % elements.length;

    System.out.println("\nFirst Two Items Swapped: ");
    //if less than 2 elements, do not swap
    if(elements.length < 2)
    {
      return false;
    }
    else
    {
      firstElement = elements[front];
      elements[front] = elements[calc];
      elements[calc] = firstElement;
    }
    return true;
  }

  public boolean swapEnd()
  {
    T firstElement;

    System.out.println("\nLast Two Items Swapped: ");

    int calc = (rear - 1) % elements.length;

    if(elements.length < 2)
    {
      return false;
    }
    else
    {
      firstElement = elements[rear];
      elements[rear] = elements[calc];
      elements[calc] = firstElement;
    }
    return true;
  }
}