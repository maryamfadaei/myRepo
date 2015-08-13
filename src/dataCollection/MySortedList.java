//Maryam Fadaei
//MSortedList.java
//301018444
//July 4, 2013
package dataCollection;

import interfaces.Listable;
import exceptions.ElementAlreadyInListException;
//this class extends MyFlexibleList class. it inserts in the list in a sorted order.
public class MySortedList  extends MyFlexibleList
{
	public MySortedList( ) 
	{
		super();
	}
	@Override
	public void insert( Listable element ) throws ElementAlreadyInListException
	// Description: Inserts an element into the list.
	// Precondition: "element" is not already in the list. This is to say: no duplication allowed.
	// Postcondition: "element" has been added to the list.
	// Exception: Throws an ElementAlreadyInListException if "element" is already in the list.
	{	
		Node current = super.theCollection;
		//Node next = null;
		Node prv = null;
		// if the list empty
		if ( super.count() <= 0 )
			super.theCollection = new Node( element, null );			
		else {
			// Verify precondition: If "element" already in list -> throw exception
			int compare=-1;
			while ( current != null && compare == -1) 
			{
		       compare = current.getElement().compareTo(element);				
		       if (  compare == 0 ) {
				   throw new ElementAlreadyInListException( "This element is already in the list." );			
	           } 
		       else if (compare == 1)
	           {// step forward one Node
				   
	        	   //next = prv.getNext();
		    	   if (prv!=null)
		    		   prv.setNext(new Node( element, current ));
		    	   else
		    		   super.theCollection = new Node(element, current);
				   super.numberOfElements++;
				   return;
	           }
			
			   prv = current;
			   current = current.getNext();

		       
			}

			// Insert the new element at the end of the List
			// Note: element can be inserted anywhere in the List
			prv.setNext(new Node( element, null ));	
		}
		
		// and increment the number of elements currently in the data structure by 1.
		super.numberOfElements++;		

		return;
				
	} // end of insert
}
