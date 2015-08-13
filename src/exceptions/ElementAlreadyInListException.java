//Maryam Fadaei
//ElementAlreadyInListException.java
//301018444
//July 3, 2013
package exceptions;

//Class Description 
//This exception is thrown when there is insufficient
//amount of money to carry on an operation such as withdraw

public class ElementAlreadyInListException extends Exception 
{ 
// Default constructor
public ElementAlreadyInListException( ) 
{
} // end of constructor

// Parameterized constructor
public ElementAlreadyInListException( String msg )
{
	// Question: where is msg stored? Check out Exception class in Java API
   super( msg );
   
} // end of constructor

} // end of InsufficientAmountOfMoneyException class 

