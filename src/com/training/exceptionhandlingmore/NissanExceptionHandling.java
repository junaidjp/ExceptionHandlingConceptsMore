package com.training.exceptionhandlingmore;
import java.util.List;

/**
 * Get the Latest Nissan Car Model in MiddleEast 
 * No matter what  Print the Name of the
 * sales Agent working on this Car
 * 
 * @author junaidpasha
 *
 */
public class NissanExceptionHandling {

	public static String agentName = "Omar";
	public static String customerName = "Sam";

	public static void main(String args[]) {

		CarDB carDb = new CarDB();
		
		// Get the Models for that market
		String nissanModels[] = carDb.getLatestNissanModelsMiddleEast();

		try {
			
			System.out.println("The latest Model are " + nissanModels[3]);
		} 
		catch (Exception ex) {
			System.out.println("The system throw a Exception");
			ex.printStackTrace();
		}

		finally {

			System.out.println("The Agent who is working on this Car is"
					+ agentName);
			System.out.println("The Customer name is" + customerName);

		}

	}
}