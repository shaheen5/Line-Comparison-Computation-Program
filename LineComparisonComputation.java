package LineComparisonProblem;

import java.util.Scanner;

public class LineComparisonComputation {
	public static void main(String args[]) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc=new Scanner(System.in);
		System.out.println("Line 1 Co-ordinates:-");
		double length1=CalculateLength(sc);
		System.out.println("Length of Line 1 is "+length1);
		System.out.println("Line 2 Co-ordinates:-");
		double length2=CalculateLength(sc);
		System.out.println("Length of Line 2 is "+length2);
		checkEquality(length1,length2);
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

	static void checkEquality(double length1,double length2) {
		String length_1=Double.toString(length1);
		String length_2=Double.toString(length2);
		if (length_1.equals(length_2))
			System.out.println("Lines are Equal!");
		else
			System.out.println("Lines are not Equal!");
		
	}

}
