// Author: Maryam Fadaei
// Std Number: 301018444
// Lab Number: Assignment3
// std Number: MyQueueInterface.java
// Created on: July 3 2013
// Revised on:
package interfaces;

import exceptions.QueueException;

 
public interface MyQueueInterface {
	
	public void enqueue(Queueable element ) throws QueueException;
	// Adds an element to the .
	//Throws QueueException when the operation is not 
	//successful, if needed!
	public Queueable dequeue( ) throws QueueException;
	// Removes an element from the queue. It also returns it.
	//Precondition: Queue is not empty.
	//Throws EmptyQueueException if queue is empty.
	//Throws QueueException when the operation is not 
	//successful, if needed!
	public void dequeueAll( );
	// Removes all elements from the queue.
	//Postcondition: isEmpty( ) returns “true”.
	public Queueable peek() throws QueueException;
	// Retrieves an element from the queue and returns it.
	//Precondition: Queue is not empty.
	//Postcondition: the queue is unchanged.
	//Throws EmptyQueueException if queue is empty.
	//Throws QueueException when the operation is not 
	//successful, if needed!
	public boolean isEmpty( );
	// Returns “true” is the queue is empty, otherwise returns 
	//“false”.
	
}// end of Queueable interface
