package ulohy;
//uvod do java
import java.util.Scanner;

public class uvod01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your buying price per share:");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		int num3 = (int) (num1 + num2);
		
		System.out.println("Sucet 2 cisel:" + num3);
	
	}
}
