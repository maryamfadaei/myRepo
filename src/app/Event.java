package app;

import interfaces.Listable;

 class Event implements Listable{

	//data member
	private Listable element; 
	protected int arrivalTime;
	protected int transactionLenght;
	protected int currentTime;
	protected int departureTime;
	public enum eventType{
		A(1),
		D(2);
		private int value;
		private eventType(int value){
			this.value = value;
		}
	}
	public Event(){
		
	}
	public Event(int anArrival, int lenght){
		arrivalTime = anArrival;
		transactionLenght = lenght;
		
	}
	public Event(int anArrival, int lenght, int serviceTime){
		arrivalTime = anArrival;
		transactionLenght = lenght;
		departureTime = serviceTime + lenght;
	}
	public Event(Listable newElement) {
		// TODO Auto-generated constructor stub
		element = newElement; 
	}
	public void setElement(Listable newElement){
		element = newElement;
	}//
	
	public Listable getElement(){
		return element;
	}//end getElement
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
	public void setCurrentTime(int newCurrentTime){
		currentTime = newCurrentTime;
	}
	public int getCurrentTime(){
		return currentTime; 
	}
	public void setDepartureTime(int newDepartureTime){
		departureTime = newDepartureTime;
	}
	public int getDepartureTime(){
		return departureTime; 
	}
	
	@Override
	public int compareTo(Listable otherObject) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}

