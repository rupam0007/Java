import java.util.Scanner;
public class pronic{
		public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		int ispronic=0;

		for(int i=0;i<=n;i++){
			if(i * (i+1) == n){
				ispronic = 1;
				break;
			}
		}
		if(ispronic==1){
			System.out.println(n+" is a Pronic");
		}
		else{
			System.out.println(n+" is Not a Pronic");
	}	}
}	