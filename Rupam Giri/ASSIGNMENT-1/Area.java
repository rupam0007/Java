import java.util.Scanner;
public class Area{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Radius of a Cylinder : ");
		double radius = sc.nextDouble();

		System.out.print("Enter the Height of a Cylinder : ");
		double height = sc.nextDouble();

		double sum = 2*3.14*radius*height; 
		System.out.print("The Area of "+ radius + " and " + height + " is : "+sum);
	}
}