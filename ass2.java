class Student{
String name;
int roll;
Student(String name, int roll ){
	this.name=name;
	this.roll=roll;
}
void studentShow(){
	System.out.println("Name :"+name);
	System.out.println("Roll :"+roll);
}
}

class Test extends Student{
	int mark1,mark2,mark3;
Test(String name,int roll,int mark1,int mark2,int mark3){
		super(name,roll);
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	void showNumber(){
		System.out.println("Mark-1 :"+mark1);
		System.out.println("Mark-2 :"+mark2);
		System.out.println("Mark-3 :"+mark3);
	}
}
class Result extends Test{
	float total,persentage;
	Result(String name,int roll,int mark1,int mark2,int mark3){
		super(name,roll,mark1,mark2,mark3);
	}
	void calculate(){
		total = mark1+mark2+mark3;
		persentage = total/3;
	}
	void studentResult(){
		studentShow();
		showNumber();
		System.out.println("Total:"+total);
		System.out.println("Persentage:"+String.format("%.2f",persentage));
	}
}
public class ass2{
public static void main(String [] args){
	Result r = new Result("Rahim",12,76,88,80);
	r.calculate();
	r.studentResult();
}
}