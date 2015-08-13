package app;

import java.io.File;
import java.util.*;
import java.io.*;

import app.Event.eventType;

import dataCollection.MyQueue;
import dataCollection.MySortedList;
import exceptions.ElementAlreadyInListException;
import exceptions.QueueException;

public class BSA {

	
	public static void main(String[] args) 
	{
		testQueue();
		testSortedList();
		
	}
	private static void deleteEventList(){
		
	}
	private int calculateCurrentTime(){
		return 0;
	} 
	private int calculateDepartureTime(){
		return 0; 
	}
	//readong from file
	public void FileIOTest() {
		// Description: Open file, init variables, catch exceptions:
		
		Scanner theKbd = null; // to help us read keyboard input from user
		Reader fileIn; // file to be read
		boolean done = false; // indicate when we are done reading the file
		Scanner scanfile = null; // Scanner file to be read 
		int total = 0; // Sum of numbers read 
		// Ask the user for a file name:
		theKbd = new Scanner(System.in);
		System.out.print("Please, enter the name of a file + path: ");
		// Read file name in
		String aFileName = theKbd.nextLine();
		// Opening file for reading
		try{ fileIn = new FileReader(aFileName); } 
		catch(FileNotFoundException caughtException) {
		System.out.println("Couldn’t open the file : " + aFileName );
		return; // exit main and stop program
		}
		scanfile = new Scanner(fileIn);
		
		// Reading file
		while(!done) {
		// Reading next integer in file and creating running total
		try{ 
		total += scanfile.nextInt();
		} 
		// What was read was not an integer: eat rest of line
		catch(InputMismatchException caughtException) {
		scanfile.nextLine();
		}
		//Have reach the end of the file
		catch(NoSuchElementException caughtException) {
		done = true;
		}
		}
		}
	//
	//Process an arrival event
	private static void proccessArrival(Event newEvent, File arrivalFile,
			MySortedList anEventList, MyQueue bankQueue){
		//proccess an arrival event
		boolean atFront;
		atFront = bankQueue.isEmpty();
		//bankQueue.enqueue(newEvent);
		
	}
	//process a departure event
	private static void proccessDeparture(Event newEvent,MySortedList anEventList, MyQueue bankQueue){
		
	}
	//perform the simulation
	private static void simulate(){
		MyQueue bankQueue = new MyQueue();
		MySortedList eventList = new MySortedList();
		File arrivalFile;
		//get the first arrival event from the input file 
		// place it in the event list
		try {
			eventList.insert(new Event(1,3));
		} catch (ElementAlreadyInListException e) {
			// TODO Auto-generated catch block
						e.printStackTrace();
		}
		while (eventList.size()>0){
			Event newEvent = new Event(eventList.getFistNode());
			
			//if arrival Event is in the event list
			// How to find out?
			//proccessArrival(newEvent, arrivalFile,eventList,bankQueue);
	
			
			//if departure Event is i the event list
		}
		BankLine b1 = new BankLine(1,3);
		BankLine b2 = new BankLine(1,3);
		
	}
	private static void testQueue()
	{
		System.out.println("testing queue");
		MyQueue mQ = new MyQueue();
	
		Person p1 = new Person("f", "l");
		Person p2 = new Person("f2", "l2");
		Person p3 = new Person("f3", "l3");
		Person p4 = new Person("f4", "l4");
		Person p5 = new Person("f5", "l5");
		try {
			mQ.enqueue(p1);
			mQ.enqueue(p2);
			mQ.enqueue(p3);
			mQ.enqueue(p4);
			mQ.enqueue(p5);
			Person pOut = (Person)mQ.dequeue();
			System.out.println(pOut.getFirstName());
			System.out.println((Person)mQ.dequeue());
			System.out.println((Person)mQ.dequeue());
			System.out.println((Person)mQ.dequeue());
			System.out.println((Person)mQ.dequeue());
			//System.out.println((Person)mQ.dequeue());
			mQ.enqueue(new Person("f6", "l6"));
			mQ.enqueue(new Person("f8", "l8"));
			System.out.println((Person)mQ.peek());
			mQ.dequeue();
			System.out.println((Person)mQ.peek());
		} catch (QueueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void testSortedList()
	{
		
		MySortedList sortedAccounts = new MySortedList();
		try {
			sortedAccounts.insert(new Account(2));
			sortedAccounts.insert(new Account(4));
			sortedAccounts.insert(new Account(7));
			sortedAccounts.insert(new Account(6));
			sortedAccounts.insert(new Account(1));
			sortedAccounts.insert(new Account(8));
			sortedAccounts.insert(new Account(3));
			sortedAccounts.insert(new Account(5));
			sortedAccounts.insert(new Account(18));
		} catch (ElementAlreadyInListException e) {
			// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
	}
}
