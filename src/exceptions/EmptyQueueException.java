//Maryam Fadaei
//EmptyQueueException.java
//301018444
//July 3, 2013
package exceptions;

public class EmptyQueueException extends Exception{
	//Default constructor
	public EmptyQueueException()
	{	
	}//end of default constructor
	// Parameterized constructor
	public EmptyQueueException(String msg)
	{
		super(msg);
	}//end of constructor

}//end of EmptyQueueException class
