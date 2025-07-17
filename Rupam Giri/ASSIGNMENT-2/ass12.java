import java.util.Scanner;
public class ass12{
	public static void main(String[] args) {
	automorphic auto = new automorphic();
	auto.input();
	auto.check();
	}
}
class automorphic{
 	int num;

 	void input(){
 		Scanner a = new Scanner(System.in);
		System.out.print("Enter Value: ");
		num = a.nextInt();
 	}

 	void check(){
 		int f = 0;
 		int result,revNum,rev;
 		result = num*num;
 		rev = result % 10;
 		result = result/10; 
 		revNum = num % 10;
 		num = num/10; 
 		
 		if(rev == revNum){
 			f++;
 		}

 		rev = result % 10;		
 		result = result/10;		
 		revNum = num % 10;	
 		num = num/10; 
 		
 		if(rev == revNum){
 			f++;
 		}

 		if(f==2){
 			System.out.println("Automorphik");
 		}
 		else{
 			System.out.println("Not Automorphik");
 		}
 	}
 }