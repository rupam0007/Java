import java.util.Scanner;
public class ass5{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Volumn of Mixture: ");
		int n = a.nextInt();
		System.out.print("Volumn of Water: ");
		int n1 = a.nextInt();
		int milk = n - n1;
		int n3 = (n1*100)/n;
		int n4 = (milk*100)/n;

		System.out.print("Ratio: "+ n3+":"+n4);
	}
}