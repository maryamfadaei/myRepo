// File : Node.java
// Author: Maryam Fadaei
// Std Number: 301018444
// Lab Number: Assignment2
// Created on: June 2013
// Revised on: June 17, 2013

package dataCollection;
import interfaces.Listable;


class Node implements Listable {
	// data members
	private Listable element; // data
	private Node next; // link: reference to next Node
	// constructor
	public Node() {
		this(null, null);
	} // end constructor
	public Node(Listable newElement){ 
		this( newElement, null );
	}// end constructor
	public Node(Listable newElement, Node nextNode ){ 
	element = newElement; 
	next = nextNode;
	} // end constructor
	
	// + getters and setters
	public void setElement(Listable newElement){
		element = newElement;
	}//
	
	public Listable getElement(){
		return element;
	}//end getElement
	
	public void setNext(Node nextNode) {	
		next = nextNode;
		
	} // end setNext
	
	public	Node getNext( ) {
		return next;
	} // end getNext
	@Override
	public int compareTo(Listable otherObject) {
		// TODO Auto-generated method stub
		return 0;
	}
}