import java.util.Scanner;
public class ass3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
		int n = sc.nextInt();
		n = n/100;
		int r = n%10;

		System.out.println("3rd Last Digit: " + r);
	}
}