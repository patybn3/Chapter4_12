/* Problem Set 4 - 12 Chapter 4 Object-Oriented Data Structures Using Java, 4th Edition
-------------------------------------------------------------*
/*
Name: Patricia Antlitz
Date: 10/07/2022
Class: CIS-252 Computer Science II - NECC Fall 2022

 * Please read the README file for detailed information about this program.

 * This file is the main class that runs this program
 * newList object is created from the ArrayBoundedQueue.java which implements an interface, QueueInterface.java class
 * The following files are NOT original to this code (not coded by me):
    * QueueInterface.java
    * QueueUnderflowException.java
    * QueueOverflowException.java
 * The following file was partially coded by me (methods added): ArrayBoundedQueue.java
 * This is a simple main class, no user intake is necessary. All values are given by the program as a test
 * It will ask the user to enter the numbers to form the stack
*/

/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */

public class Chapter4_12_PatriciaAntlitz
{
    public static void main(String[] args)
    {
        ArrayBoundedQueue<Integer> newList = new ArrayBoundedQueue<>(10);

        //this loop will insert 10 numbers into the queue
        System.out.println("Numbers on This List:");
        for(int gen = 0; gen < 10; gen++)
        {
            //enqueue method will received numbers from 0 - 9
            newList.enqueue(gen);
        }
        //prints the list
        newList.toString();
        //size of the list
        System.out.println("Size: " + newList.size());
        //spaces available
        System.out.println("Empty Space: " + newList.space());
        //
        newList.remove(2);
        newList.toString();

        newList.swapStart();
        newList.toString();

        newList.swapEnd();
        newList.toString();

        System.out.println("\nDequeue Example: ");
        newList.dequeue();
        newList.toString();

        System.out.println();
        System.out.println("Empty Space: " + newList.space());
    }
}
