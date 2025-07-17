import java.util.Scanner;
public class triangle{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Three Angle : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int anglecheck = (a + b + c);
		if(anglecheck==180){
			//System.out.println("It a triangle");
			if(a<90 && b<90 && c<90){
			System.out.println("Acute Angle");
			}
			else if(a>90 || b>90 || c>90){
			System.out.println("Obtuse Angle");
			}
			else{
			System.out.println("Neither Or Two");
			}

		}
		else{
		System.out.println("Invalid");

		}

	}
}