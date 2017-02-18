package test;

import java.util.Scanner;

import com.oesia.eventmanager.EventManager;

public class EventManagementSystem {
	
	private static EventManager eventManager = new EventManager();
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Event Management System started. Enter Commands");
		
		while(true)
		{
			String line = sc.nextLine();
			eventManager.run(line);
		}	
	}

}
