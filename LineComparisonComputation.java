package LineComparisonProblem;

import java.util.Scanner;

public class LineComparisonComputation {
	public static void main(String args[]) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc=new Scanner(System.in);
		double length=CalculateLength(sc);
		System.out.println("Length of Line is "+length);
	}
	
	static double CalculateLength(Scanner sc) {
		System.out.println("Enter Point1 co-ordinates:-");
		System.out.println("Enter x1: ");
		double x1_coordinate=sc.nextDouble();
		System.out.println("Enter y1: ");
		double y1_coordinate=sc.nextDouble();
		System.out.println("Enter Point2 co-ordinates:-");
		System.out.println("Enter x2: ");
		double x2_coordinate=sc.nextDouble();
		System.out.println("Enter y2: ");
		double y2_coordinate=sc.nextDouble();
		return Math.sqrt((x2_coordinate-x1_coordinate)*(x2_coordinate-x1_coordinate)+(y2_coordinate-y1_coordinate)*(y2_coordinate-y1_coordinate)); 		
	}


}
