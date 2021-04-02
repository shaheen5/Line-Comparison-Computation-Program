package LineComparisonProblem;

import java.util.Scanner;

 class LineComparison {
	
	public  double CalculateLength(Scanner sc) {
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

	public void checkEquality(String length1,String length2) {
		if (length1.equals(length2))
			System.out.println("Lines are Equal!");
		else
			System.out.println("Lines are not Equal!");	
	}
	
	public void compareLines(String length1,String length2) {
		if(length1.compareTo(length2)==0)
			System.out.println("length1 is equal to length2 !!");
		else if(length1.compareTo(length2)<0)
			System.out.println("length1 is less than length2 !!");
		else
			System.out.println("length1 is greater than length2 !!");
	}

}

public class LineComparisonComputation{
	
	public static void main(String args[]) {
		System.out.println("Welcome to Line Comparison Computation Program");
		LineComparison obj=new LineComparison();
		Scanner sc=new Scanner(System.in);
		System.out.println("Line 1 Co-ordinates:-");
		double length1=obj.CalculateLength(sc);
		System.out.println("Length of Line 1 is "+length1);
		System.out.println("Line 2 Co-ordinates:-");
		double length2=obj.CalculateLength(sc);
		System.out.println("Length of Line 2 is "+length2);
		String length_1=Double.toString(length1);
		String length_2=Double.toString(length2);
		obj.checkEquality(length_1,length_2);
		obj.compareLines(length_1,length_2);
	}
}
