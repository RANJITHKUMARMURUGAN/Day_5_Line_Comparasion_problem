import java.util.*;
public class Line_comparison {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double x1,x2,y1,y2;
		System.out.println("Enter the value of x1 = ");
		x1=scan.nextDouble();
		System.out.println("Enter the value of x2 = ");
		x2=scan.nextDouble();
		System.out.println("Enter the value of y1 = ");
		y1=scan.nextDouble();
		System.out.println("Enter the value of y2 = ");
		y2=scan.nextDouble();

		double length_of_line_1=Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)) );
		System.out.println("Length of the Line one : "+" "+length_of_line_1);

		System.out.println("Enter the value of x1 = ");
		x1=scan.nextDouble();
		System.out.println("Enter the value of x2 = ");
		x2=scan.nextDouble();
		System.out.println("Enter the value of y1 = ");
		y1=scan.nextDouble();
		System.out.println("Enter the value of y2 = ");
		y2=scan.nextDouble();

		double length_of_line_2=Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)) );
		System.out.println("Length of the Line one : "+" "+length_of_line_2);

		String str1,str2;
		str1=Double.toString(length_of_line_1);
		str2=Double.toString(length_of_line_2);

		System.out.println("Equality of two line using equal method "+" "+ str1.equals(str2));
		System.out.println("compare of two length is "+" "+str1.compareTo(str2));

	}
}
