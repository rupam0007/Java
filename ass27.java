import java.util.Scanner;
class convertion{
	int d;
	String hx="";
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Decimal Number:");
		d=sc.nextInt();
	}
	void check(){
		int n=d;
		int rim;
		char [] arr={'A','B','C','D','E','F'};
		while(n!=0){
			rim=n%16;
			if(rim<10){
			hx+=rim;
			}
			else{
				hx+=arr[rim - 10];
			}
			n/=16;
		}
	}
	void show(){
		System.out.println(hx);
	}
}

public class ass27{
	public static void main(String []args){
		convertion c = new convertion();
		c.input();
		c.check();
		c.show();
	}
}