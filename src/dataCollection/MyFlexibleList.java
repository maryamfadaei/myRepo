// File: MyFlexibleList.java
// Author: Maryam Fadaei
// Std Number: 301018444
// Assignment Number: 2
//Bank Application Version4
// Created on: June 2013
// Revised on: June 17, 2013

package dataCollection;

import interfaces.Listable;
import interfaces.MyListInterface;
import exceptions.ElementAlreadyInListException;
import exceptions.EmptyListException;
import exceptions.ElementNotInListException;
//import app.Account;


//Class Description: 
//  This class is an abstract data type and implements abstract methods of MyListInterface

// Class Invariants:
//  <For you to fill in if there are any.> 

public class MyFlexibleList implements MyListInterface {

	
	// data members
		protected Node theCollection;       // collection of Listable elements - "head"
		protected int numberOfElements;     // current number of elements
		//private Node head; // not used 
		// Default constructor
		public MyFlexibleList( )
		{
			theCollection = null;
			numberOfElements = 0;

		} // end default constructor

   
	public int size() {
		
	   return numberOfElements;
		
	}

	@Override
	/*
	 Inserts an element into the list	
	  Insertion is successful, add element at the end of the list

	 */
	public void insert( Listable element ) throws ElementAlreadyInListException
	// Description: Inserts an element into the list.
	// Precondition: "element" is not already in the list. This is to say: no duplication allowed.
	// Postcondition: "element" has been added to the list.
	// Exception: Throws an ElementAlreadyInListException if "element" is already in the list.
	{	
		Node current = theCollection;
		Node previous = null;
		
		// if the list empty
		if ( numberOfElements <= 0 )
			theCollection = new Node( element, null );			
		else {
			// Verify precondition: If "element" already in list -> throw exception
			while ( current != null ) {
		       if ( current.getElement().compareTo(element) == 0 ) {
				   throw new ElementAlreadyInListException( "This element is already in the list." );			
	           } else // step forward one Node
				   previous = current;
				   current = current.getNext( );		   
			}

			// Insert the new element at the end of the List
			// Note: element can be inserted anywhere in the List
			previous.setNext(new Node( element, null ));
		}
		
		// and increment the number of elements currently in the data structure by 1.
		numberOfElements++;		

		return;
				
	} // end of insert

	//@SuppressWarnings("unused")
	@Override
	/*
	 *  Deletes this element from the list.
	 *  delete an element from the list and replace it with the last item in the list 
	 */
	public Listable delete(Listable element) throws EmptyListException, ElementNotInListException {
		Listable ret = null;
		if (numberOfElements <= 0)		
			throw new EmptyListException("\nThere are no element!\n");
		else
		{
			Node current = theCollection;
			Node nextNode = current.getNext();
			
			//there is no element
			if(current.getElement().compareTo(element) ==0){
				     ret = current.getElement();
					 theCollection= nextNode;
				     numberOfElements --;
				     return ret;
			}	
			while (nextNode!= null)
			{
			   if(nextNode.getElement().compareTo(element)==0)
			   {
				   ret = nextNode.getElement();
				   current.setNext(nextNode.getNext());
				   numberOfElements--;
				   break;
			   }
			   current = nextNode; 
			   nextNode = current.getNext();	
				 
			}
		
			if (nextNode == null) 
				//throw exception when element not found
				throw new ElementNotInListException("element is not found in the list");
		}
		
		return ret;
	}// end of delete


	@SuppressWarnings("unused")
	@Override
	/*
	 *  Returns element.
	 */
	public Listable retrieve(Listable element) throws EmptyListException, ElementNotInListException {
		
		Node current = theCollection;
		//throw exception when list is empty
		if (numberOfElements <= 0)
			
			throw new EmptyListException("\nThere are no element!\n");
		else
			while (current!=null)
			{
				 if ( current.getElement().compareTo(element) == 0 ) 
				 {		
					return current.getElement();
				 }
				 current = current.getNext();
			}
			if (current == null)	
				throw new ElementNotInListException("element is not found in the list");
		return null;
	}// end of retrieve

    public Listable getFistNode()  
    {
    	
    	if (numberOfElements <= 0)	
    			return null;
		else
			return this.theCollection.getElement();
    }
	@Override
	/*
	 Description: Deletes all the elements from the list.
	Postcondition: fill all the list with null	
	 */
	public void deleteAll() {
		
		theCollection = null;
		numberOfElements = 0;
	}// end of deleteAll
	public int count()
	{
		return numberOfElements;
	}
	public String toString( )
	// Description: Outputs all elements.
	// Postcondition: A string containing all elements (their information) is returned.
	{
		Node current = theCollection;
		
		String theString = "";
		if ( numberOfElements <= 0 )
			theString = "\nThere are no elements!";        
		else {
			while ( current != null ) {
				theString += "\n Element =>\n" + current.getElement().toString( );
			    // Go to next node
				current = current.getNext();
			}
		}
		return theString;

	} // end of toString 
		
} // end of MyFlexibleList class

