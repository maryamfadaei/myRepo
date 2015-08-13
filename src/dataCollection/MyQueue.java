package dataCollection;

import exceptions.ElementAlreadyInListException;
import exceptions.ElementNotInListException;
import exceptions.EmptyListException;
import exceptions.QueueException;
import interfaces.MyQueueInterface;
import interfaces.Queueable;


public class MyQueue implements MyQueueInterface {
	
	private MyFlexibleList list=null;
	private Queueable firstItem=null;
	//Default constructor
	public MyQueue(){
		list = new MyFlexibleList();
	}//end default constructor
	@Override
	public void enqueue(Queueable element) throws QueueException {
		try {
			if(isEmpty())
				this.setFistItem(element);
			list.insert(element);
			
		} catch (ElementAlreadyInListException e) {
			throw new QueueException("Item already in the queue");
		}
	
	}//end enqueue
	@Override
	public Queueable dequeue() throws QueueException 
	{
		Queueable retItem=null;
		try {
			retItem = (Queueable) list.delete(firstItem);
			this.setFistItem((Queueable)list.getFistNode());
		} catch (EmptyListException | ElementNotInListException e) {
			throw new QueueException("Queue is empty");
		}
		return retItem;
		
	}

	@Override
	public void dequeueAll() {
	}//end dequeueAll

	@Override
	public Queueable peek() throws QueueException {
		// TODO Auto-generated method stub
		Queueable ret = null;    
		if ((ret=(Queueable) list.getFistNode())!=null)
				return ret;
		else
		{
			throw new QueueException("QueueExcepton on peek"
					+"queue empty");
		}
			
	}
    
	@Override
	public boolean isEmpty() {
		if (this.count() == 0)
			return true;
		else
			return false;
	}//end isEmpty
	private void setFistItem(Queueable item)
	{
		this.firstItem = item;
	}
	private int count()
	{
		return list.count();
	}
}
