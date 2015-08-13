package dataCollection;

import exceptions.ElementAlreadyInListException;
import exceptions.QueueException;
import interfaces.MyQueueInterface;
import interfaces.Queueable;


public class MyQueue_LL implements MyQueueInterface {
	
	private Node lastNode;
	private MyFlexibleList list=null;
//Default constructor
	public MyQueue_LL(){
		lastNode = null;
		list = new MyFlexibleList();
	}//end default constructor
	@Override
	public void enqueue(Queueable element) throws QueueException {
		// TODO Auto-generated method stub
		Node newNode = new Node(element);
		//insert new node
		if (isEmpty()){
			//insertion into empty queue
			newNode.setNext(newNode);
		}
		else{
			//insertion into nonempty queue
			newNode.setNext(lastNode.getNext());
			lastNode.setNext(newNode);
		}//end if
		try {
			list.insert(element);
		} catch (ElementAlreadyInListException e) {
			// TODO Auto-generated catch block
			throw new QueueException("Item already in the queue");
		}
	lastNode = newNode; // new node is at back
	}//end enqueue
	@Override
	public Queueable dequeue() throws QueueException {
		// TODO Auto-generated method stub 
		if(!isEmpty()){
			//queue is not empty remove front
			Node firstNode = lastNode.getNext();
			//queue only has one node
			if (firstNode == lastNode){
				lastNode = null;
			}
			else{
				lastNode.setNext(firstNode.getNext());
			}
			return (Queueable)firstNode.getElement() ;
		}
		else{
			throw new QueueException("QueueException on dequeue:"
					+"queue is empty");
		}
		
	}

	@Override
	public void dequeueAll() {
		// TODO Auto-generated method stub
		lastNode = null;
	}//end dequeueAll

	@Override
	public Queueable peek() throws QueueException {
		// TODO Auto-generated method stub
		if(!isEmpty()){
			//queue is not empty retrieve front
			Node firstNode =lastNode.getNext();
			return (Queueable)firstNode.getElement();
		}
		else{
			throw new QueueException("QueueExcepton on peek"
					+"queue empty");
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return lastNode == null;
	}//end isEmpty
}
