 import java.util.Scanner;
public class ass11{
	public static void main(String[] args) {
	desimal desi = new desimal();
	desi.input();
	desi.check();
	}
}

class desimal{
	int num;

 	void input(){
 		Scanner a = new Scanner(System.in);
		System.out.print("Enter Value: ");
		num = a.nextInt();
 	}

 	void check(){
 		String result="";
 		int rim;
 		if(num == 0){
 			System.out.println("0000");
 		}
 		else{
 			while(num!=0){
 				rim = num % 2;
 				result = rim + result;
 				num /=2;
 			}
 		}
 		System.out.println(result);
 	}
}