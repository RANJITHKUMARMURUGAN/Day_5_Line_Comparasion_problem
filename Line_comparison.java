import java.util.*;
public class Line_comparison {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double x1,x2,y1,y2,length_of_line_1,length_of_line_2;
		System.out.println("Enter the value of x1 = ");
		x1=scan.nextDouble();
		System.out.println("Enter the value of x2 = ");
		x2=scan.nextDouble();
		
		System.out.println("Enter the value of y1 = ");
		y1=scan.nextDouble();
		System.out.println("Enter the value of y2 = ");
		y2=scan.nextDouble();
		length_of_line_1=Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)) );
		System.out.println("Length of the Line one : "+" "+length_of_line_1);
	}
}
