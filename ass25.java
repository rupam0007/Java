import java.util.Scanner;
class Staff{
	String name;
	int id;
	void addStaff(){
		Scanner as = new Scanner(System.in);
		System.out.print("Nmae: ");
		name=as.nextLine();
		System.out.print("\nID: ");
		id=as.nextInt();
	}
	void show(){
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
	}
}

class Officer extends Staff{
	String grade;
	void addOfficer(){
		super.addStaff();
		Scanner a = new Scanner(System.in);

     	System.out.print("Grade: ");
		grade=a.nextLine();
	}
	void showOfficer(){
		System.out.println("Officer Details :");
		show();
		System.out.println("Grade :"+grade);
	}
}

class Teacher extends Staff{
	String subject;
	void addOfficer(){
		super.addStaff();
		Scanner s = new Scanner(System.in);

     	System.out.print("Subject :");
		subject=s.nextLine();
	}
	void showTeacher(){
		System.out.println("Teacher Details :");
		show();
		System.out.println("Subject :"+subject);
	}
}

public class ass25{
	public static void main(String []args){
		Teacher teacher =new Teacher();
        System.out.println("Enter Teacher Details:");
        teacher.addOfficer();

        Officer officer =new Officer();
        System.out.println("\nEnter Officer Details:");
        officer.addOfficer();

        System.out.println("\n--- Displaying Details ---");
        teacher.showTeacher();
        officer.showOfficer();

	}
}
