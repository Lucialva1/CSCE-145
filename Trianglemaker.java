
//Written by Adrian Alvarez
import java.util.Scanner;



public class Trianglemaker {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Welcome to triangle maker! Choose how many stars you want!");
		Scanner scan = new Scanner(System.in);
		int numOfStars = scan.nextInt();// set the int to numOfStars so whatever the input is that is what is recognized
		
		for(int i = 1; i <= numOfStars; i++) {// int i is adds one and loops back as it reaches input number/ i represents the number of rows
			for (int j = 0; j < i; j++) {// int j takes care of the amount of columns of stars on each row of stars
				System.out.print("*");
			}
			System.out.println();
		}
			for(int i = numOfStars - 1; i > 0; i--) {// this for loop dictates when the stars hit the input number, to subtract one from each column.
				for (int j = 0; j < i; j++) {// once j is not less than 1 it will print another line
					System.out.print("*");
				}
				System.out.println();
			}
		}
	
	
}
