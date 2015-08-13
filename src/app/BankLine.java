package app;

import interfaces.Listable;
import interfaces.Queueable;

public class BankLine implements Queueable {

	protected int waitingTime;
	protected int numberofCustomer = 0;
	protected int arrivalTime;
	protected int transactionLenght;
	//default constructor
	public BankLine(){
		
	}
	public BankLine(int anArrival, int lenght){
		arrivalTime = anArrival;
		transactionLenght = lenght;
		
	}
	public void setWaitingTime(int newWaitingTime){
		waitingTime = newWaitingTime;
	}
	public int getWaitingTime(){
		return waitingTime; 
	}
	
	public void setNumberofCustomer(int newNumberofCustomer){
		numberofCustomer = newNumberofCustomer;
	}
	public int getNumberofCustomer(){
		return numberofCustomer; 
	}
	public void setArrivalTime(int newArrivalTime){
		arrivalTime = newArrivalTime;
	}
	public int getArrivalTime(){
		return arrivalTime; 
	}
	public void setTransactionLenght(int newTransactionLenght){
		transactionLenght = newTransactionLenght;
	}
	public int getTransactionLenght(){
		return transactionLenght; 
	}
	public int calculateWaitTime(int transactionStart){
		return waitingTime = arrivalTime + transactionStart;
		
	}
	
	@Override
	public int compareTo(Listable otherObject) {
		// TODO Auto-generated method stub
		return 0;
	}
}

