//Written by Adrian Alvarez
import java.util.Scanner;

public class A_below_average_winter {

	public static void main(String[] args) {
		double[] temperatures = new double[10];// created an array to store 10 days
		try (Scanner keyboard = new Scanner (System.in)) {
			double sum = 0;// set array sum to = 0
			
			System.out.println("Welcome to the temperature checker!");
			
			for(int i = 0; i < temperatures.length; i++) {
				System.out.println("Enter temperature for day " + (i + 1) + " (enter a decimal number): ");
				double newTemperature = keyboard.nextDouble();
				
				if (newTemperature >= 0.0) {
					temperatures[i] = newTemperature;//adds input from i to store new temperatures
					sum += newTemperature;//adds the sum of all input temperatures
				}
				else {
					System.out.println("invalid number please use positive number!");//warning for a negative input number
				}
			}
				double averageTemperature = sum / temperatures.length;{// calculates the average temperature by getting the sum and dividing by 10 
					System.out.println("The average temperature over 10 days is: " + averageTemperature);//outputs the average
					
					System.out.println("The temperatures below the average are: ");//outputs numbers below averageTemperature
					for(double temperature : temperatures) {
						if ( temperature < averageTemperature) {
							System.out.println(temperature);
						}
					}
			}
		}
	}

}
