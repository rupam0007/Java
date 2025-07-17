import java.util.Scanner;
public class Hello{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the fisrt Number : ");
		int a = sc.nextInt();
		System.out.print("Enter the second Number : ");
		int b = sc.nextInt();
		int sum = a + b; 
		System.out.print("The Sum of "+ a + " and " + b + " is : ");
		System.out.println(sum);

	}
}