
//Maryam Fadaei
//MyQueue_Array.java
//301018444
//July 3, 2013

package dataCollection;

import exceptions.QueueException;
import interfaces.MyQueueInterface;
import interfaces.Queueable;

public class MyQueue_Array implements MyQueueInterface {
	//data member 
	private final int MAX_QUEUE = 50; // maximum size of queue
	private Queueable[] items;
	private int front, back, count;
	//Default constructor
public MyQueue_Array()
{
	items = new Queueable[MAX_QUEUE];
	front = 0;
	back = MAX_QUEUE-1;
	count=0;
}//end of default constructor
//queue operation
public boolean isEmpty()
{
	return count == 0;
}//end isEmpty
@Override
public void enqueue(Queueable element)throws QueueException {
	// add an item to the end of queue
	if (!isFull())
	{
		back = (back+1) % MAX_QUEUE;
		items[back] = element;
		++count;
	}
	else{
		throw new QueueException("QueueException on enqueue:" 
							+ "Queue is full" );
	}//end if
}//end enqueue
@Override
public Queueable dequeue() throws QueueException {
	// TODO Auto-generated method stub)
	if (!isEmpty()){
		//queue is not empty remove front
		Queueable queueFront = items[front];
		front = (front+1)%(MAX_QUEUE);
		--count;
		return queueFront;
	}
	else{
		throw new QueueException("QueueException on denqueue:" 
				+ "Queue is empty" );
}//end if
		
	
}
@Override
public void dequeueAll() {
	// reset the Queue
	items = new Queueable[MAX_QUEUE];
	front=0;
	back=MAX_QUEUE;
	count=0;
	
}
@Override
public Queueable peek() throws QueueException {
	// TODO Auto-generated method stub 
	if(!isEmpty()){
		//queue is not empty retrieve the front
		return items[front];
	}
	else{
		throw new QueueException("Queue Exceptio on peek:"+
									"Queue empty"); 
	}
}
public boolean isFull()
{
	return count== MAX_QUEUE;
}//end is full
}//end of MyQueue_Array class
