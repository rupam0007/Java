import java.util.Scanner;
public class ass4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Price: ");
		int n = sc.nextInt();
		int n1 = (n*20)/100;
		int n2 = n - n1;
		int n3 = (n2*30)/100;
		int n4 = n2 - n3;

		System.out.print("Final Price: "+ n4);
	}
}