/*ZeroOrNegativeAmountOfMoneyException.java
 * Author: Maryam Fadaei
 * Std Number: 301018444
 * Lab Number: Assignment3
 * Created on: July 3 2013
 */

package exceptions;

// Class Description 
//   This exception is thrown when the amount of money to
//   be either deposited or withdrawn is 0.0 or negative

public class ZeroOrNegativeAmountOfMoneyException extends java.lang.Exception 
{  
    // Default constructor
    public ZeroOrNegativeAmountOfMoneyException( ) 
    {
    	// Question: why do we provide an empty default constructor?
    	
    } // end of constructor
    
    // Parameterized constructor
    public ZeroOrNegativeAmountOfMoneyException(String msg) 
    {
        super( msg );
        
    } // end of constructor

} // end of ZeroOrNegativeAmountOfMoneyException class